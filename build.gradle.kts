plugins {
  kotlin("jvm") version "1.6.10"
  application
  idea
}

repositories {
  // Use jcenter for resolving dependencies.
  // You can declare any Maven/Ivy/file repository here.
  jcenter()
  maven(url = "https://frcmaven.wpi.edu/artifactory/release/")
  mavenCentral()
}

dependencies {
  val wpiVersion = "2022.4.1"
  implementation("org.strykeforce:deadeye:22.0.0")
  implementation("ch.qos.logback:logback-classic:1.2.11")
  implementation("io.dropwizard.metrics:metrics-core:4.2.8")
  implementation("edu.wpi.first.ntcore:ntcore-java:$wpiVersion")
  implementation("edu.wpi.first.ntcore:ntcore-jni:$wpiVersion:osxx86-64")
  implementation("edu.wpi.first.ntcore:ntcore-jni:$wpiVersion:linuxx86-64")
  implementation("edu.wpi.first.ntcore:ntcore-jni:$wpiVersion:windowsx86-64")
  implementation("edu.wpi.first.ntcore:ntcore-jni:$wpiVersion:linuxathena")
  implementation("edu.wpi.first.wpiutil:wpiutil-java:$wpiVersion")
  implementation("org.jline:jline-terminal:3.21.0")
  implementation("org.fusesource.jansi:jansi:2.4.0")
  implementation("com.github.ajalt:clikt:2.8.0")
  implementation ("com.squareup.moshi:moshi:1.13.0")
  implementation("org.slf4j:slf4j-api:1.7.36")
  implementation("io.github.microutils:kotlin-logging:2.1.21")
  implementation("ch.qos.logback:logback-core:1.2.11")


  // Align versions of all Kotlin components
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

  // Use the Kotlin JDK 8 standard library.
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  // Use the Kotlin test library.
  testImplementation("org.jetbrains.kotlin:kotlin-test")

  // Use the Kotlin JUnit integration.
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
  // Define the main class for the application
  mainClassName = "org.strykeforce.deadeye.cli.AppKt"
}

idea {
  module {
    isDownloadJavadoc = true
    isDownloadSources = true
  }
}
