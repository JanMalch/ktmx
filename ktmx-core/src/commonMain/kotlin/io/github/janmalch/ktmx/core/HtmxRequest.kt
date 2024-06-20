package io.github.janmalch.ktmx.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.Duration

/**
 * Options for [Hx.request].
 */
@Serializable
data class HtmxRequest(
    /** the timeout for the request */
    @Serializable(MillisecondsSerializer::class)
    @SerialName("timeout")
    val timeout: Duration? = null,

    /** if the request will send credentials */
    @SerialName("credentials")
    val credentials: Boolean? = null,

    /** strips all headers from the request */
    @SerialName("noHeaders")
    val noHeaders: Boolean? = null,
)
