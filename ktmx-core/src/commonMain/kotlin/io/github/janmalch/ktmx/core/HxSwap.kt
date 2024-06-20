package io.github.janmalch.ktmx.core


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.Duration

/**
 * The possible values of the [Hx.swap] attribute.
 */
@Serializable
enum class HxSwap(val value: String) {
    /** Replace the inner html of the target element */
    @SerialName("innerHTML")
    InnerHTML("innerHTML"),

    /** Replace the entire target element with the response */
    @SerialName("outerHTML")
    OuterHTML("outerHTML"),

    /** Replace the text content of the target element, without parsing the response as HTML */
    @SerialName("textContent")
    TextContent("textContent"),

    /** Insert the response before the target element */
    @SerialName("beforebegin")
    BeforeBegin("beforebegin"),

    /** Insert the response before the first child of the target element */
    @SerialName("afterbegin")
    AfterBegin("afterbegin"),

    /** Insert the response after the last child of the target element */
    @SerialName("beforeend")
    BeforeEnd("beforeend"),

    /** Insert the response after the target element */
    @SerialName("afterend")
    AfterEnd("afterend"),

    /** Deletes the target element regardless of the response */
    @SerialName("delete")
    Delete("delete"),

    /** Does not append content from response (out of band items will still be processed). */
    @SerialName("none")
    None("none");

    /**
     * Builds a new `hx-swap` value based on this style.
     *
     * ```kotlin
     * HxSwap.AfterEnd {
     *     transition = true
     * }
     * ```
     */
    operator fun invoke(block: Builder.() -> Unit): String = Builder(this).apply(block).build()

    /**
     * Builder class for [Hx.swap] value.
     */
    class Builder internal constructor(private val hxSwap: HxSwap) {
        var transition: Boolean = false

        /**
         * You can modify the amount of time that htmx will wait after receiving a response to [Hx.swap] the content by including a `swap` modifier:
         *
         * ```html
         * <!-- this will wait 1s before doing the swap after it is received -->
         * <div hx-get="/example" hx-swap="innerHTML swap:1s">Get Some HTML & Append It</div>
         * ```
         */
        var swap: Duration? = null

        /**
         * You can modify the time between the [Hx.swap] and the settle logic by including a `settle` modifier.
         *
         * ```html
         * <!-- this will wait 1s before doing the swap after it is received -->
         * <div hx-get="/example" hx-swap="innerHTML settle:1s">Get Some HTML & Append It</div>
         * ```
         */
        var settle: Duration? = null

        /**
         * By default, htmx will update the title of the page if it finds a `<title>` tag in the response content.
         * You can turn off this behavior by setting the `ignoreTitle` option to true.
         */
        var ignoreTitle: Boolean = false
        var scroll: Scroll? = null
        var show: Scroll? = null

        internal fun build(): String {
            val options = listOfNotNull(
                "transition:true".takeIf { transition },
                swap?.let { "swap:${it.inWholeMilliseconds}ms" },
                settle?.let { "settle:${it.inWholeMilliseconds}ms" },
                "ignoreTitle:true".takeIf { ignoreTitle },
                scroll?.let { "scroll:${it.value}" },
                show?.let { "show:${it.value}" },
            )

            return if (options.isEmpty()) hxSwap.value
            else hxSwap.value + " " + options.joinToString(separator = " ")
        }
    }

    enum class Scroll(val value: String) {
        Top("top"),
        Bottom("bottom"),
    }
}
