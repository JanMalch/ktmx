package io.github.janmalch.ktmx.core

/**
 * Contains all HTMX attributes.
 *
 * See [Core Attribute Reference](https://htmx.org/reference/#attributes)
 * and [Additional Attribute Reference](https://htmx.org/reference/#attributes-additional).
 */
object Hx {

    // Core attributes

    /**
     * `"hx-get"` issues a `GET` to the specified URL.
     *
     * ```html
     * <div hx-get="/example">Get Some HTML</div>
     * ```
     *
     * [htmx.org/attributes/hx-get/](https://htmx.org/attributes/hx-get/)
     */
    const val get = "hx-get"

    /**
     * `"hx-post"` issues a `POST` to the specified URL.
     *
     * ```html
     * <button hx-post="/account/enable" hx-target="body">
     *   Enable Your Account
     * </button>
     * ```
     *
     * [htmx.org/attributes/hx-post/](https://htmx.org/attributes/hx-post/)
     */
    const val post = "hx-post"

    /**
     * `"hx-on:*"` handle events with inline scripts on elements.
     *
     * ```html
     * <div hx-on:click="alert('Clicked!')">Click</div>
     * ```
     *
     * [htmx.org/attributes/hx-on/](https://htmx.org/attributes/hx-on/)
     */
    fun on(event: String) = "hx-on:$event"

    /**
     * `"hx-push-url"` push a URL into the browser location bar to create history.
     *
     * ```html
     * <div hx-get="/account" hx-push-url="true">
     *   Go to My Account
     * </div>
     * ```
     *
     * [htmx.org/attributes/hx-push-url/](https://htmx.org/attributes/hx-push-url/)
     */
    const val pushUrl = "hx-push-url"

    /**
     * `"hx-select"` select content to swap in from a response.
     *
     * ```html
     * <div>
     *     <button hx-get="/info" hx-select="#info-details" hx-swap="outerHTML">
     *         Get Info!
     *     </button>
     * </div>
     * ```
     *
     * [htmx.org/attributes/hx-select/](https://htmx.org/attributes/hx-select/)
     */
    const val select = "hx-select"

    /**
     * `"hx-select-oob"` select content to swap in from a response, somewhere other than the target (out of band).
     *
     * ```html
     * <div>
     *    <div id="alert"></div>
     *     <button hx-get="/info"
     *             hx-select="#info-details"
     *             hx-swap="outerHTML"
     *             hx-select-oob="#alert">
     *         Get Info!
     *     </button>
     * </div>
     * ```
     *
     * [htmx.org/attributes/hx-select-oob/](https://htmx.org/attributes/hx-select-oob/)
     */
    const val selectOob = "hx-select-oob"


    /**
     * `"hx-swap"` controls how content will swap in (`outerHTML`, `beforeend`, `afterend`, …)
     *
     * ```html
     * <div hx-get="/example" hx-swap="afterend">Get Some HTML & Append It</div>
     * ```
     *
     * [htmx.org/attributes/hx-swap/](https://htmx.org/attributes/hx-swap/)
     *
     * @see HxSwap
     */
    const val swap = "hx-swap"

    /**
     * `"hx-swap-oob"` 	mark element to swap in from a response (out of band).
     *
     * ```html
     * <div>
     *  ...
     * </div>
     * <div id="alerts" hx-swap-oob="true">
     *     Saved!
     * </div>
     * ```
     *
     * [htmx.org/attributes/hx-swap-oob/](https://htmx.org/attributes/hx-swap-oob/)
     */
    const val swapOob = "hx-swap-oob"

    /**
     * `"hx-target"` specifies the target element to be swapped.
     *
     * ```html
     * <div>
     *     <div id="response-div"></div>
     *     <button hx-post="/register" hx-target="#response-div" hx-swap="beforeend">
     *         Register!
     *     </button>
     * </div>
     * ```
     *
     * [htmx.org/attributes/hx-target/](https://htmx.org/attributes/hx-target/)
     */
    const val target = "hx-target"

    /**
     * `"hx-trigger"` specifies the event that triggers the request.
     *
     * ```html
     * <div hx-get="/clicked" hx-trigger="click">Click Me</div>
     * ```
     *
     * [htmx.org/attributes/hx-trigger/](https://htmx.org/attributes/hx-trigger/)
     */
    const val trigger = "hx-trigger"

    /**
     * `"hx-vals"` add values to submit with the request (JSON format).
     *
     * ```html
     * <div hx-get="/example" hx-vals='{"myVal": "My Value"}'>Get Some HTML, Including A Value in the Request</div>
     *
     * <div hx-get="/example" hx-vals='js:{myVal: calculateValue()}'>Get Some HTML, Including a Dynamic Value from Javascript in the Request</div>
     * ```
     *
     * [htmx.org/attributes/hx-vals/](https://htmx.org/attributes/hx-vals/)
     */
    const val vals = "hx-vals"

    // Additional attributes // FIXME: polish docs

    /**
     * `"hx-boost"` add progressive enhancement for links and forms.
     *
     * [htmx.org/attributes/hx-boost/](https://htmx.org/attributes/hx-boost/)
     */
    const val boost = "hx-boost"

