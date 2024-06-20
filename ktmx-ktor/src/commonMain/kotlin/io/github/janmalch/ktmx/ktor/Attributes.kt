package io.github.janmalch.ktmx.ktor

import io.github.janmalch.ktmx.core.Hx
import io.github.janmalch.ktmx.kotlinx.html.hxGet
import io.github.janmalch.ktmx.kotlinx.html.hxPost
import io.github.janmalch.ktmx.kotlinx.html.hxPatch
import io.github.janmalch.ktmx.kotlinx.html.hxPut
import io.github.janmalch.ktmx.kotlinx.html.hxDelete
import io.ktor.resources.href
import io.ktor.resources.serialization.ResourcesFormat
import io.ktor.server.application.ApplicationCall
import io.ktor.server.application.plugin
import io.ktor.server.resources.Resources
import io.ktor.util.pipeline.Pipeline
import kotlinx.html.HtmlTagMarker
import kotlinx.html.Tag

/**
 * @see [Hx.get]
 * @see Resources
 */
@HtmlTagMarker
inline fun <reified T : Any> Tag.hxGet(resourcesFormat: ResourcesFormat, resource: T) {
    hxGet(href(resourcesFormat, resource))
}

/**
 * @see [Hx.post]
 * @see Resources
 */
@HtmlTagMarker
inline fun <reified T : Any> Tag.hxPost(resourcesFormat: ResourcesFormat, resource: T) {
    hxPost(href(resourcesFormat, resource))
}

/**
 * @see [Hx.put]
 * @see Resources
 */
@HtmlTagMarker
inline fun <reified T : Any> Tag.hxPut(resourcesFormat: ResourcesFormat, resource: T) {
    hxPut(href(resourcesFormat, resource))
}

/**
 * @see [Hx.patch]
 * @see Resources
 */
@HtmlTagMarker
inline fun <reified T : Any> Tag.hxPatch(resourcesFormat: ResourcesFormat, resource: T) {
    hxPatch(href(resourcesFormat, resource))
}

/**
 * @see [Hx.delete]
 * @see Resources
 */
@HtmlTagMarker
inline fun <reified T : Any> Tag.hxDelete(resourcesFormat: ResourcesFormat, resource: T) {
    hxDelete(href(resourcesFormat, resource))
}