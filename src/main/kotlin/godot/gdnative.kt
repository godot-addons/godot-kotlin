package godot

import kotlinx.cinterop.CPointer
import cnames.structs.godot_gdnative_core_api_struct
import godotapi.*

object GDNative {
  var api: CPointer<godot_gdnative_core_api_struct>? = null
  var initialized: Boolean = false
}

fun godot_gdnative_init(options: godot_gdnative_init_options) {
  println("Initializing Kotlin library.")
  GDNative.api = options.api_struct
  GDNative.initialized = true
}

fun godot_gdnative_terminate(options: godot_gdnative_terminate_options) {
  println("De-initializing Kotlin library.")
  GDNative.api = null
  GDNative.initialized = false
}
