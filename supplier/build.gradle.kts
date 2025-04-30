subprojects {
    configurations.all {
        resolutionStrategy {
            failOnVersionConflict()
            force("org.jetbrains.kotlin:kotlin-stdlib:2.1.0")
        }
    }
}

