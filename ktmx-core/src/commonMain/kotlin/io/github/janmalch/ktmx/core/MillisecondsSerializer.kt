package io.github.janmalch.ktmx.core

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

/**
 * Serializes a [Duration] as a [Long] in [milliseconds].
 */
internal object MillisecondsSerializer : KSerializer<Duration> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ktmx.Milliseconds", PrimitiveKind.LONG)

    override fun deserialize(decoder: Decoder): Duration = decoder.decodeLong().milliseconds

    override fun serialize(encoder: Encoder, value: Duration) {
        encoder.encodeLong(value.inWholeMilliseconds)
    }
}