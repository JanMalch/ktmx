package io.github.janmalch.ktmx.core

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.seconds


class HtmxConfigSerializationTest {

    @Test
    fun `should serialize defaultSwapDelay as a plain number in milliseconds`() {
        val expected = "{\"defaultSwapDelay\":1000,\"methodsThatUseUrlParams\":[\"get\",\"post\"]}"
        val actual = Json.encodeToString(HtmxConfig(
            defaultSwapDelay = 1.seconds,
            methodsThatUseUrlParams = setOf(HttpVerb.Get, HttpVerb.Post),
        ))
        assertEquals(expected, actual)
    }
}
