import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.application") version "8.2.0"
    kotlin("android") version "2.0.0"
    kotlin("plugin.compose") version "2.0.0"
    id("org.jetbrains.compose") version "1.6.10"
}

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

android {
    namespace = "io.joyfill.sample.external"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        applicationId = "io.joyfill.sample.external"
        versionCode = 1
        versionName = "1.0"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }

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
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

fun joyfill(module: String) = "io.joyfill:$module:1.0.0-K2.0"

dependencies {
    implementation(joyfill("compose"))?.because("We need to use joyfill form composables")
    implementation(joyfill("builder"))?.because("We need to programmatically build joyfill documents")
    implementation("androidx.activity:activity-compose:1.8.2")
}

//compose {
//    kotlinCompilerPlugin.set(kotlinz.versions.compose.compiler)
//    kotlinCompilerPluginArgs.add(kotlinz.versions.kotlin.map {
//        "suppressKotlinVersionCompatibilityCheck=$it"
//    })
//}
