@file:Suppress("UnstableApiUsage")

plugins {
    id ("com.android.library")
    kotlin("android")
}

android {
    namespace  = "com.core.model"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}