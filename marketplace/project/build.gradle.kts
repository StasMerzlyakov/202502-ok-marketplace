plugins {
    id("build-jvm")
}

dependencies {
    implementation(libs.kotlinxXXX.datetimeTestDep) // не требуется, для проверки подключения libs.versions.toml
    testImplementation(kotlin("test"))
}
