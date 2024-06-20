package io.github.janmalch.ktmx.kotlinx.html

import io.github.janmalch.ktmx.core.Hx
import kotlin.test.Test
import kotlin.test.assertEquals

class AttributesTest {

    @Test
    fun `hxHeaders should correctly serialize a Map`() {
        val expected = mapOf("hx-headers" to "{\"foo\":\"bar\"}")
        val actual = testAttributes { hxHeaders(mapOf("foo" to "bar")) }
        assertEquals(expected, actual)
    }

    @Test
    fun `hxHeaders should be removed when called with an empty map`() {
        val actual = TestableTag(
            attributes = mutableMapOf(Hx.headers to "{\"foo\":\"bar\"}")
        ).apply { hxHeaders(emptyMap()) }.attributes
        assertEquals(emptyMap(), actual)
    }

    @Test
    fun `hxVals should correctly serialize a Map`() {
        val expected = mapOf("hx-vals" to "{\"foo\":\"bar\"}")
        val actual = testAttributes { hxVals(mapOf("foo" to "bar")) }
        assertEquals(expected, actual)
    }

    @Test
    fun `hxVals should be removed when called with an empty map`() {
        val actual = TestableTag(
            attributes = mutableMapOf(Hx.vals to "{\"foo\":\"bar\"}")
        ).apply { hxVals(emptyMap()) }.attributes
        assertEquals(emptyMap(), actual)
    }
}