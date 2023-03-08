plugins {
    kotlin("multiplatform") apply false
    id("com.android.library") apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        mavenLocal()
    }
}

subprojects {
    version = findProperty("deploy.version") ?: property("compose.version")!!
}