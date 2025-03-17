plugins {
    kotlin("jvm")
    id("org.jmailen.kotlinter")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
dependencies {
    testImplementation(kotlin("test"))
}
