plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    application
}

application {
    mainClass.set("com.example.qr.MainKt")
}

kotlin {
    jvm {
        withJava()
        jvmToolchain(17)
    }
    js(IR) {
        browser()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
            }
        }
        
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation("com.google.zxing:core:3.5.2")
                implementation("com.google.zxing:javase:3.5.2")
            }
        }
        
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
            }
        }
    }
}

tasks.named<JavaExec>("run") {
    dependsOn(tasks.named("jvmJar"))
    classpath(tasks.named("jvmJar"))
}
