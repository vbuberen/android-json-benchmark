package com.mootazltaief.json

import android.content.Context

object Utils {

    fun loadJSONFromAsset(context: Context, fileName: String): String {
        val inputStream = context.assets.open(fileName)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        return String(buffer)
    }

}