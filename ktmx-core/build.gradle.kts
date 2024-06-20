plugins {
    id("module.publication")
    id("kotlin-multiplatform-conventions")
    alias(libs.plugins.kotlinSerialization)
}

dependencies {
    commonMainImplementation(libs.kotlinx.serialization.core)
    commonTestImplementation(libs.kotlinx.serialization.json)
}
