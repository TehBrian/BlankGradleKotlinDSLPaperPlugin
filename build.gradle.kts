plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

group = "xyz.tehbrian"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_16
    targetCompatibility = JavaVersion.VERSION_16
}

repositories {
    mavenCentral()
    maven {
        name = "papermc-repo"
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }
    maven {
        name = "sonatype"
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }
    maven {
        name = "sonatype-s01"
        url = uri("https://s01.oss.sonatype.org/content/groups/public/")
    }
}

dependencies {
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
}

tasks.processResources {
    expand("version" to project.version)
}

tasks.shadowJar {
    archiveBaseName.set("Project")
}
