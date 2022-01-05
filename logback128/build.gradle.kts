plugins {
  `java-library`
}
dependencies {
  implementation(project(":logback-bug-core"))

  testImplementation(platform("org.junit:junit-bom:5.8.2"))
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testImplementation("com.github.stefanbirkner:system-rules:1.19.0")
  testImplementation("com.github.stefanbirkner:system-lambda:1.2.1")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

  testRuntimeOnly("ch.qos.logback:logback-classic:1.2.8")
  testRuntimeOnly("org.codehaus.groovy:groovy-all:2.5.5")
}

tasks.withType<Test> {
  useJUnitPlatform()
}
