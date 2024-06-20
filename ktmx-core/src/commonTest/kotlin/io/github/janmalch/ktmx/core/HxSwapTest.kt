package io.github.janmalch.ktmx.core

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class HxSwapTest {
    @Test
    fun `the DSL should return a valid hx-swap value`() {
        val expected = "innerHTML transition:true swap:1000ms settle:300ms ignoreTitle:true scroll:top show:bottom"
        val actual = HxSwap.InnerHTML {
            transition = true
            swap = 1.seconds
            settle = 300.milliseconds
            ignoreTitle = true
            scroll = HxSwap.Scroll.Top
            show = HxSwap.Scroll.Bottom
        }
        assertEquals(expected, actual)
    }
}