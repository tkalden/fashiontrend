import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.5"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.8.0-Beta"
	kotlin("plugin.spring") version "1.8.0-Beta"
	kotlin("plugin.jpa") version "1.8.0-Beta"
}

group = "com.kaltse.fashion"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_18
java.targetCompatibility = JavaVersion.VERSION_18


configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation ("org.springframework.boot:spring-boot-starter-actuator")
	implementation ("org.springframework.boot:spring-boot-starter-validation")
	compileOnly("org.projectlombok:lombok")
	runtimeOnly("com.h2database:h2")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation(kotlin("test"))
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
	testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.1")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.1.8.RELEASE")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = JavaVersion.VERSION_1_8.toString()
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}