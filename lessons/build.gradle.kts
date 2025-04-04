subprojects {
    configurations.all {
        resolutionStrategy {
            failOnVersionConflict()
            force("org.jetbrains.kotlin:kotlin-stdlib:2.1.0")
            force("org.jetbrains.kotlin:kotlin-stdlib-common:2.1.0")
            force("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0")

            force("commons-io:commons-io:2.18.0")
            force("org.apache.commons:commons-lang3:3.17.0")
            force("commons-codec:commons-codec:1.17.2")

            force("org.apache.httpcomponents.core5:httpcore5:5.3.2")
            force("org.eclipse.jgit:org.eclipse.jgit:6.9.0.202403050737-r")

            force("org.eclipse.jgit:org.eclipse.jgit:6.9.0.202403050737-r")

            force("org.apache.commons:commons-compress:1.27.1")
            force("com.google.code.gson:gson:2.12.1")
            force("org.jetbrains:annotations:19.0.0")
        }
    }
}

