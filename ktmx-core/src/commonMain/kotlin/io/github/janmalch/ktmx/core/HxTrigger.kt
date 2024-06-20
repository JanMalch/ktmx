package io.github.janmalch.ktmx.core

import kotlin.time.Duration

/**
 * Values for [Hx.trigger].
 */
object HxTrigger {

    /** `"load"` - triggered on load (useful for lazy-loading something) */
    const val load = "load"

    /**
     * `"revealed "` - triggered when an element is scrolled into the viewport (also useful for lazy-loading).
     * If you are using `overflow` in css like `overflow-y: scroll` you should use `intersect once` instead of `revealed`.
     */
    const val revealed = "load"

    /**
     * `"intersect"` - fires once when an element first intersects the viewport. This supports two additional options.
     *
     * @param root a CSS selector of the root element for intersection
     * @param threshold a floating point number between 0.0 and 1.0, indicating what amount of intersection to fire the event on
     */
    fun intersect(root: StandardCssSelector? = null, threshold: Float? = null): String {
        val base = "intersect"
        if (root == null && threshold == null) return base
        return StringBuilder(base).apply {
            if (root != null) {
                append(" root:$root")
            }
            if (threshold != null) {
                append(" threshold:${threshold.coerceIn(0f, 1f)}")
            }
        }.toString()
    }

    /**
     * By using the syntax `every <timing declaration>` you can have an element poll periodically.
     *
     * ```html
     * <div hx-get="/latest_updates" hx-trigger="every 1s">
     *   Nothing Yet!
     * </div>
     * ```
     */
    fun every(duration: Duration, conditional: String? = null): String {
        return "every ${duration.inWholeMilliseconds}ms" + (if (conditional == null) "" else " [$conditional]")
    }

    /**
     * Determines how events are queued if an event occurs while a request for another event is in flight.
     */
    enum class Queue(val value: String) {
        /** queue the first event */
        First("queue:first"),

        /** queue the last event (default) */
        Last("queue:last"),

        /** queue all events (issue a request for each event) */
        All("queue:all"),

        /** do not queue new events */
        None("queue:none"),
    }

    /**
     * Builds a value for [Hx.trigger].
     *
     * The returned string will start with the given [event].
     */
    operator fun invoke(event: String, block: Builder.() -> Unit): String =
        Builder(event).apply(block).build()

    /**
     * Builder class for [Hx.trigger] value.
     */
    class Builder internal constructor(private val event: String) {
        var ctrlKey: Boolean = false
        var shiftKey: Boolean = false
        var once: Boolean = false
        var changed: Boolean = false
        var delay: Duration? = null
        var throttle: Duration? = null
        var from: ExtendedCssSelector? = null
        var target: StandardCssSelector? = null
        var consume: Boolean = false
        var queue: Queue? = null

        internal fun build(): String {
            val base = when {
                ctrlKey && shiftKey -> "$event[ctrlKey&&shiftKey] "
                ctrlKey -> "$event[ctrlKey] "
                shiftKey -> "$event[shiftKey] "
                else -> "$event "
            }

            val options = listOfNotNull(
                "once".takeIf { once },
                "changed".takeIf { changed },
                delay?.let { "delay:${it.inWholeMilliseconds}ms" },
                throttle?.let { "throttle:${it.inWholeMilliseconds}ms" },
                from?.let { "from:$it" },
                target?.let { "target:$it" },
                "consume".takeIf { consume },
                queue?.value,
            ).joinToString(separator = " ")

            return base + options
        }
    }
}