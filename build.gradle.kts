import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    `build-scan`
    kotlin("jvm") version "1.3.11" 
}

repositories {
    jcenter() 
}


dependencies {
    implementation(kotlin("stdlib", "1.3.11")) 
    testImplementation("junit:junit:4.12")
}

buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service") 
    setLicenseAgree("yes")

    publishAlways() 
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.freeCompilerArgs = listOf("-XXLanguage:+InlineClasses")
        kotlinOptions.jvmTarget = "1.8"
    }
}