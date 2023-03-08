plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

group = "com.example"
version = "1.0-SNAPSHOT"

kotlin {
    android()
    jvm("desktop") {
        jvmToolchain(8)
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {

            }
        }
        val androidTest by getting {
            dependencies {
                implementation("junit:junit:4.13.2")
            }
        }
        val desktopMain by getting {
            dependencies {

            }
        }
        val desktopTest by getting
    }
}

android {
    namespace = "com.example.namespace"
    compileSdkVersion(33)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(33)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    testOptions {
        managedDevices {
            devices {
                maybeCreate<com.android.build.api.dsl.ManagedVirtualDevice>("deviceName").apply {
                    // Use device profiles you typically see in Android Studio.
                    device = "Pixel 2"
                    // Use only API levels 27 and higher.
                    apiLevel = 30
                    // To include Google services, use "google".
                    systemImageSource = "aosp"
                }
            }
        }
    }
}