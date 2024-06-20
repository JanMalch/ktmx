package io.github.janmalch.ktmx.core

/**
 * Constants for all HTMX events.
 *
 * See [Event Reference](https://htmx.org/reference/#events).
 */
object HxEvent {
    /**
     * send this event to an element to abort a request
     */
    const val abort = "htmx:abort"

    /**
     * triggered after an AJAX request has completed processing a successful response
     */
    const val afterOnLoad = "htmx:afterOnLoad"

    /**
     * triggered after htmx has initialized a node
     */
    const val afterProcessNode = "htmx:afterProcessNode"

    /**
     * triggered after an AJAX request has completed
     */
    const val afterRequest = "htmx:afterRequest"

    /**
     * triggered after the DOM has settled
     */
    const val afterSettle = "htmx:afterSettle"

    /**
     * triggered after new content has been swapped in
     */
    const val afterSwap = "htmx:afterSwap"

    /**
     * triggered before htmx disables an element or removes it from the DOM
     */
    const val beforeCleanupElement = "htmx:beforeCleanupElement"

    /**
     * triggered before any response processing occurs
     */
    const val beforeOnLoad = "htmx:beforeOnLoad"

    /**
     * triggered before htmx initializes a node
     */
    const val beforeProcessNode = "htmx:beforeProcessNode"

    /**
     * triggered before an AJAX request is made
     */
    const val beforeRequest = "htmx:beforeRequest"

    /**
     * triggered before a swap is done, allows you to configure the swap
     */
    const val beforeSwap = "htmx:beforeSwap"

    /**
     * triggered just before an ajax request is sent
     */
    const val beforeSend = "htmx:beforeSend"

    /**
     * triggered before the request, allows you to customize parameters, headers
     */
    const val configRequest = "htmx:configRequest"

    /**
     * triggered after a trigger occurs on an element, allows you to cancel (or delay) issuing the AJAX request
     */
    const val confirm = "htmx:confirm"

    /**
     * triggered on an error during cache writing
     */
    const val historyCacheError = "htmx:historyCacheError"

    /**
     * triggered on a cache miss in the history subsystem
     */
    const val historyCacheMiss = "htmx:historyCacheMiss"

    /**
     * triggered on a unsuccessful remote retrieval
     */
    const val historyCacheMissError = "htmx:historyCacheMissError"

    /**
     * triggered on a successful remote retrieval
     */
    const val historyCacheMissLoad = "htmx:historyCacheMissLoad"

    /**
     * triggered when htmx handles a history restoration action
     */
    const val historyRestore = "htmx:historyRestore"

    /**
     * triggered before content is saved to the history cache
     */
    const val beforeHistorySave = "htmx:beforeHistorySave"

    /**
     * triggered when new content is added to the DOM
     */
    const val load = "htmx:load"

    /**
     * triggered when an element refers to a SSE event in its trigger, but no parent SSE source has been defined
     */
    const val noSSESourceError = "htmx:noSSESourceError"

    /**
     * triggered when an exception occurs during the onLoad handling in htmx
     */
    const val onLoadError = "htmx:onLoadError"

    /**
     * triggered after an out of band element as been swapped in
     */
    const val oobAfterSwap = "htmx:oobAfterSwap"

    /**
     * triggered before an out of band element swap is done, allows you to configure the swap
     */
    const val oobBeforeSwap = "htmx:oobBeforeSwap"

    /**
     * triggered when an out of band element does not have a matching ID in the current DOM
     */
    const val oobErrorNoTarget = "htmx:oobErrorNoTarget"

    /**
     * triggered after a prompt is shown
     */
    const val prompt = "htmx:prompt"

    /**
     * triggered after an url is pushed into history
     */
    const val pushedIntoHistory = "htmx:pushedIntoHistory"

    /**
     * triggered when an HTTP response error (non-200 or 300 response code) occurs
     */
    const val responseError = "htmx:responseError"

    /**
     * triggered when a network error prevents an HTTP request from happening
     */
    const val sendError = "htmx:sendError"

    /**
     * triggered when an error occurs with a SSE source
     */
    const val sseError = "htmx:sseError"

    /**
     * triggered when a SSE source is opened
     */
    const val sseOpen = "htmx:sseOpen"

    /**
     * triggered when an error occurs during the swap phase
     */
    const val swapError = "htmx:swapError"

    /**
     * triggered when an invalid target is specified
     */
    const val targetError = "htmx:targetError"

    /**
     * triggered when a request timeout occurs
     */
    const val timeout = "htmx:timeout"

    /**
     * triggered before an element is validated
     */
    const val validationValidate = "htmx:validation:validate"

    /**
     * triggered when an element fails validation
     */
    const val validationFailed = "htmx:validation:failed"

    /**
     * triggered when a request is halted due to validation errors
     */
    const val validationHalted = "htmx:validation:halted"

    /**
     * triggered when an ajax request aborts
     */
    const val xhrAbort = "htmx:xhr:abort"

    /**
     * triggered when an ajax request ends
     */
    const val xhrLoadend = "htmx:xhr:loadend"

    /**
     * triggered when an ajax request starts
     */
    const val xhrLoadstart = "htmx:xhr:loadstart"

    /**
     * triggered periodically during an ajax request that supports progress events
     */
    const val xhrProgress = "htmx:xhr:progress"
}
