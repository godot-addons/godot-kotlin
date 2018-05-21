# godot-kotlin

## Introduction

**Disclaimer** - I probably do not have the technical expertise to actually make this work. If you happened upon this repo by searching or just browsing the org, don't expect much here :)

I have come across one (maybe two) others from Google searching who have posted about supporting Kotlin in Godot Engine. I'm probably wrong, but the little I have experimented and understand so far, the steps may be to use the cinterop to generate c bindings, and then perhaps a ton of work to expose Kotlin classes to interface with the interop functions.

## Setup

1. Install Gradle
1. Clone godot-kotlin
1. Validate that the godot_headers submodule was pulled down, otherwise init

### Clone godot-kotlin

```bash
git clone git@github.com:godot-addons/godot-kotlin.git
```

### Run Gradle

```bash
./gradlew build
```

## Structure

* `src/main/c_interop/godot.def` is the Kotlin Native interop definition file which tells konan (kotlin native compiler) to include the c (*.h) header files from godot_headers

## Related

* https://youtrack.jetbrains.com/issue/KT-23455
* https://www.josephcatrambone.com/?p=1056#setup
