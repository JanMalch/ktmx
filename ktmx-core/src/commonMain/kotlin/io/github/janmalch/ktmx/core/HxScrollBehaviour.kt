package io.github.janmalch.ktmx.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class HxScrollBehaviour(val value: String) {
    @SerialName("auto") Auto("auto"),
    @SerialName("instant") Instant("instant"),
    @SerialName("smooth") Smooth("smooth");
}
