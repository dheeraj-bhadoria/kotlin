plugins {
    kotlin("jvm") version "1.6.10"
}

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-dependencies")
}

dependencies {
    implementation("org.jetbrains.dukat:dukat:0.5.8-rc.555")
    implementation("org.jsoup:jsoup:1.14.2")
}

task("downloadIDL", JavaExec::class) {
    main = "org.jetbrains.kotlin.tools.dukat.DownloadKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn(":dukat:build")
}

task("generateStdlibFromIDL", JavaExec::class) {
    main = "org.jetbrains.kotlin.tools.dukat.LaunchJsKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn(":dukat:build")
    systemProperty("line.separator", "\n")
}

task("generateWasmStdlibFromIDL", JavaExec::class) {
    main = "org.jetbrains.kotlin.tools.dukat.LaunchWasmKt"
    classpath = sourceSets["main"].runtimeClasspath
    dependsOn(":dukat:build")
    systemProperty("line.separator", "\n")
}
