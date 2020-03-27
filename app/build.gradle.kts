/*
 *   Copyright (c) 2019 Google Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under the License
 *
 *   is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *   or implied. See the License for the specific language governing permissions and limitations under
 *   the License.
 */


plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
}

apply(plugin = "androidx.navigation.safeargs.kotlin")

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId(Versions.applicationId)
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName = Versions.version
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    dataBinding.isEnabled = true

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions.setSourceCompatibility(1.8)
    compileOptions.setTargetCompatibility(1.8)

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildToolsVersion="29.0.2"
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Kotlin
    implementation(Dependencies.kotlinStdLib)

    // AndroidX
    implementation (Dependencies.appCompat)
    implementation (Dependencies.constraintLayout)
    implementation (Dependencies.legacySupp)
    implementation (Dependencies.recyclerView)
    implementation (Dependencies.ktxCore)
    implementation(Dependencies.liveDataCore)
    implementation(Dependencies.navFragment)
    implementation(Dependencies.navFragmentKtx)

    // Glide
    implementation(Dependencies.glide)

    // Material Components
    implementation(Dependencies.materialDesign)

    //Koin
    implementation(Dependencies.koinCore)
    implementation(Dependencies.koinCore)

    //Retrofit
    implementation(Dependencies.retrofit2)
    implementation(Dependencies.gsonConverter)
    implementation(Dependencies.gson)

    //Room
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)



    // Testing
    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.koinTest)
    androidTestImplementation(Dependencies.runner)
    androidTestImplementation(Dependencies.espresso)
}
