# Module ktmx-ktor

Provides route handler and HTML DSL extension for working with [ktor](https://ktor.io/)
and [kotlinx.html](https://github.com/Kotlin/kotlinx.html).

## Partial HTML responses

`respondHtmlPartial` enables partial HTML responses.

```kotlin
routing {
    get("/ktmx") {
        call.respondPartialHtml {
            // no html {} needed
            span {
                +"Success!"
            }
        }
    }
}
```

## Type-safe routing

`hxGet` and the likes provide interop with Ktor's [type-safe routing](https://ktor.io/docs/server-resources.html).

```kotlin
// Setup type-safe routing
@Resource("/hello")
class Hello(val name: String)

fun Application.configureRouting() {
    // Keep a reference to the ResourcesFormat handy (recommended)
    val rf = install(Resources).resourcesFormat
    
    routing {
        get("/recommended") {
            call.respondPartialHtml {
                button {
                    hxPost(rf, Hello("World"))
                    +"Click Me!"
                }
            }
        }
        get("/alternative") {
            call.respondPartialHtml {
                button {
                    // You can also get it from anywhere
                    hxPost(application.plugin(Resources).resourcesFormat, Hello("World"))
                    +"Click Me!"
                }
            }
        }
    }
}
```


