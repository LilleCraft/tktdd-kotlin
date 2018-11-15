plugins {
    `build-scan`
    kotlin("jvm") version "1.2.31" 
}

repositories {
    jcenter() 
}

dependencies {
    implementation(kotlin("stdlib", "1.2.31")) 
    testImplementation("junit:junit:4.12")
}

buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service") 
    setLicenseAgree("yes")

    publishAlways() 
}

compileKotlin {
    kotlinOptions.freeCompilerArgs += ["-XXLanguage:+InlineClasses"]
}