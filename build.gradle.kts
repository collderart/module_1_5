plugins {
    id("java")
    application
}

group = "edu.patterns"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainClass.set("edu.patterns.Main")
}

tasks.run<JavaExec>() {
    standardInput = System.`in`
}

tasks.test {
    useJUnitPlatform()
}
