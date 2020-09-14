plugins {
    kotlin("jvm") version "1.4.0"
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
  useJUnitPlatform()
}

val kotestVersion = "4.2.5"

dependencies {
  implementation("org.openjfx:javafx:11.0.2")

  testImplementation("io.kotest:kotest-runner-junit5:" + kotestVersion)
  testImplementation("io.kotest:kotest-assertions-core:" + kotestVersion)
  testImplementation("io.kotest:kotest-property:" + kotestVersion)
}
