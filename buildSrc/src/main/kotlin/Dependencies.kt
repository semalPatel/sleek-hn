
object Versions {
    const val version = "1.0"
    const val compileSdk = 29
    const val minSdk = 23
    const val targetSdk = 29

    const val kotlin = "1.3.71"
    const val gradle = "4.1.0-alpha04"
    const val buildTools = "29.0.2"

    const val appCompat = "1.1.0"
    const val coreKtx = "1.2.0"
    const val constraintLayout = "2.0.0-beta4"
    const val legacySupport = "1.0.0"
    const val recyclerView = "1.2.0-alpha01"
    const val liveDataCore = "2.3.0-alpha01"
    const val navFragment = "2.3.0-alpha04"

    const val glide = "4.10.0"

    const val material = "1.2.0-alpha05"

    const val junit = "4.12"
    const val runner = "1.2.0"
    const val espresso = "3.2.0"

    const val koin = "2.1.5"

    const val room = "2.2.5"

    const val retrofit = "2.8.0"

    const val gson = "2.8.5"
    const val gsonConverter = "2.6.0"

    const val googleServices = "4.3.3"
}

object ApplicationSetup {
    const val applicationId = "com.materialstudies.sleekhn"
    const val navArgsPlugin = "androidx.navigation.safeargs.kotlin"
    const val id = "com.android.application"
    const val android = "android"
    const val kapt = "kapt"
    const val extensions = "android.extensions"
    const val testInstrumentRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val release = "release"
    const val proguardAndroid = "proguard-android.txt"
    const val proguardRules = "proguard-rules.pro"
    val fileTreeSetup = mapOf("dir" to "libs", "include" to listOf("*.jar"))
}

object ProjectSetup {
    const val buildToolsClassPath = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradleClassPath = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val navSafeArgsClassPath = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navFragment}"
    const val googleServicesClassPath = "com.google.gms:google-services:${Versions.googleServices}"
    const val clean = "clean"
}


object Dependencies {

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    // AndroidX
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val legacySupp = "androidx.legacy:legacy-support-v4:${Versions.legacySupport}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val liveDataCore = "androidx.lifecycle:lifecycle-livedata-core-ktx:${Versions.liveDataCore}"
    const val navFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navFragment}"
    const val navFragment = "androidx.navigation:navigation-ui-ktx:${Versions.navFragment}"

    // Glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    // Material Components
    const val materialDesign = "com.google.android.material:material:${Versions.material}"

    //Koin
    const val koinCore = "org.koin:koin-core:${Versions.koin}"
    const val koinExtCore = "org.koin:koin-core-ext:${Versions.koin}"

    //Retrofit
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    //Room
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    // Testing
    const val junit = "junit:junit:${Versions.junit}"
    const val koinTest = "org.koin:koin-test:${Versions.koin}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
