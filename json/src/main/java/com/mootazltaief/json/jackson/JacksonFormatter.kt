package com.mootazltaief.json.jackson

import android.content.Context
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.mootazltaief.json.Utils

class JacksonFormatter(context: Context) {

    private val jacksonObjectMapper = ObjectMapper().apply {
        enable(SerializationFeature.INDENT_OUTPUT)
    }

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    private fun formatJson(jsonString: String): String {
        val jsonObject = jacksonObjectMapper.readValue(jsonString, Any::class.java)
        return jacksonObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject)
    }

    fun formatSample1(): String = formatJson(sample1)

    fun formatSample2(): String = formatJson(sample2)

    fun formatSample3(): String = formatJson(sample3)


}