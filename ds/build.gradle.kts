plugins {
    id("java")
}

group = "org.ds"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.engine)
    testImplementation(libs.junit.api)
    testImplementation(libs.junit.params)
    testImplementation(libs.junit.vintage)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.jupiter)
    testImplementation(libs.powerMock.core)
    testImplementation(libs.powerMock.module)
}

tasks.test {
    useJUnitPlatform()
}