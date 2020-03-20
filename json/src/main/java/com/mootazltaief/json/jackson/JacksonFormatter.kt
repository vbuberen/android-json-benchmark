package com.mootazltaief.json.jackson

import android.content.Context
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.mootazltaief.json.Utils

class JacksonFormatter(context: Context) {

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    private fun formatJson(jsonString: String): String {
        val mapper = ObjectMapper().apply {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
        val jsonObject = mapper.readValue(jsonString, Any::class.java)
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject)
    }

    fun formatSample1(): String = formatJson(sample1)

    fun formatSample2(): String = formatJson(sample2)

    fun formatSample3(): String = formatJson(sample3)


}