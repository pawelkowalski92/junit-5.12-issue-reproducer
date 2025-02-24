plugins {
    java
}

group = "com.github.pawelkowalski92"
version = "1.0-SNAPSHOT"

val junitVersion: String by extra("5.12.0")

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:$junitVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
