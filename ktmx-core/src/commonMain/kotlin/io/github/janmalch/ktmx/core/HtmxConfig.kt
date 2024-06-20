package io.github.janmalch.ktmx.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.Duration

// FIXME: verify
//   https://github.com/bigskysoftware/htmx/blob/a1915882c9a42060e72787fc285c238f539878ff/src/htmx.d.ts#L23

/**
 * Htmx has some configuration options that can be accessed either programmatically or declaratively.
 *
 * See [Configuration Reference](https://htmx.org/reference/#config).
 */
@Serializable
data class HtmxConfig(
    /** defaults to true, really only useful for testing */
    @SerialName("historyEnabled") val historyEnabled: Boolean? = null,
    /** defaults to 10 */
    @SerialName("historyCacheSize") val historyCacheSize: Int? = null,
    /**
     * defaults to false, if set to true htmx will issue a full page refresh on history misses
     * rather than use an AJAX request
     */
    @SerialName("refreshOnHistoryMiss") val refreshOnHistoryMiss: Boolean? = null,
    /** defaults to innerHTML */
    @SerialName("defaultSwapStyle") val defaultSwapStyle: HxSwap? = null,
    /** defaults to 0 */
    @Serializable(MillisecondsSerializer::class)
    @SerialName("defaultSwapDelay")
    val defaultSwapDelay: Duration? = null,
    /** defaults to 20 */
    @Serializable(MillisecondsSerializer::class)
    @SerialName("defaultSettleDelay")
    val defaultSettleDelay: Duration? = null,
    /** defaults to true (determines if the indicator styles are loaded) */
    @SerialName("includeIndicatorStyles") val includeIndicatorStyles: Boolean? = null,
    /** defaults to htmx-indicator */
    @SerialName("indicatorClass") val indicatorClass: String? = null,
    /** defaults to htmx-request */
    @SerialName("requestClass") val requestClass: String? = null,
    /** defaults to htmx-added */
    @SerialName("addedClass") val addedClass: String? = null,
    /** defaults to htmx-settling */
    @SerialName("settlingClass") val settlingClass: String? = null,
    /** defaults to htmx-swapping */
    @SerialName("swappingClass") val swappingClass: String? = null,
    /**
     * defaults to true, can be used to disable htmx’s use of eval for certain features (e.g.
     * trigger filters)
     */
    @SerialName("allowEval") val allowEval: Boolean? = null,
    /** defaults to true, determines if htmx will process script tags found in new content */
    @SerialName("allowScriptTags") val allowScriptTags: Boolean? = null,
    /** defaults to '', meaning that no nonce will be added to inline scripts */
    @SerialName("inlineScriptNonce") val inlineScriptNonce: String? = null,
    /**
     * defaults to ["class", "style", "width", "height"], the attributes to settle during the
     * settling phase
     */
    @SerialName("attributesToSettle") val attributesToSettle: Collection<String>? = null,
    /** defaults to full-jitter */
    @SerialName("wsReconnectDelay") val wsReconnectDelay: String? = null,
    /**
     * defaults to blob, the type of binary data being received over the WebSocket connection
     */
    @SerialName("wsBinaryType") val wsBinaryType: WsBinaryType? = null,
    /**
     * defaults to [hx-disable], [data-hx-disable], htmx will not process elements with this
     * attribute on it or a parent
     */
    @SerialName("disableSelector") val disableSelector: List<String>? = null,
    /**
     * defaults to false, allow cross-site Access-Control requests using credentials such as
     * cookies, authorization headers or TLS client certificates
     */
    @SerialName("withCredentials") val withCredentials: Boolean? = null,
    /**
     * defaults to 0, the number of milliseconds a request can take before automatically being
     * terminated
     */
    @Serializable(MillisecondsSerializer::class)
    @SerialName("timeout")
    val timeout: Duration? = null,
    /**
     * defaults to ‘smooth’, the behavior for a boosted link on page transitions. The allowed values
     * are auto and smooth. Smooth will smoothscroll to the top of the page while auto will behave
     * like a vanilla link.
     */
    @SerialName("scrollBehavior") val scrollBehavior: HxScrollBehaviour? = null,
    /**
     * if the focused element should be scrolled into view, defaults to false and can be overridden
     * using the focus-scroll swap modifier.
     */
    @SerialName("defaultFocusScroll") val defaultFocusScroll: Boolean? = null,
    /**
     * defaults to false, if set to true htmx will include a cache-busting parameter in GET requests
     * to avoid caching partial responses by the browser
     */
    @SerialName("getCacheBusterParam") val getCacheBusterParam: Boolean? = null,
    /** if set to true, htmx will use the View Transition API when swapping in new content. */
    @SerialName("globalViewTransitions") val globalViewTransitions: Boolean? = null,
    /**
     * defaults to ["get"], htmx will format requests with these methods by encoding their
     * parameters in the URL, not the request body
     */
    @SerialName("methodsThatUseUrlParams") val methodsThatUseUrlParams: Collection<HttpVerb>? = null,
    /**
     * defaults to false, if set to true will only allow AJAX requests to the same domain as the
     * current document
     */
    @SerialName("selfRequestsOnly") val selfRequestsOnly: Boolean? = null,
    /**
     * defaults to false, if set to true htmx will not update the title of the document when a title
     * tag is found in new content
     */
    @SerialName("ignoreTitle") val ignoreTitle: Boolean? = null,
    /**
     * defaults to true, whether or not the target of a boosted element is scrolled into the
     * viewport. If hx-target is omitted on a boosted element, the target defaults to body, causing
     * the page to scroll to the top.
     */
    @SerialName("scrollIntoViewOnBoost") val scrollIntoViewOnBoost: Boolean? = null,
    /**
     * defaults to null, the cache to store evaluated trigger specifications into, improving parsing
     * performance at the cost of more memory usage. You may define a simple object to use a
     * never-clearing cache, or implement your own system using a proxy object
     */
    @SerialName("triggerSpecsCache") val triggerSpecsCache: String? = null,
    /**
     * defaults to true, whether to process OOB swaps on elements that are nested within the main
     * response element. See Nested OOB Swaps.
     */
    @SerialName("allowNestedOobSwaps") val allowNestedOobSwaps: Boolean? = null,
    @SerialName("responseHandling") val responseHandling: Collection<ResponseHandling>? = null,
) {

    @Serializable
    data class ResponseHandling(
        @SerialName("code") val code: String? = null,
        @SerialName("swap") val swap: Boolean,
        @SerialName("error") val error: Boolean? = null,
        @SerialName("ignoreTitle") val ignoreTitle: Boolean? = null,
        @SerialName("select") val select: String? = null,
        @SerialName("target") val target: String? = null,
        @SerialName("swapOverride") val swapOverride: String? = null,
        @SerialName("event") val event: String? = null,
    )
}