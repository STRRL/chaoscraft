rootProject.name = "chaoscraft"
include("chaoscraft-mod")
include("chaoscraft-control-center")
include("chaoscraft-api")

pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net") { name = "Fabric" }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        val loomVersion: String by settings
        id("fabric-loom").version(loomVersion)
    }
}
