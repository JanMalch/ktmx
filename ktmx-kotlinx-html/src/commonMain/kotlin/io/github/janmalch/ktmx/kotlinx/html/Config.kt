package io.github.janmalch.ktmx.kotlinx.html

import io.github.janmalch.ktmx.core.HtmxConfig
import kotlinx.html.HEAD
import kotlinx.html.HtmlTagMarker
import kotlinx.html.meta
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * Adds the given config as a `<meta>` tag.
 *
 * ```html
 * <meta name="htmx-config" content='{"defaultSwapStyle":"outerHTML"}'>
 * ```
 *
 * See [Configuration Reference](https://htmx.org/reference/#config).
 */
@HtmlTagMarker
fun HEAD.htmxConfig(config: HtmxConfig, json: Json = Json) {
    meta(name = "htmx-config", content = json.encodeToString(config))
}
