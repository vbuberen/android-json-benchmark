package com.mootazltaief.benchmark

import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import com.mootazltaief.json.gson.GsonFormatter
import com.mootazltaief.json.jackson.JacksonFormatter
import com.mootazltaief.json.kotlinx.KotlinFormatter
import com.mootazltaief.json.moshi.MoshiFormatter
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class JsonFormatersBenchmark {

    @get:Rule
    val benchmarkRule = BenchmarkRule()

    private val appContext = InstrumentationRegistry.getInstrumentation().targetContext
    private val gsonFormatter = GsonFormatter(appContext)
    private val moshiFormatter = MoshiFormatter(appContext)
    private val kotlinFormatter = KotlinFormatter(appContext)
    private val jacksonFormatter = JacksonFormatter(appContext)


    @Test
    fun benchmarkGsonFormatSample1() {
        benchmarkRule.measureRepeated {
            gsonFormatter.formatSample1()
        }
    }

    @Test
    fun benchmarkGsonFormatSample2() {
        benchmarkRule.measureRepeated {
            gsonFormatter.formatSample2()
        }
    }

    @Test
    fun benchmarkGsonFormatSample3() {
        benchmarkRule.measureRepeated {
            gsonFormatter.formatSample3()
        }
    }

    @Test
    fun benchmarkMoshiFormatSample1() {
        benchmarkRule.measureRepeated {
            moshiFormatter.formatSample1()
        }
    }

    @Test
    fun benchmarkMoshiFormatSample2() {
        benchmarkRule.measureRepeated {
            moshiFormatter.formatSample2()
        }
    }

    @Test
    fun benchmarkMoshiFormatSample3() {
        benchmarkRule.measureRepeated {
            moshiFormatter.formatSample3()
        }
    }

    @Test
    fun benchmarkKotlinWithSample1() {
        benchmarkRule.measureRepeated {
            kotlinFormatter.formatSample1()
        }
    }

    @Test
    fun benchmarkKotlinWithSample2() {
        benchmarkRule.measureRepeated {
            kotlinFormatter.formatSample2()
        }
    }

    @Test
    fun benchmarkKotlinWithSample3() {
        benchmarkRule.measureRepeated {
            kotlinFormatter.formatSample3()
        }
    }

    @Test
    fun benchmarkJacksonWithSample1() {
        benchmarkRule.measureRepeated {
            jacksonFormatter.formatSample1()
        }
    }

    @Test
    fun benchmarkJacksonWithSample2() {
        benchmarkRule.measureRepeated {
            jacksonFormatter.formatSample2()
        }
    }

    @Test
    fun benchmarkJacksonWithSample3() {
        benchmarkRule.measureRepeated {
            jacksonFormatter.formatSample3()
        }
    }
}