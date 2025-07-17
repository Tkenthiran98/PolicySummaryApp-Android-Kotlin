# Policy Summary Android App

Android mobile application built with Kotlin and Jetpack Compose for displaying policy information.

## Tech Stack
- Language: Kotlin
- UI: Jetpack Compose  
- Architecture: MVVM
- Navigation: Navigation Compose

## Features
✅ Policy Summary screen with 3 sample policies
✅ Expand/collapse animation for "Read More"
✅ Header with app logo and screen title
✅ Bottom navigation with 4 tabs
✅ Color theme Dark Blue #002C5F and Light Red #FF6F61
✅ Reusable components
✅ Organized folder structure
✅ Proper state management with ViewModel

## Requirements
- Android Studio
- Minimum SDK: 24
- Target SDK: 34
- Kotlin

## How to Run
1. Create new Android project in Android Studio
2. Replace all files with provided code
3. Sync Gradle files
4. Run on device/emulator

## Project Structure
app/src/main/java/com/artechconsultancy/policysummary/
├── MainActivity.kt
├── data/
│   ├── Policy.kt
│   └── PolicyRepository.kt
├── ui/
│   ├── theme/
│   ├── components/
│   ├── screens/
│   └── MainScreen.kt
└── viewmodel/
└── PolicyViewModel.kt

## Developer
Kenthiran Thiyakarasa
Email: thiyakarasakenthiran@gmail.com

build.gradle.kts (Project Level)
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

settings.gradle.kts
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PolicySummaryApp"
include(":app")



