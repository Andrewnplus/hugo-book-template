pluginManagement {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/nplus-father/book-gradle-conventions")
            credentials {
                username = providers.gradleProperty("gpr.user").orNull
                    ?: System.getenv("GITHUB_ACTOR")
                    ?: "nplus-father"
                password = providers.gradleProperty("gpr.key").orNull
                    ?: System.getenv("GITHUB_TOKEN")
                    ?: System.getenv("GH_TOKEN")
                    ?: ""
            }
        }
        gradlePluginPortal()
    }
    plugins {
        id("com.andrewnplus.book") version "0.2.+"
    }
}

rootProject.name = "hugo-book-template"
