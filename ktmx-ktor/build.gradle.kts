plugins {
    id("module.publication")
    id("kotlin-multiplatform-conventions")
}

dependencies {
    commonMainImplementation(project(":ktmx-core"))
    commonMainImplementation(project(":ktmx-kotlinx-html"))
    commonMainImplementation(libs.ktor.server.core)
    commonMainImplementation(libs.ktor.server.resources)
    commonMainImplementation(libs.ktor.utils)
    commonMainImplementation(libs.kotlinx.html)
}
