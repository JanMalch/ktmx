package io.github.janmalch.ktmx.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class HttpVerb(val value: String) {
    @SerialName("get") Get("get"),
    @SerialName("head") Head("head"),
    @SerialName("post") Post("post"),
    @SerialName("put") Put("put"),
    @SerialName("delete") Delete("delete"),
    @SerialName("connect") Connect("connect"),
    @SerialName("options") Options("options"),
    @SerialName("trace") Trace("trace"),
    @SerialName("patch") Patch("patch");
}
