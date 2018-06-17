# godot-kotlin

## Introduction

**Disclaimer** - I probably do not have the technical expertise to actually make this work. If you happened upon this repo by searching or just browsing the org, don't expect much here :)

I have come across one (maybe two) others from Google searching who have posted about supporting Kotlin in Godot Engine. I'm probably wrong, but the little I have experimented and understand so far, the steps may be to use the cinterop to generate c bindings, and then perhaps a ton of work to expose Kotlin classes to interface with the interop functions.

## Setup

1. Install Gradle
1. Clone godot-kotlin
1. Validate that the godot_headers submodule was pulled down, otherwise init
1. Install Kotlin plugin

### Clone godot-kotlin

```bash
git clone git@github.com:godot-addons/godot-kotlin.git
git submodule init
```

### Run Gradle

```bash
./gradlew clean build
```

### Install the godotapi.klib

Run the command below, then open the project in CLion and it should pick things up.

```bash
klib install build/konan/libs/macos_x64/godotapi.klib
```

### Kotlin Plugin

https://plugins.jetbrains.com/plugin/10454-kotlin-native-for-clion

## Structure

* `src/main/c_interop/godotapi.def` is the Kotlin Native interop definition file which tells konan (kotlin native compiler) to include the c (*.h) header files from godot_headers

## Related

* https://youtrack.jetbrains.com/issue/KT-23455
* https://www.josephcatrambone.com/?p=1056#setup
* https://github.com/JetBrains/kotlinconf-spinner/blob/master/kotlin-native/samples/fullstack/CMakeLists.txt
