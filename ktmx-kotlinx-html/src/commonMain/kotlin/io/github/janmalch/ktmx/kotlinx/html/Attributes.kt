package io.github.janmalch.ktmx.kotlinx.html

import io.github.janmalch.ktmx.core.*
import kotlinx.html.HtmlTagMarker
import kotlinx.html.Tag
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/** @see [Hx.get] */
@HtmlTagMarker
fun Tag.hxGet(value: String) {
    attributes[Hx.get] = value
}

/** @see [Hx.post] */
@HtmlTagMarker
fun Tag.hxPost(value: String) {
    attributes[Hx.post] = value
}

/** @see [Hx.on] */
@HtmlTagMarker
fun Tag.hxOn(event: String, value: String) {
    attributes[Hx.on(event)] = value
}

/** @see [Hx.pushUrl] */
@HtmlTagMarker
fun Tag.hxPushUrl(value: Boolean = true) {
    attributes[Hx.pushUrl] = value.toString()
}

/** @see [Hx.select] */
@HtmlTagMarker
fun Tag.hxSelect(value: String) {
    attributes[Hx.select] = value
}

/** @see [Hx.selectOob] */
@HtmlTagMarker
fun Tag.hxSelectOob(value: String) {
    attributes[Hx.selectOob] = value
}

/** @see [Hx.swap] */
@HtmlTagMarker
fun Tag.hxSwap(value: HxSwap, block: HxSwap.Builder.() -> Unit = {}) {
    attributes[Hx.swap] = value(block)
}

/** @see [Hx.swapOob] */
@HtmlTagMarker
fun Tag.hxSwapOob(value: Boolean = true) {
    attributes[Hx.swapOob] = value.toString()
}

/** @see [Hx.target] */
@HtmlTagMarker
fun Tag.hxTarget(value: String) {
    attributes[Hx.target] = value
}

/** @see [Hx.trigger] */
@HtmlTagMarker
fun Tag.hxTrigger(value: String) {
    attributes[Hx.trigger] = value
}

/** @see [Hx.trigger] */
@HtmlTagMarker
fun Tag.hxTrigger(value: String, block: HxTrigger.Builder.() -> Unit) {
    attributes[Hx.trigger] = HxTrigger(value, block)
}

/** @see [Hx.trigger] */
@HtmlTagMarker
fun Tag.hxTrigger(vararg values: String) {
    hxTrigger(values.joinToString(separator = ","))
}

/** @see [Hx.trigger] */
@HtmlTagMarker
fun Tag.hxTrigger(value: Iterable<String>) {
    hxTrigger(value.joinToString(separator = ","))
}

/** @see [Hx.vals] */
@HtmlTagMarker
inline fun <reified T : Any> Tag.hxVals(value: @Serializable T, json: Json = Json) {
    attributes[Hx.vals] = json.encodeToString(value)
}

/** @see [Hx.vals] */
@HtmlTagMarker
fun Tag.hxVals(value: Map<String, String>, json: Json = Json) {
    if (value.isEmpty()) {
        attributes -= Hx.vals
    } else {
        attributes[Hx.vals] = json.encodeToString(value)
    }
}

/**
 * Overwrites any existing [Hx.vals] on this tag.
 *
 * @see [Hx.vals]
 */
@HtmlTagMarker
fun Tag.hxVals(key: String, value: String, json: Json = Json) {
    hxVals(mapOf(key to value), json)
}

// Additional attributes

/** @see [Hx.boost] */
@HtmlTagMarker
fun Tag.hxBoost(value: Boolean = true) {
    attributes[Hx.boost] = value.toString()
}

/** @see [Hx.confirm] */
@HtmlTagMarker
fun Tag.hxConfirm(value: String) {
    attributes[Hx.confirm] = value
}

/** @see [Hx.delete] */
@HtmlTagMarker
fun Tag.hxDelete(value: String) {
    attributes[Hx.delete] = value
}

/** @see [Hx.disable] */
@HtmlTagMarker
fun Tag.hxDisable(value: Boolean = true) {
    if (value) {
        attributes[Hx.disable] = ""
    } else {
        attributes -= Hx.disable
    }
}

