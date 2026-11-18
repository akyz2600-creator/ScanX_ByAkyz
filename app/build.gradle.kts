import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    // IDENTIFICADOR ESTABLE: no cambiar en fases futuras (ver TECHNICAL_DOCS.md).
    namespace = "com.akyz.scanx"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.akyz.scanx"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
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
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    debugImplementation(libs.androidx.compose.ui.tooling)

    // Fases futuras (ya en el catálogo, se activarán en su fase):
    //  F3 CameraX:  libs.androidx.camera.core / camera2 / lifecycle / view
    //  F4 OCR:      libs.mlkit.text.recognition
    //  F5 Barcode:  libs.mlkit.barcode.scanning
    //  F7 Room:     libs.androidx.room.runtime / room.ktx + ksp(libs.androidx.room.compiler) + plugin ksp
}
