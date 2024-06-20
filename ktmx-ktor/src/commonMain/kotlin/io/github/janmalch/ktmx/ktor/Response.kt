package io.github.janmalch.ktmx.ktor

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.utils.io.charsets.*
import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML

suspend fun ApplicationCall.respondHtmlPartial(
    contentType: ContentType = ContentType.Text.Html.withCharset(Charsets.UTF_8),
    status: HttpStatusCode = HttpStatusCode.OK,
    prettyPrint: Boolean = false,
    xhtmlCompatible: Boolean = false,
    block: TagConsumer<Appendable>.() -> Unit
) {
    respondText(
        text = buildString {
            appendHTML(prettyPrint, xhtmlCompatible).apply(block)
        },
        status = status,
        contentType = contentType,
    )
}
