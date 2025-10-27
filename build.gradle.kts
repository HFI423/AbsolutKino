plugins {
    id("java")
}

group = "de.absolutKino"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("com.rabbitmq:amqp-client:5.25.0")
    implementation(platform("org.apache.logging.log4j:log4j-bom:2.25.2"))
    implementation("org.apache.logging.log4j:log4j-api")
    runtimeOnly ("org.apache.logging.log4j:log4j-core")
    runtimeOnly ("org.apache.logging.log4j:log4j-slf4j2-impl")
}

tasks.test {
    useJUnitPlatform()
}