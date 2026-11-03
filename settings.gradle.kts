plugins {
    id("com.gradle.enterprise") version "3.17.6"
}

rootProject.name = "alchemist-primer"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}

enableFeaturePreview("VERSION_CATALOGS")
