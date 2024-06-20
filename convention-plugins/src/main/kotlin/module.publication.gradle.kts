plugins {
    `maven-publish`
    signing
}

publishing {
    // Configure all publications
    publications.withType<MavenPublication> {
        // Stub javadoc.jar artifact
        artifact(tasks.register("${name}JavadocJar", Jar::class) {
            archiveClassifier.set("javadoc")
            archiveAppendix.set(this@withType.name)
        })

        // Provide artifacts information required by Maven Central
        pom {
            name.set("Kotlin Multiplatform library for HTMX")
            description.set("Library to make HTMX easy to use in any Kotlin project")
            url.set("https://janmalch.github.io/ktmx")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set("JanMalch")
                    name.set("JanMalch")
                    // organization.set("JetBrains")
                    // organizationUrl.set("https://www.jetbrains.com")
                }
            }
            scm {
                url.set("https://github.com/JanMalch/ktmx")
            }
        }
    }
}

signing {
    if (project.hasProperty("signing.gnupg.keyName")) {
        useGpgCmd()
        sign(publishing.publications)
    }
}
