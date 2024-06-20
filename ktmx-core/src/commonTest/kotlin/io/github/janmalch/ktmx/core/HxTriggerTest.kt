package io.github.janmalch.ktmx.core

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class HxTriggerTest {
    @Test
    fun `the DSL should return a valid hx-trigger value`() {
        val expected =
            "click[ctrlKey&&shiftKey] once changed delay:1000ms throttle:300ms from:document target:#app consume queue:all"
        val actual = HxTrigger("click") {
            ctrlKey = true
            shiftKey = true
            once = true
            changed = true
            delay = 1.seconds
            throttle = 300.milliseconds
            from = Css.document
            target = "#app"
            consume = true
            queue = HxTrigger.Queue.All
        }
        assertEquals(expected, actual)
    }
}