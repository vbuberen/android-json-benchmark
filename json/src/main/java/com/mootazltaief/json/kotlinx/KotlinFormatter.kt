package com.mootazltaief.json.kotlinx

import android.content.Context
import com.mootazltaief.json.Utils
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.stringify

@UnstableDefault
class KotlinFormatter(context: Context) {

    private val jsonConfig = JsonConfiguration(prettyPrint = true)
    private val jsonSerializer = Json(jsonConfig)

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    @kotlinx.serialization.ImplicitReflectionSerializer
    private fun formatJson(jsonString: String): String {
        val parsedJson = jsonSerializer.parseJson(jsonString)
        return jsonSerializer.stringify(parsedJson)
    }

    @kotlinx.serialization.ImplicitReflectionSerializer
    fun formatSample1(): String = formatJson(sample1)

    @kotlinx.serialization.ImplicitReflectionSerializer
    fun formatSample2(): String = formatJson(sample2)

    @kotlinx.serialization.ImplicitReflectionSerializer
    fun formatSample3(): String = formatJson(sample3)

}