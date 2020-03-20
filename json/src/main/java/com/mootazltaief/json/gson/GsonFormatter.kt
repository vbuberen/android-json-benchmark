package com.mootazltaief.json.gson

import android.content.Context
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.JsonParseException
import com.google.gson.JsonParser
import com.mootazltaief.json.Utils

class GsonFormatter(context: Context) {

    private val gson = GsonBuilder()
        .serializeNulls()
        .setPrettyPrinting()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create()

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    private fun formatJson(jsonString: String): String {
        return try {
            val je = JsonParser.parseString(jsonString)
            gson.toJson(je)
        } catch (e: JsonParseException) {
            jsonString
        }
    }

    fun formatSample1(): String = formatJson(sample1)

    fun formatSample2(): String = formatJson(sample2)

    fun formatSample3(): String = formatJson(sample3)


}