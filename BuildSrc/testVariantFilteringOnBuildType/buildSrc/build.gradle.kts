import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}

repositories {
    google()
    jcenter()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions.apiVersion = "1.3"
}

dependencies {
    implementation("com.android.tools.build:gradle-api:4.2.0-alpha13")
    implementation(kotlin("stdlib"))
    gradleApi()
}
dependencies {
    implementation("com.android.tools.build:gradle:4.2.0-alpha13")
}