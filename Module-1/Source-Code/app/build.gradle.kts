plugins { id("com.android.application"); id("org.jetbrains.kotlin.plugin.compose"); id("com.android.compose.screenshot") }
android { namespace = "com.example.module1"; compileSdk = 35
    defaultConfig { applicationId = "com.example.module1"; minSdk = 24; targetSdk = 35; versionCode = 1; versionName = "1.0" }
    buildFeatures { compose = true }
    experimentalProperties["android.experimental.enableScreenshotTest"] = true
}
dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.12.01"))
    implementation("androidx.activity:activity-compose:1.10.0")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    screenshotTestImplementation("com.android.tools.screenshot:screenshot-validation-api:0.0.1-alpha16")
    screenshotTestImplementation("androidx.compose.ui:ui-tooling")
}
