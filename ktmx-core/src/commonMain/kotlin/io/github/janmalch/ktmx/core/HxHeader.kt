package io.github.janmalch.ktmx.core

/**
 * Constants for all HTMX HTTP [Req]uest and [Res]ponse headers.
 *
 * See [HTTP Header Reference](https://htmx.org/reference/#headers).
 */
object HxHeader {
    /**
     * Constants for all HTMX HTTP request headers.
     *
     * See [HTTP Header Reference](https://htmx.org/reference/#headers).
     */
    object Req {

        /**
         * indicates that the request is via an element using hx-boost
         */
        const val boosted = "HX-Boosted"

        /**
         * the current URL of the browser
         */
        const val currentUrl = "HX-Current-URL"

        /**
         * “true” if the request is for history restoration after a miss in the local history cache
         */
        const val historyRestoreRequest = "HX-History-Restore-Request"

        /**
         * the user response to an hx-prompt
         */
        const val prompt = "HX-Prompt"

        /**
         * always “true”
         */
        const val request = "HX-Request"

        /**
         * the id of the target element if it exists
         */
        const val target = "HX-Target"

        /**
         * the name of the triggered element if it exists
         */
        const val triggerName = "HX-Trigger-Name"

        /**
         * the id of the triggered element if it exists
         */
        const val trigger = "HX-Trigger"
    }

    /**
     * Constants for all HTMX HTTP response headers.
     *
     * See [HTTP Header Reference](https://htmx.org/reference/#headers).
     */
    object Res {
        /**
         * allows you to do a client-side redirect that does not do a full page reload
         */
        const val location = "HX-Location"

        /**
         * pushes a new url into the history stack
         */
        const val pushUrl = "HX-Push-Url"

        /**
         * can be used to do a client-side redirect to a new location
         */
        const val redirect = "HX-Redirect"

        /**
         * if set to “true” the client-side will do a full refresh of the page
         */
        const val refresh = "HX-Refresh"

        /**
         * replaces the current URL in the location bar
         */
        const val replaceUrl = "HX-Replace-Url"

        /**
         * allows you to specify how the response will be swapped. See hx-swap for possible values
         */
        const val reswap = "HX-Reswap"

        /**
         * a CSS selector that updates the target of the content update to a different element on the page
         */
        const val retarget = "HX-Retarget"

        /**
         * a CSS selector that allows you to choose which part of the response is used to be swapped in. Overrides an existing hx-select on the triggering element
         */
        const val reselect = "HX-Reselect"

        /**
         * allows you to trigger client-side events
         */
        const val trigger = "HX-Trigger"

        /**
         * allows you to trigger client-side events after the settle step
         */
        const val triggerAfterSettle = "HX-Trigger-After-Settle"

        /**
         * allows you to trigger client-side events after the swap step
         */
        const val triggerAfterSwap = "HX-Trigger-After-Swap"
    }
}