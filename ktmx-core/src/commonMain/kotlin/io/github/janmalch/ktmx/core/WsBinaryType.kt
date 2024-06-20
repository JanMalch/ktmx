package io.github.janmalch.ktmx.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Read more on [WebSocket.binaryType](https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/binaryType).
 */
@Serializable
enum class WsBinaryType(val value: String) {
    @SerialName("blob") Blob("blob"),
    @SerialName("arraybuffer") ArrayBuffer("arraybuffer");
}
