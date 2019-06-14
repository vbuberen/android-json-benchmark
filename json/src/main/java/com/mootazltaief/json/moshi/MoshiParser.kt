package com.mootazltaief.json.moshi

import android.content.Context
import com.mootazltaief.json.Utils
import com.mootazltaief.json.moshi.models.PhotosMoshi
import com.mootazltaief.json.moshi.models.UserMoshi
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types.newParameterizedType

class MoshiParser(context: Context) {

    private val sample1 = Utils.loadJSONFromAsset(context, "sample1.json")
    private val sample2 = Utils.loadJSONFromAsset(context, "sample2.json")
    private val sample3 = Utils.loadJSONFromAsset(context, "sample3.json")

    val moshi = Moshi.Builder().build()

    private var moshiUserListType = newParameterizedType(List::class.java, UserMoshi::class.java)

    private val moshiUserAdapter: JsonAdapter<List<UserMoshi>> = moshi.adapter(moshiUserListType)

    private val moshiPhotosAdapter: JsonAdapter<PhotosMoshi> = moshi.adapter(PhotosMoshi::class.java)


    fun parseSample1(): List<UserMoshi>? {
        return moshiUserAdapter.fromJson(sample1)
    }

    fun parseSample2(): List<UserMoshi>? {
        return moshiUserAdapter.fromJson(sample2)
    }

    fun parseSample3(): PhotosMoshi? {
        return moshiPhotosAdapter.fromJson(sample3)
    }
}