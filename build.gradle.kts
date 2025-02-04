import org.jetbrains.dokka.DokkaConfiguration.Visibility
import org.jetbrains.dokka.gradle.DokkaTaskPartial
import java.net.URL

plugins {
    id("root.publication")
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.kotlinSerialization).apply(false)
    alias(libs.plugins.kotlinPowerAssert).apply(false)
    alias(libs.plugins.kotlinxKover).apply(false)
    alias(libs.plugins.dokka)
    alias(libs.plugins.bcv)

    // for demo-app
    // kotlin("jvm").version(libs.versions.kotlin).apply(false)
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")

    tasks.withType<DokkaTaskPartial>().configureEach {
        dokkaSourceSets.configureEach {
            includes.from(layout.projectDirectory.file(("README.md")))
            documentedVisibilities.set(setOf(Visibility.PUBLIC, Visibility.PROTECTED))
            externalDocumentationLink("https://api.ktor.io/")

            sourceLink {
                localDirectory.set(projectDir.resolve("src"))
                remoteUrl.set(URL("https://github.com/janmalch/ktor-revfile/tree/main/${projectDir.name}/src"))
                remoteLineSuffix.set("#L")
            }
        }
    }
}

// Configures only the parent MultiModule task,
// this will not affect subprojects
tasks.dokkaHtmlMultiModule {
    moduleName.set("KTMX")
}