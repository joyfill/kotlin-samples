plugins {
    id("com.android.application") version "8.9.1"
    kotlin("android") version "2.1.21"
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.21"
}

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

android {
    namespace = "io.joyfill.sample.external"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        applicationId = "io.joyfill.sample.external"
        versionCode = 1
        versionName = "1.0"
    }

//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.4.6"
//    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}


kotlin {
    target {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
}

fun joyfill(module: String) = "io.joyfill:$module:2.0.0-Beta18"
fun asoft(module: String) = "tz.co.asoft:$module:3.1.14"

dependencies {
    implementation(joyfill("compose"))?.because("We need to use joyfill form composables")
    implementation(joyfill("builder"))?.because("We need to programmatically build joyfill documents")
    implementation(asoft("kiota-file-manager-system"))?.because("We need to use kiota file manager system for file pickers")
    implementation("androidx.activity:activity-compose:1.10.1")
    implementation("io.ktor:ktor-client-cio:3.1.3")
}