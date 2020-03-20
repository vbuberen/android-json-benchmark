package com.mootazltaief.benchmark

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.mootazltaief.json.gson.GsonParser
import com.mootazltaief.json.jackson.JacksonParser
import com.mootazltaief.json.kotlinx.KotlinParser
import com.mootazltaief.json.moshi.MoshiParser
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class JsonParsersBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    private val appContext = InstrumentationRegistry.getInstrumentation().targetContext
    private val gsonParser = GsonParser(appContext)
    private val moshiParser = MoshiParser(appContext)
    private val kotlinParser = KotlinParser(appContext)
    private val jacksonParser = JacksonParser(appContext)


    @Test
    fun benchmarkGsonParseSample1() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample1()
        }
    }

    @Test
    fun benchmarkGsonParseSample2() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample2()
        }
    }

    @Test
    fun benchmarkGsonParseSample3() {
        benchmarkRule.measureRepeated {
            gsonParser.parseSample3()
        }
    }

    @Test
    fun benchmarkMoshiParseSample1() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample1()
        }
    }

    @Test
    fun benchmarkMoshiParseSample2() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample2()
        }
    }

    @Test
    fun benchmarkMoshiParseSample3() {
        benchmarkRule.measureRepeated {
            moshiParser.parseSample3()
        }
    }

    @Test
    fun benchmarkKotlinParseSample1() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample1()
        }
    }

    @Test
    fun benchmarkKotlinParseSample2() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample2()
        }
    }

    @Test
    fun benchmarkKotlinParseSample3() {
        benchmarkRule.measureRepeated {
            kotlinParser.parseSample3()
        }
    }

    @Test
    fun benchmarkJacksonParseSample1() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample1()
        }
    }

    @Test
    fun benchmarkJacksonParseSample2() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample2()
        }
    }

    @Test
    fun benchmarkJacksonParseSample3() {
        benchmarkRule.measureRepeated {
            jacksonParser.parseSample3()
        }
    }
}