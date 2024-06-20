package io.github.janmalch.ktmx.core

/** An extended CSS selector for HTMX, like [Css.window] or [Css.next]. */
typealias ExtendedCssSelector = String
/** A standard CSS selector. */
typealias StandardCssSelector = String

/**
 * Namespace for CSS selectors for HTMX.
 */
object Css {
    const val body: StandardCssSelector = "body"
    const val document: ExtendedCssSelector = "document"
    const val window: ExtendedCssSelector = "window"
    const val next: ExtendedCssSelector = "next"
    const val previous: ExtendedCssSelector = "previous"
    fun closest(value: StandardCssSelector): ExtendedCssSelector = "closest $value"
    fun find(value: StandardCssSelector): ExtendedCssSelector = "find $value"
    fun next(value: StandardCssSelector): ExtendedCssSelector = "next $value"
    fun previous(value: StandardCssSelector): ExtendedCssSelector = "previous $value"
}
