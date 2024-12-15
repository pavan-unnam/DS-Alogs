plugins {
    id("java")
}

group = "org.desgnpatterns"
version = "1.0-SNAPSHOT"


dependencies {

    implementation(libs.log4j2.api)
    implementation(libs.log4j2.core)
    implementation(libs.log4j2.slf4j2)

    implementation(libs.jackson.dataformat.yaml)
    implementation(libs.jackson.databind)

    compileOnly(libs.lombok)

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