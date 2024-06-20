pluginManagement {
    includeBuild("convention-plugins")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ktmx"
include(":ktmx-core")
include(":ktmx-kotlinx-html")
include(":ktmx-ktor")
include(":ktor-filerev")
include(":ktor-filerev-html")
