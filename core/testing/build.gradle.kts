@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.core.testing"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-compiler:2.44")

    api("junit:junit:4.13.2")
    api("androidx.test:core:1.5.0")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.1")
    api("app.cash.turbine:turbine:1.0.0")

    api("androidx.test.espresso:espresso-core:3.5.1")
    api("androidx.test:runner:1.5.2")
    api("androidx.test:rules:1.5.0")
    api("androidx.compose.ui:ui-test-junit4:1.4.3")
    api("com.google.dagger:hilt-android-testing:2.44")
    debugApi("androidx.compose.ui:ui-test-manifest:1.4.3")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
}