plugins {
    id("java")
}

group = "de.mueller.franz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.rabbitmq:amqp-client:5.26.0")

}

tasks.test {
    useJUnitPlatform()
}