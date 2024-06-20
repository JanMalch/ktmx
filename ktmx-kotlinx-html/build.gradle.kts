plugins {
    id("module.publication")
    id("kotlin-multiplatform-conventions")
}

dependencies {
    commonMainImplementation(project(":ktmx-core"))
    commonMainImplementation(libs.kotlinx.html)
    commonMainImplementation(libs.kotlinx.serialization.json)
}
