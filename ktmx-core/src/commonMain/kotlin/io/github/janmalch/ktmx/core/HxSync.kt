package io.github.janmalch.ktmx.core

/**
 * The possible strategy values of the [Hx.sync] attribute.
 */
enum class HxSync(val value: String) {
    /** drop (ignore) this request if an existing request is in flight (the default) */
    Drop("drop"),

    /** drop (ignore) this request if an existing request is in flight, and, if that is not the case, abort this request if another request occurs while it is still in flight */
    Abort("abort"),

    /** abort the current request, if any, and replace it with this request */
    Replace("replace"),

    /** place this request in the request queue associated with the given element */
    Queue("queue"),

    /** queue the first request to show up while a request is in flight */
    QueueFirst("queue first"),

    /** queue the last request to show up while a request is in flight */
    QueueLast("queue last"),

    /** queue all requests that show up while a request is in flight */
    QueueAll("queue all"),
}