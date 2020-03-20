package com.mootazltaief.json.kotlinx

import android.content.Context
import com.mootazltaief.json.Utils
import com.mootazltaief.json.kotlinx.models.PhotosKotlin
import com.mootazltaief.json.kotlinx.models.UserKotlin
import kotlinx.serialization.builtins.list
import kotlinx.serialization.json.Json


class KotlinParser(context: Context) {

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    fun parseSample1(): List<UserKotlin> {
        return Json.parse(UserKotlin.serializer().list, sample1)
    }

    fun parseSample2(): List<UserKotlin> {
        return Json.parse(UserKotlin.serializer().list, sample2)
    }

    fun parseSample3(): PhotosKotlin {
        return Json.parse(PhotosKotlin.serializer(), sample3)
    }
}