    /**
     * `"hx-confirm"` shows a confirm() dialog before issuing a request.
     *
     * [htmx.org/attributes/hx-confirm/](https://htmx.org/attributes/hx-confirm/)
     */
    const val confirm = "hx-confirm"

    /**
     * `"hx-delete"` issues a DELETE to the specified URL.
     *
     * [htmx.org/attributes/hx-delete/](https://htmx.org/attributes/hx-delete/)
     */
    const val delete = "hx-delete"

    /**
     * `"hx-disable"` disables htmx processing for the given node and any children nodes.
     *
     * [htmx.org/attributes/hx-disable/](https://htmx.org/attributes/hx-disable/)
     */
    const val disable = "hx-disable"

    /**
     * `"hx-disabled-elt"` adds the disabled attribute to the specified elements while a request is in flight.
     *
     * [htmx.org/attributes/hx-disabled-elt/](https://htmx.org/attributes/hx-disabled-elt/)
     */
    const val disabledElt = "hx-disabled-elt"

    /**
     * `"hx-disinherit"` control and disable automatic attribute inheritance for child nodes.
     *
     * [htmx.org/attributes/hx-disinherit/](https://htmx.org/attributes/hx-disinherit/)
     */
    const val disinherit = "hx-disinherit"

    /**
     * `"hx-encoding"` changes the request encoding type.
     *
     * [htmx.org/attributes/hx-encoding/](https://htmx.org/attributes/hx-encoding/)
     */
    const val encoding = "hx-encoding"

    /**
     * `"hx-ext"` extensions to use for this element.
     *
     * [htmx.org/attributes/hx-ext/](https://htmx.org/attributes/hx-ext/)
     */
    const val ext = "hx-ext"

    /**
     * `"hx-headers"` adds to the headers that will be submitted with the request.
     *
     * [htmx.org/attributes/hx-headers/](https://htmx.org/attributes/hx-headers/)
     */
    const val headers = "hx-headers"

    /**
     * `"hx-history"` prevent sensitive data being saved to the history cache.
     *
     * [htmx.org/attributes/hx-history/](https://htmx.org/attributes/hx-history/)
     */
    const val history = "hx-history"

    /**
     * `"hx-history-elt"` the element to snapshot and restore during history navigation.
     *
     * [htmx.org/attributes/hx-history-elt/](https://htmx.org/attributes/hx-history-elt/)
     */
    const val historyElt = "hx-history-elt"

    /**
     * `"hx-include"` include additional data in requests.
     *
     * [htmx.org/attributes/hx-include/](https://htmx.org/attributes/hx-include/)
     */
    const val include = "hx-include"

    /**
     * `"hx-indicator"` the element to put the htmx-request class on during the request.
     *
     * [htmx.org/attributes/hx-indicator/](https://htmx.org/attributes/hx-indicator/)
     */
    const val indicator = "hx-indicator"

    /**
     * `"hx-inherit"` control and enable automatic attribute inheritance for child nodes if it has been disabled by default.
     *
     * [htmx.org/attributes/hx-inherit/](https://htmx.org/attributes/hx-inherit/)
     */
    const val inherit = "hx-inherit"

    /**
     * `"hx-params"` filters the parameters that will be submitted with a request.
     *
     * [htmx.org/attributes/hx-params/](https://htmx.org/attributes/hx-params/)
     */
    const val params = "hx-params"

    /**
     * `"hx-patch"` issues a PATCH to the specified URL.
     *
     * [htmx.org/attributes/hx-patch/](https://htmx.org/attributes/hx-patch/)
     */
    const val patch = "hx-patch"

    /**
     * `"hx-preserve"` specifies elements to keep unchanged between requests.
     *
     * [htmx.org/attributes/hx-preserve/](https://htmx.org/attributes/hx-preserve/)
     */
    const val preserve = "hx-preserve"

    /**
     * `"hx-prompt"` shows a prompt() before submitting a request.
     *
     * [htmx.org/attributes/hx-prompt/](https://htmx.org/attributes/hx-prompt/)
     */
    const val prompt = "hx-prompt"

    /**
     * `"hx-put"` issues a PUT to the specified URL.
     *
     * [htmx.org/attributes/hx-put/](https://htmx.org/attributes/hx-put/)
     */
    const val put = "hx-put"

    /**
     * `"hx-replace-url"` replace the URL in the browser location bar.
     *
     * [htmx.org/attributes/hx-replace-url/](https://htmx.org/attributes/hx-replace-url/)
     */
    const val replaceUrl = "hx-replace-url"

    /**
     * `"hx-request"` configures various aspects of the request.
     *
     * [htmx.org/attributes/hx-request/](https://htmx.org/attributes/hx-request/)
     */
    const val request = "hx-request"

    /**
     * `"hx-sync"` control how requests made by different elements are synchronized.
     *
     * [htmx.org/attributes/hx-sync/](https://htmx.org/attributes/hx-sync/)
     */
    const val sync = "hx-sync"

    /**
     * `"hx-validate"` force elements to validate themselves before a request.
     *
     * [htmx.org/attributes/hx-validate/](https://htmx.org/attributes/hx-validate/)
     */
    const val validate = "hx-validate"
}
