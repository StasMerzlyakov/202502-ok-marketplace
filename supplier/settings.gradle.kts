dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

pluginManagement {
    includeBuild("../plugins")
    plugins {
        id("build-jvm") apply false
        id("build-kmp") apply false
    }
}


rootProject.name = "supplier"

include(":project")

