plugins {
    `kotlin-dsl`
     kotlin("jvm")
}

gradlePlugin {
    plugins {
        register("build-jvm") {
            id = "build-jvm"
            implementationClass = "ru.otus.kotlin.marketplace.plugins.BuildPluginJvm"
        }
        register("build-kmp") {
            id = "build-kmp"
            implementationClass = "ru.otus.kotlin.marketplace.plugins.BuildPluginMultiplatform"
        }
    }
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.kotlinter)
}

configurations.all {
    resolutionStrategy {
        failOnVersionConflict()
        force("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    }
}
