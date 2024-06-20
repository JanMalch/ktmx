package io.github.janmalch.ktmx.ktor

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML
import java.io.Writer

suspend fun ApplicationCall.respondHtmlPartialWriter(
    contentType: ContentType = ContentType.Text.Html.withCharset(Charsets.UTF_8),
    status: HttpStatusCode = HttpStatusCode.OK,
    prettyPrint: Boolean = false,
    xhtmlCompatible: Boolean = false,
    block: TagConsumer<Writer>.() -> Unit
) {
    respondTextWriter(contentType = contentType, status = status) {
        appendHTML(prettyPrint, xhtmlCompatible).apply(block)
    }
}
