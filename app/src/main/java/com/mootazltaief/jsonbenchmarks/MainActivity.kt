package com.mootazltaief.jsonbenchmarks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mootazltaief.json.gson.GsonParser
import com.mootazltaief.json.jackson.JacksonParser
import com.mootazltaief.json.kotlinx.KotlinParser
import com.mootazltaief.json.moshi.MoshiParser

class MainActivity : AppCompatActivity() {

    private lateinit var gsonParser: GsonParser
    private lateinit var moshiParser: MoshiParser
    private lateinit var moshiCodegenParser: MoshiParser
    private lateinit var kotlinParser: KotlinParser
    private lateinit var jacksonParser: JacksonParser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gsonParser = GsonParser(this)
        moshiParser = MoshiParser(this)
        moshiCodegenParser = MoshiParser(this)
        kotlinParser = KotlinParser(this)
        jacksonParser = JacksonParser(this)
    }

}