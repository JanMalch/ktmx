package io.github.janmalch.ktmx.kotlinx.html

import kotlinx.html.Tag
import kotlinx.html.TagConsumer

class TestableTag(
    override val attributes: MutableMap<String, String> = mutableMapOf(),
    override val emptyTag: Boolean = false,
    override val inlineTag: Boolean = false,
    override val namespace: String? = null,
    override val tagName: String = "test",
) : Tag {
    override val attributesEntries: Collection<Map.Entry<String, String>>
        get() = attributes.entries
    override val consumer: TagConsumer<*>
        get() = throw UnsupportedOperationException("consumer is not supported by the TestableTag.")
}

fun testAttributes(block: Tag.() -> Unit): Map<String, String> = TestableTag().apply(block).attributes