/** @see [Hx.disabledElt] */
@HtmlTagMarker
fun Tag.hxDisableElt(value: String) {
    attributes[Hx.disabledElt] = value
}

/**
 * @see [Hx.disable]
 * @see [Hx.disabledElt]
 */
@HtmlTagMarker
fun Tag.hxDisable(disabledElt: String, value: Boolean = true) {
    hxDisable(value)
    hxDisableElt(disabledElt)
}

/** @see [Hx.disinherit] */
@HtmlTagMarker
fun Tag.hxDisinherit(value: String) {
    attributes[Hx.disinherit] = value
}

/** @see [Hx.encoding] */
@HtmlTagMarker
fun Tag.hxEncoding(value: String) {
    attributes[Hx.encoding] = value
}

/** @see [Hx.ext] */
@HtmlTagMarker
fun Tag.hxExt(value: String) {
    attributes[Hx.ext] = value
}

/**
 * Overwrites any existing [Hx.headers] on this tag.
 *
 * @see [Hx.headers]
 */
@HtmlTagMarker
fun Tag.hxHeaders(value: Map<String, String>, json: Json = Json) {
    if (value.isEmpty()) {
        attributes -= Hx.headers
    } else {
        attributes[Hx.headers] = json.encodeToString(value)
    }
}

/**
 * Overwrites any existing [Hx.headers] on this tag.
 *
 * @see [Hx.headers]
 */
@HtmlTagMarker
fun Tag.hxHeaders(key: String, value: String, json: Json = Json) {
    hxHeaders(mapOf(key to value), json)
}

/** @see [Hx.history] */
@HtmlTagMarker
fun Tag.hxHistory(value: Boolean = false) {
    attributes[Hx.history] = value.toString()
}

/** @see [Hx.historyElt] */
@HtmlTagMarker
fun Tag.hxHistoryElt(value: Boolean = true) {
    if (value) {
        attributes[Hx.historyElt] = ""
    } else {
        attributes -= Hx.historyElt
    }
}

/** @see [Hx.include] */
@HtmlTagMarker
fun Tag.hxInclude(value: String) {
    attributes[Hx.include] = value
}

/** @see [Hx.indicator] */
@HtmlTagMarker
fun Tag.hxIndicator(value: String) {
    attributes[Hx.indicator] = value
}

/** @see [Hx.inherit] */
@HtmlTagMarker
fun Tag.hxInherit(value: String) {
    attributes[Hx.inherit] = value
}

/** @see [Hx.params] */
@HtmlTagMarker
fun Tag.hxParams(value: String) {
    attributes[Hx.params] = value
}

/** @see [Hx.patch] */
@HtmlTagMarker
fun Tag.hxPatch(value: String) {
    attributes[Hx.patch] = value
}

/** @see [Hx.preserve] */
@HtmlTagMarker
fun Tag.hxPreserve(value: Boolean = true) {
    if (value) {
        attributes[Hx.preserve] = ""
    } else {
        attributes -= Hx.preserve
    }
}

/** @see [Hx.prompt] */
@HtmlTagMarker
fun Tag.hxPrompt(value: String) {
    attributes[Hx.prompt] = value
}

/** @see [Hx.put] */
@HtmlTagMarker
fun Tag.hxPut(value: String) {
    attributes[Hx.put] = value
}

/** @see [Hx.replaceUrl] */
@HtmlTagMarker
fun Tag.hxReplaceUrl(value: Boolean) {
    attributes[Hx.replaceUrl] = value.toString()
}

/** @see [Hx.replaceUrl] */
@HtmlTagMarker
fun Tag.hxReplaceUrl(value: String) {
    attributes[Hx.replaceUrl] = value
}

/** @see [Hx.request] */
@HtmlTagMarker
fun Tag.hxRequest(value: HtmxRequest, json: Json = Json) {
    attributes[Hx.request] = json.encodeToString(value)
}

/** @see [Hx.sync] */
@HtmlTagMarker
fun Tag.hxSync(value: String, strategy: HxSync? = null) {
    attributes[Hx.sync] = (value + strategy?.value.orEmpty())
}

/** @see [Hx.validate] */
@HtmlTagMarker
fun Tag.hxValidate(value: Boolean = true) {
    attributes[Hx.validate] = value.toString()
}

