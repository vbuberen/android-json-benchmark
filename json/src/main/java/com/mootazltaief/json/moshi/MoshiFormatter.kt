package com.mootazltaief.json.moshi

import android.content.Context
import com.mootazltaief.json.Utils
import com.squareup.moshi.JsonReader
import com.squareup.moshi.Moshi
import okio.Buffer
import java.io.EOFException

class MoshiFormatter(context: Context) {

    private val moshi = Moshi.Builder().build()

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    private fun formatJson(jsonString: String): String {
        return try {
            val buffer = Buffer().writeUtf8(jsonString)
            val jsonReader = JsonReader.of(buffer)
            val jsonValue = jsonReader.readJsonValue()
            val jsonAdapter = moshi.adapter(Any::class.java).serializeNulls().indent("  ")
            jsonAdapter.toJson(jsonValue)
        } catch (e: EOFException) {
            jsonString
        }
    }

    fun formatSample1(): String = formatJson(sample1)

    fun formatSample2(): String = formatJson(sample2)

    fun formatSample3(): String = formatJson(sample3)


}