import com.android.build.api.dsl.LibraryExtension

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

configure<LibraryExtension> {
    namespace = "concerrox.ui"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
}

kotlin {
    androidTarget()
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.compose.runtime)
                implementation(libs.compose.foundation)
                implementation(libs.compose.material)
                implementation(libs.compose.material3)
                implementation(libs.compose.ui)
            }
        }
        androidMain {
            dependencies {

            }
        }
        jvmMain {
            dependencies {
            }
        }
    }

}
