pluginManagement {
    val kotlinVersion: String by settings
    val kotlinterVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion
        id("org.jmailen.kotlinter") version kotlinterVersion
    }

}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "lessons"

include("m1")

