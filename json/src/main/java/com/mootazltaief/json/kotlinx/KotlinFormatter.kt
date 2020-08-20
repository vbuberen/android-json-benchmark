package com.mootazltaief.json.kotlinx

import android.content.Context
import com.mootazltaief.json.Utils
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class KotlinFormatter(context: Context) {

    private val jsonSerializer = Json {
        prettyPrint = true
    }

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    private fun formatJson(jsonString: String): String {
        val parsedJson = jsonSerializer.parseToJsonElement(jsonString)
        return jsonSerializer.encodeToString(parsedJson)
    }

    fun formatSample1(): String = formatJson(sample1)

    fun formatSample2(): String = formatJson(sample2)

    fun formatSample3(): String = formatJson(sample3)

}