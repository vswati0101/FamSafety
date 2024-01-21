plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
    id ("kotlin-kapt")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.famsafety"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.famsafety"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding=true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    implementation ("androidx.room:room-ktx:2.3.0")
    kapt ("androidx.room:room-compiler:2.3.0")
    androidTestImplementation ("androidx.room:room-testing:2.3.0")

        // Import the BoM for the Firebase platform
        implementation(platform("com.google.firebase:firebase-bom:32.7.0"))

        // Add the dependency for the Firebase Authentication library
        // When using the BoM, you don't specify versions in Firebase library dependencies
        implementation("com.google.firebase:firebase-auth")

        // Also add the dependency for the Google Play services library and specify its version
        implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation ("com.google.android.gms:play-services-location:18.0.0")



}