package io.github.janmalch.ktmx.core

/**
 * Constants for all HTMX CSS classes.
 *
 * See [CSS Class Reference](https://htmx.org/reference/#classes).
 */
object HxClass {

    /**
     * `"htmx-added"`
     *
     * Applied to a new piece of content before it is swapped, removed after it is settled
     */
    const val added = "htmx-added"

    /**
     * `"htmx-indicator"`
     *
     * A dynamically generated class that will toggle visible (opacity:1) when a [request] class is present.
     */
    const val indicator = "htmx-indicator"

    /**
     * `"htmx-request"`
     *
     * Applied to either the element or the element specified with [Hx.indicator] while a request is ongoing.
     */
    const val request = "htmx-request"

    /**
     * `"htmx-settling"`
     *
     * Applied to a target after content is swapped, removed after it is settled. The duration can be modified via [Hx.swap].
     */
    const val settling = "htmx-settling"

    /**
     * `"htmx-swapping"`
     *
     * Applied to a target before any content is swapped, removed after it is swapped. The duration can be modified via [Hx.swap].
     */
    const val swapping = "htmx-swapping"
}