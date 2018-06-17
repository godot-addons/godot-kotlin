@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package godotapi

import konan.SymbolName
import kotlinx.cinterop.*
import cnames.structs.godot_gdnative_core_api_struct
import platform.posix.int64_t
import platform.posix.size_t
import platform.posix.uint32_t
import platform.posix.uint64_t
import platform.posix.uint64_tVar
import platform.posix.uint8_t
import platform.posix.uint8_tVar
import platform.posix.wchar_t
import platform.posix.wchar_tVar

// NOTE THIS FILE IS AUTO-GENERATED

fun godot_color_new_rgba(r_dest: CValuesRef<godot_color>?, p_r: godot_real, p_g: godot_real, p_b: godot_real, p_a: godot_real): Unit {
    memScoped {
        return kniBridge0(r_dest?.getPointer(memScope).rawValue, p_r, p_g, p_b, p_a)
    }
}

fun godot_color_new_rgb(r_dest: CValuesRef<godot_color>?, p_r: godot_real, p_g: godot_real, p_b: godot_real): Unit {
    memScoped {
        return kniBridge1(r_dest?.getPointer(memScope).rawValue, p_r, p_g, p_b)
    }
}

fun godot_color_get_r(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge2(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_set_r(p_self: CValuesRef<godot_color>?, r: godot_real): Unit {
    memScoped {
        return kniBridge3(p_self?.getPointer(memScope).rawValue, r)
    }
}

fun godot_color_get_g(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge4(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_set_g(p_self: CValuesRef<godot_color>?, g: godot_real): Unit {
    memScoped {
        return kniBridge5(p_self?.getPointer(memScope).rawValue, g)
    }
}

fun godot_color_get_b(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge6(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_set_b(p_self: CValuesRef<godot_color>?, b: godot_real): Unit {
    memScoped {
        return kniBridge7(p_self?.getPointer(memScope).rawValue, b)
    }
}

fun godot_color_get_a(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge8(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_set_a(p_self: CValuesRef<godot_color>?, a: godot_real): Unit {
    memScoped {
        return kniBridge9(p_self?.getPointer(memScope).rawValue, a)
    }
}

fun godot_color_get_h(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge10(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_get_s(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge11(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_get_v(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge12(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_as_string(p_self: CValuesRef<godot_color>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge13(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_color_to_rgba32(p_self: CValuesRef<godot_color>?): godot_int {
    memScoped {
        return kniBridge14(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_to_argb32(p_self: CValuesRef<godot_color>?): godot_int {
    memScoped {
        return kniBridge15(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_gray(p_self: CValuesRef<godot_color>?): godot_real {
    memScoped {
        return kniBridge16(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_color_inverted(p_self: CValuesRef<godot_color>?): CValue<godot_color> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_color>()
        try {
            kniBridge17(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_color_contrasted(p_self: CValuesRef<godot_color>?): CValue<godot_color> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_color>()
        try {
            kniBridge18(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_color_linear_interpolate(p_self: CValuesRef<godot_color>?, p_b: CValuesRef<godot_color>?, p_t: godot_real): CValue<godot_color> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_color>()
        try {
            kniBridge19(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_color_blend(p_self: CValuesRef<godot_color>?, p_over: CValuesRef<godot_color>?): CValue<godot_color> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_color>()
        try {
            kniBridge20(p_self?.getPointer(memScope).rawValue, p_over?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_color_to_html(p_self: CValuesRef<godot_color>?, p_with_alpha: godot_bool): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge21(p_self?.getPointer(memScope).rawValue, p_with_alpha.toByte(), kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_color_operator_equal(p_self: CValuesRef<godot_color>?, p_b: CValuesRef<godot_color>?): godot_bool {
    memScoped {
        return kniBridge22(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_color_operator_less(p_self: CValuesRef<godot_color>?, p_b: CValuesRef<godot_color>?): godot_bool {
    memScoped {
        return kniBridge23(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector2_new(r_dest: CValuesRef<godot_vector2>?, p_x: godot_real, p_y: godot_real): Unit {
    memScoped {
        return kniBridge24(r_dest?.getPointer(memScope).rawValue, p_x, p_y)
    }
}

fun godot_vector2_as_string(p_self: CValuesRef<godot_vector2>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge25(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_normalized(p_self: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge26(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_length(p_self: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge27(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_angle(p_self: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge28(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_length_squared(p_self: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge29(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_is_normalized(p_self: CValuesRef<godot_vector2>?): godot_bool {
    memScoped {
        return kniBridge30(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector2_distance_to(p_self: CValuesRef<godot_vector2>?, p_to: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge31(p_self?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_distance_squared_to(p_self: CValuesRef<godot_vector2>?, p_to: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge32(p_self?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_angle_to(p_self: CValuesRef<godot_vector2>?, p_to: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge33(p_self?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_angle_to_point(p_self: CValuesRef<godot_vector2>?, p_to: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge34(p_self?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_linear_interpolate(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?, p_t: godot_real): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge35(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_cubic_interpolate(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?, p_pre_a: CValuesRef<godot_vector2>?, p_post_b: CValuesRef<godot_vector2>?, p_t: godot_real): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge36(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_pre_a?.getPointer(memScope).rawValue, p_post_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_rotated(p_self: CValuesRef<godot_vector2>?, p_phi: godot_real): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge37(p_self?.getPointer(memScope).rawValue, p_phi, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_tangent(p_self: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge38(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_floor(p_self: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge39(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_snapped(p_self: CValuesRef<godot_vector2>?, p_by: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge40(p_self?.getPointer(memScope).rawValue, p_by?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_aspect(p_self: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge41(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_dot(p_self: CValuesRef<godot_vector2>?, p_with: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge42(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_slide(p_self: CValuesRef<godot_vector2>?, p_n: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge43(p_self?.getPointer(memScope).rawValue, p_n?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_bounce(p_self: CValuesRef<godot_vector2>?, p_n: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge44(p_self?.getPointer(memScope).rawValue, p_n?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_reflect(p_self: CValuesRef<godot_vector2>?, p_n: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge45(p_self?.getPointer(memScope).rawValue, p_n?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_abs(p_self: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge46(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_clamped(p_self: CValuesRef<godot_vector2>?, p_length: godot_real): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge47(p_self?.getPointer(memScope).rawValue, p_length, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_add(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge48(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_subtract(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge49(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_multiply_vector(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge50(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_multiply_scalar(p_self: CValuesRef<godot_vector2>?, p_b: godot_real): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge51(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_divide_vector(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge52(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_divide_scalar(p_self: CValuesRef<godot_vector2>?, p_b: godot_real): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge53(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_operator_equal(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?): godot_bool {
    memScoped {
        return kniBridge54(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector2_operator_less(p_self: CValuesRef<godot_vector2>?, p_b: CValuesRef<godot_vector2>?): godot_bool {
    memScoped {
        return kniBridge55(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector2_operator_neg(p_self: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge56(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector2_set_x(p_self: CValuesRef<godot_vector2>?, p_x: godot_real): Unit {
    memScoped {
        return kniBridge57(p_self?.getPointer(memScope).rawValue, p_x)
    }
}

fun godot_vector2_set_y(p_self: CValuesRef<godot_vector2>?, p_y: godot_real): Unit {
    memScoped {
        return kniBridge58(p_self?.getPointer(memScope).rawValue, p_y)
    }
}

fun godot_vector2_get_x(p_self: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge59(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector2_get_y(p_self: CValuesRef<godot_vector2>?): godot_real {
    memScoped {
        return kniBridge60(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_new(r_dest: CValuesRef<godot_quat>?, p_x: godot_real, p_y: godot_real, p_z: godot_real, p_w: godot_real): Unit {
    memScoped {
        return kniBridge61(r_dest?.getPointer(memScope).rawValue, p_x, p_y, p_z, p_w)
    }
}

fun godot_quat_new_with_axis_angle(r_dest: CValuesRef<godot_quat>?, p_axis: CValuesRef<godot_vector3>?, p_angle: godot_real): Unit {
    memScoped {
        return kniBridge62(r_dest?.getPointer(memScope).rawValue, p_axis?.getPointer(memScope).rawValue, p_angle)
    }
}

fun godot_quat_get_x(p_self: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge63(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_set_x(p_self: CValuesRef<godot_quat>?, `val`: godot_real): Unit {
    memScoped {
        return kniBridge64(p_self?.getPointer(memScope).rawValue, `val`)
    }
}

fun godot_quat_get_y(p_self: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge65(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_set_y(p_self: CValuesRef<godot_quat>?, `val`: godot_real): Unit {
    memScoped {
        return kniBridge66(p_self?.getPointer(memScope).rawValue, `val`)
    }
}

fun godot_quat_get_z(p_self: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge67(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_set_z(p_self: CValuesRef<godot_quat>?, `val`: godot_real): Unit {
    memScoped {
        return kniBridge68(p_self?.getPointer(memScope).rawValue, `val`)
    }
}

fun godot_quat_get_w(p_self: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge69(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_set_w(p_self: CValuesRef<godot_quat>?, `val`: godot_real): Unit {
    memScoped {
        return kniBridge70(p_self?.getPointer(memScope).rawValue, `val`)
    }
}

fun godot_quat_as_string(p_self: CValuesRef<godot_quat>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge71(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_length(p_self: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge72(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_length_squared(p_self: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge73(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_normalized(p_self: CValuesRef<godot_quat>?): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge74(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_is_normalized(p_self: CValuesRef<godot_quat>?): godot_bool {
    memScoped {
        return kniBridge75(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_quat_inverse(p_self: CValuesRef<godot_quat>?): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge76(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_dot(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?): godot_real {
    memScoped {
        return kniBridge77(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue)
    }
}

fun godot_quat_xform(p_self: CValuesRef<godot_quat>?, p_v: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge78(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_slerp(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?, p_t: godot_real): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge79(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_slerpni(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?, p_t: godot_real): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge80(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_cubic_slerp(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?, p_pre_a: CValuesRef<godot_quat>?, p_post_b: CValuesRef<godot_quat>?, p_t: godot_real): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge81(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_pre_a?.getPointer(memScope).rawValue, p_post_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_operator_multiply(p_self: CValuesRef<godot_quat>?, p_b: godot_real): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge82(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_operator_add(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge83(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_operator_subtract(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge84(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_operator_divide(p_self: CValuesRef<godot_quat>?, p_b: godot_real): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge85(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_quat_operator_equal(p_self: CValuesRef<godot_quat>?, p_b: CValuesRef<godot_quat>?): godot_bool {
    memScoped {
        return kniBridge86(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_quat_operator_neg(p_self: CValuesRef<godot_quat>?): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge87(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_new_with_rows(r_dest: CValuesRef<godot_basis>?, p_x_axis: CValuesRef<godot_vector3>?, p_y_axis: CValuesRef<godot_vector3>?, p_z_axis: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge88(r_dest?.getPointer(memScope).rawValue, p_x_axis?.getPointer(memScope).rawValue, p_y_axis?.getPointer(memScope).rawValue, p_z_axis?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_new_with_axis_and_angle(r_dest: CValuesRef<godot_basis>?, p_axis: CValuesRef<godot_vector3>?, p_phi: godot_real): Unit {
    memScoped {
        return kniBridge89(r_dest?.getPointer(memScope).rawValue, p_axis?.getPointer(memScope).rawValue, p_phi)
    }
}

fun godot_basis_new_with_euler(r_dest: CValuesRef<godot_basis>?, p_euler: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge90(r_dest?.getPointer(memScope).rawValue, p_euler?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_as_string(p_self: CValuesRef<godot_basis>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge91(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_inverse(p_self: CValuesRef<godot_basis>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge92(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_transposed(p_self: CValuesRef<godot_basis>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge93(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_orthonormalized(p_self: CValuesRef<godot_basis>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge94(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_determinant(p_self: CValuesRef<godot_basis>?): godot_real {
    memScoped {
        return kniBridge95(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_rotated(p_self: CValuesRef<godot_basis>?, p_axis: CValuesRef<godot_vector3>?, p_phi: godot_real): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge96(p_self?.getPointer(memScope).rawValue, p_axis?.getPointer(memScope).rawValue, p_phi, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_scaled(p_self: CValuesRef<godot_basis>?, p_scale: CValuesRef<godot_vector3>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge97(p_self?.getPointer(memScope).rawValue, p_scale?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_get_scale(p_self: CValuesRef<godot_basis>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge98(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_get_euler(p_self: CValuesRef<godot_basis>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge99(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_tdotx(p_self: CValuesRef<godot_basis>?, p_with: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge100(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_tdoty(p_self: CValuesRef<godot_basis>?, p_with: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge101(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_tdotz(p_self: CValuesRef<godot_basis>?, p_with: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge102(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_xform(p_self: CValuesRef<godot_basis>?, p_v: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge103(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_xform_inv(p_self: CValuesRef<godot_basis>?, p_v: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge104(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_get_orthogonal_index(p_self: CValuesRef<godot_basis>?): godot_int {
    memScoped {
        return kniBridge105(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_new(r_dest: CValuesRef<godot_basis>?): Unit {
    memScoped {
        return kniBridge106(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_new_with_euler_quat(r_dest: CValuesRef<godot_basis>?, p_euler: CValuesRef<godot_quat>?): Unit {
    memScoped {
        return kniBridge107(r_dest?.getPointer(memScope).rawValue, p_euler?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_get_elements(p_self: CValuesRef<godot_basis>?, p_elements: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge108(p_self?.getPointer(memScope).rawValue, p_elements?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_get_axis(p_self: CValuesRef<godot_basis>?, p_axis: godot_int): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge109(p_self?.getPointer(memScope).rawValue, p_axis, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_set_axis(p_self: CValuesRef<godot_basis>?, p_axis: godot_int, p_value: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge110(p_self?.getPointer(memScope).rawValue, p_axis, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_get_row(p_self: CValuesRef<godot_basis>?, p_row: godot_int): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge111(p_self?.getPointer(memScope).rawValue, p_row, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_set_row(p_self: CValuesRef<godot_basis>?, p_row: godot_int, p_value: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge112(p_self?.getPointer(memScope).rawValue, p_row, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_basis_operator_equal(p_self: CValuesRef<godot_basis>?, p_b: CValuesRef<godot_basis>?): godot_bool {
    memScoped {
        return kniBridge113(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_basis_operator_add(p_self: CValuesRef<godot_basis>?, p_b: CValuesRef<godot_basis>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge114(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_operator_subtract(p_self: CValuesRef<godot_basis>?, p_b: CValuesRef<godot_basis>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge115(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_operator_multiply_vector(p_self: CValuesRef<godot_basis>?, p_b: CValuesRef<godot_basis>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge116(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_basis_operator_multiply_scalar(p_self: CValuesRef<godot_basis>?, p_b: godot_real): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge117(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_new(r_dest: CValuesRef<godot_vector3>?, p_x: godot_real, p_y: godot_real, p_z: godot_real): Unit {
    memScoped {
        return kniBridge118(r_dest?.getPointer(memScope).rawValue, p_x, p_y, p_z)
    }
}

fun godot_vector3_as_string(p_self: CValuesRef<godot_vector3>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge119(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_min_axis(p_self: CValuesRef<godot_vector3>?): godot_int {
    memScoped {
        return kniBridge120(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_max_axis(p_self: CValuesRef<godot_vector3>?): godot_int {
    memScoped {
        return kniBridge121(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_length(p_self: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge122(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_length_squared(p_self: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge123(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_is_normalized(p_self: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge124(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector3_normalized(p_self: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge125(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_inverse(p_self: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge126(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_snapped(p_self: CValuesRef<godot_vector3>?, p_by: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge127(p_self?.getPointer(memScope).rawValue, p_by?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_rotated(p_self: CValuesRef<godot_vector3>?, p_axis: CValuesRef<godot_vector3>?, p_phi: godot_real): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge128(p_self?.getPointer(memScope).rawValue, p_axis?.getPointer(memScope).rawValue, p_phi, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_linear_interpolate(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?, p_t: godot_real): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge129(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_cubic_interpolate(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?, p_pre_a: CValuesRef<godot_vector3>?, p_post_b: CValuesRef<godot_vector3>?, p_t: godot_real): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge130(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_pre_a?.getPointer(memScope).rawValue, p_post_b?.getPointer(memScope).rawValue, p_t, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_dot(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge131(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_cross(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge132(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_outer(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge133(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_to_diagonal_matrix(p_self: CValuesRef<godot_vector3>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge134(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_abs(p_self: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge135(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_floor(p_self: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge136(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_ceil(p_self: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge137(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_distance_to(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge138(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_distance_squared_to(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge139(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_angle_to(p_self: CValuesRef<godot_vector3>?, p_to: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge140(p_self?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue)
    }
}

fun godot_vector3_slide(p_self: CValuesRef<godot_vector3>?, p_n: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge141(p_self?.getPointer(memScope).rawValue, p_n?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_bounce(p_self: CValuesRef<godot_vector3>?, p_n: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge142(p_self?.getPointer(memScope).rawValue, p_n?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_reflect(p_self: CValuesRef<godot_vector3>?, p_n: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge143(p_self?.getPointer(memScope).rawValue, p_n?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_add(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge144(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_subtract(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge145(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_multiply_vector(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge146(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_multiply_scalar(p_self: CValuesRef<godot_vector3>?, p_b: godot_real): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge147(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_divide_vector(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge148(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_divide_scalar(p_self: CValuesRef<godot_vector3>?, p_b: godot_real): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge149(p_self?.getPointer(memScope).rawValue, p_b, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_operator_equal(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge150(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector3_operator_less(p_self: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge151(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_vector3_operator_neg(p_self: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge152(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_vector3_set_axis(p_self: CValuesRef<godot_vector3>?, p_axis: godot_vector3_axis, p_val: godot_real): Unit {
    memScoped {
        return kniBridge153(p_self?.getPointer(memScope).rawValue, p_axis.value, p_val)
    }
}

fun godot_vector3_get_axis(p_self: CValuesRef<godot_vector3>?, p_axis: godot_vector3_axis): godot_real {
    memScoped {
        return kniBridge154(p_self?.getPointer(memScope).rawValue, p_axis.value)
    }
}

fun godot_pool_byte_array_new(r_dest: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge155(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_new_copy(r_dest: CValuesRef<godot_pool_byte_array>?, p_src: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge156(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_new_with_array(r_dest: CValuesRef<godot_pool_byte_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge157(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_append(p_self: CValuesRef<godot_pool_byte_array>?, p_data: uint8_t): Unit {
    memScoped {
        return kniBridge158(p_self?.getPointer(memScope).rawValue, p_data)
    }
}

fun godot_pool_byte_array_append_array(p_self: CValuesRef<godot_pool_byte_array>?, p_array: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge159(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_insert(p_self: CValuesRef<godot_pool_byte_array>?, p_idx: godot_int, p_data: uint8_t): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge160(p_self?.getPointer(memScope).rawValue, p_idx, p_data))
    }
}

fun godot_pool_byte_array_invert(p_self: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge161(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_push_back(p_self: CValuesRef<godot_pool_byte_array>?, p_data: uint8_t): Unit {
    memScoped {
        return kniBridge162(p_self?.getPointer(memScope).rawValue, p_data)
    }
}

fun godot_pool_byte_array_remove(p_self: CValuesRef<godot_pool_byte_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge163(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_byte_array_resize(p_self: CValuesRef<godot_pool_byte_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge164(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_byte_array_read(p_self: CValuesRef<godot_pool_byte_array>?): CPointer<godot_pool_byte_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_byte_array_read_access>(kniBridge165(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_byte_array_write(p_self: CValuesRef<godot_pool_byte_array>?): CPointer<godot_pool_byte_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_byte_array_write_access>(kniBridge166(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_byte_array_set(p_self: CValuesRef<godot_pool_byte_array>?, p_idx: godot_int, p_data: uint8_t): Unit {
    memScoped {
        return kniBridge167(p_self?.getPointer(memScope).rawValue, p_idx, p_data)
    }
}

fun godot_pool_byte_array_get(p_self: CValuesRef<godot_pool_byte_array>?, p_idx: godot_int): uint8_t {
    memScoped {
        return kniBridge168(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_byte_array_size(p_self: CValuesRef<godot_pool_byte_array>?): godot_int {
    memScoped {
        return kniBridge169(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_destroy(p_self: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge170(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_new(r_dest: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge171(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_new_copy(r_dest: CValuesRef<godot_pool_int_array>?, p_src: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge172(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_new_with_array(r_dest: CValuesRef<godot_pool_int_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge173(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_append(p_self: CValuesRef<godot_pool_int_array>?, p_data: godot_int): Unit {
    memScoped {
        return kniBridge174(p_self?.getPointer(memScope).rawValue, p_data)
    }
}

fun godot_pool_int_array_append_array(p_self: CValuesRef<godot_pool_int_array>?, p_array: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge175(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_insert(p_self: CValuesRef<godot_pool_int_array>?, p_idx: godot_int, p_data: godot_int): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge176(p_self?.getPointer(memScope).rawValue, p_idx, p_data))
    }
}

fun godot_pool_int_array_invert(p_self: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge177(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_push_back(p_self: CValuesRef<godot_pool_int_array>?, p_data: godot_int): Unit {
    memScoped {
        return kniBridge178(p_self?.getPointer(memScope).rawValue, p_data)
    }
}

fun godot_pool_int_array_remove(p_self: CValuesRef<godot_pool_int_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge179(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_int_array_resize(p_self: CValuesRef<godot_pool_int_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge180(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_int_array_read(p_self: CValuesRef<godot_pool_int_array>?): CPointer<godot_pool_int_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_int_array_read_access>(kniBridge181(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_int_array_write(p_self: CValuesRef<godot_pool_int_array>?): CPointer<godot_pool_int_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_int_array_write_access>(kniBridge182(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_int_array_set(p_self: CValuesRef<godot_pool_int_array>?, p_idx: godot_int, p_data: godot_int): Unit {
    memScoped {
        return kniBridge183(p_self?.getPointer(memScope).rawValue, p_idx, p_data)
    }
}

fun godot_pool_int_array_get(p_self: CValuesRef<godot_pool_int_array>?, p_idx: godot_int): godot_int {
    memScoped {
        return kniBridge184(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_int_array_size(p_self: CValuesRef<godot_pool_int_array>?): godot_int {
    memScoped {
        return kniBridge185(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_destroy(p_self: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge186(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_new(r_dest: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge187(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_new_copy(r_dest: CValuesRef<godot_pool_real_array>?, p_src: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge188(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_new_with_array(r_dest: CValuesRef<godot_pool_real_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge189(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_append(p_self: CValuesRef<godot_pool_real_array>?, p_data: godot_real): Unit {
    memScoped {
        return kniBridge190(p_self?.getPointer(memScope).rawValue, p_data)
    }
}

fun godot_pool_real_array_append_array(p_self: CValuesRef<godot_pool_real_array>?, p_array: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge191(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_insert(p_self: CValuesRef<godot_pool_real_array>?, p_idx: godot_int, p_data: godot_real): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge192(p_self?.getPointer(memScope).rawValue, p_idx, p_data))
    }
}

fun godot_pool_real_array_invert(p_self: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge193(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_push_back(p_self: CValuesRef<godot_pool_real_array>?, p_data: godot_real): Unit {
    memScoped {
        return kniBridge194(p_self?.getPointer(memScope).rawValue, p_data)
    }
}

fun godot_pool_real_array_remove(p_self: CValuesRef<godot_pool_real_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge195(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_real_array_resize(p_self: CValuesRef<godot_pool_real_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge196(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_real_array_read(p_self: CValuesRef<godot_pool_real_array>?): CPointer<godot_pool_real_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_real_array_read_access>(kniBridge197(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_real_array_write(p_self: CValuesRef<godot_pool_real_array>?): CPointer<godot_pool_real_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_real_array_write_access>(kniBridge198(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_real_array_set(p_self: CValuesRef<godot_pool_real_array>?, p_idx: godot_int, p_data: godot_real): Unit {
    memScoped {
        return kniBridge199(p_self?.getPointer(memScope).rawValue, p_idx, p_data)
    }
}

fun godot_pool_real_array_get(p_self: CValuesRef<godot_pool_real_array>?, p_idx: godot_int): godot_real {
    memScoped {
        return kniBridge200(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_real_array_size(p_self: CValuesRef<godot_pool_real_array>?): godot_int {
    memScoped {
        return kniBridge201(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_destroy(p_self: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge202(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_new(r_dest: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge203(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_new_copy(r_dest: CValuesRef<godot_pool_string_array>?, p_src: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge204(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_new_with_array(r_dest: CValuesRef<godot_pool_string_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge205(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_append(p_self: CValuesRef<godot_pool_string_array>?, p_data: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge206(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_append_array(p_self: CValuesRef<godot_pool_string_array>?, p_array: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge207(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_insert(p_self: CValuesRef<godot_pool_string_array>?, p_idx: godot_int, p_data: CValuesRef<godot_string>?): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge208(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_invert(p_self: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge209(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_push_back(p_self: CValuesRef<godot_pool_string_array>?, p_data: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge210(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_remove(p_self: CValuesRef<godot_pool_string_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge211(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_string_array_resize(p_self: CValuesRef<godot_pool_string_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge212(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_string_array_read(p_self: CValuesRef<godot_pool_string_array>?): CPointer<godot_pool_string_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_string_array_read_access>(kniBridge213(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_write(p_self: CValuesRef<godot_pool_string_array>?): CPointer<godot_pool_string_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_string_array_write_access>(kniBridge214(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_set(p_self: CValuesRef<godot_pool_string_array>?, p_idx: godot_int, p_data: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge215(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_get(p_self: CValuesRef<godot_pool_string_array>?, p_idx: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge216(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_pool_string_array_size(p_self: CValuesRef<godot_pool_string_array>?): godot_int {
    memScoped {
        return kniBridge217(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_destroy(p_self: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge218(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_new(r_dest: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge219(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_new_copy(r_dest: CValuesRef<godot_pool_vector2_array>?, p_src: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge220(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_new_with_array(r_dest: CValuesRef<godot_pool_vector2_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge221(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_append(p_self: CValuesRef<godot_pool_vector2_array>?, p_data: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge222(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_append_array(p_self: CValuesRef<godot_pool_vector2_array>?, p_array: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge223(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_insert(p_self: CValuesRef<godot_pool_vector2_array>?, p_idx: godot_int, p_data: CValuesRef<godot_vector2>?): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge224(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_invert(p_self: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge225(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_push_back(p_self: CValuesRef<godot_pool_vector2_array>?, p_data: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge226(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_remove(p_self: CValuesRef<godot_pool_vector2_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge227(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_vector2_array_resize(p_self: CValuesRef<godot_pool_vector2_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge228(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_vector2_array_read(p_self: CValuesRef<godot_pool_vector2_array>?): CPointer<godot_pool_vector2_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector2_array_read_access>(kniBridge229(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_write(p_self: CValuesRef<godot_pool_vector2_array>?): CPointer<godot_pool_vector2_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector2_array_write_access>(kniBridge230(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_set(p_self: CValuesRef<godot_pool_vector2_array>?, p_idx: godot_int, p_data: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge231(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_get(p_self: CValuesRef<godot_pool_vector2_array>?, p_idx: godot_int): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge232(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_pool_vector2_array_size(p_self: CValuesRef<godot_pool_vector2_array>?): godot_int {
    memScoped {
        return kniBridge233(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_destroy(p_self: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge234(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_new(r_dest: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge235(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_new_copy(r_dest: CValuesRef<godot_pool_vector3_array>?, p_src: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge236(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_new_with_array(r_dest: CValuesRef<godot_pool_vector3_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge237(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_append(p_self: CValuesRef<godot_pool_vector3_array>?, p_data: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge238(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_append_array(p_self: CValuesRef<godot_pool_vector3_array>?, p_array: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge239(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_insert(p_self: CValuesRef<godot_pool_vector3_array>?, p_idx: godot_int, p_data: CValuesRef<godot_vector3>?): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge240(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_invert(p_self: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge241(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_push_back(p_self: CValuesRef<godot_pool_vector3_array>?, p_data: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge242(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_remove(p_self: CValuesRef<godot_pool_vector3_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge243(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_vector3_array_resize(p_self: CValuesRef<godot_pool_vector3_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge244(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_vector3_array_read(p_self: CValuesRef<godot_pool_vector3_array>?): CPointer<godot_pool_vector3_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector3_array_read_access>(kniBridge245(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_write(p_self: CValuesRef<godot_pool_vector3_array>?): CPointer<godot_pool_vector3_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector3_array_write_access>(kniBridge246(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_set(p_self: CValuesRef<godot_pool_vector3_array>?, p_idx: godot_int, p_data: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge247(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_get(p_self: CValuesRef<godot_pool_vector3_array>?, p_idx: godot_int): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge248(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_pool_vector3_array_size(p_self: CValuesRef<godot_pool_vector3_array>?): godot_int {
    memScoped {
        return kniBridge249(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_destroy(p_self: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge250(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_new(r_dest: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge251(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_new_copy(r_dest: CValuesRef<godot_pool_color_array>?, p_src: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge252(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_new_with_array(r_dest: CValuesRef<godot_pool_color_array>?, p_a: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge253(r_dest?.getPointer(memScope).rawValue, p_a?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_append(p_self: CValuesRef<godot_pool_color_array>?, p_data: CValuesRef<godot_color>?): Unit {
    memScoped {
        return kniBridge254(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_append_array(p_self: CValuesRef<godot_pool_color_array>?, p_array: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge255(p_self?.getPointer(memScope).rawValue, p_array?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_insert(p_self: CValuesRef<godot_pool_color_array>?, p_idx: godot_int, p_data: CValuesRef<godot_color>?): godot_error {
    memScoped {
        return godot_error.byValue(kniBridge256(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_invert(p_self: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge257(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_push_back(p_self: CValuesRef<godot_pool_color_array>?, p_data: CValuesRef<godot_color>?): Unit {
    memScoped {
        return kniBridge258(p_self?.getPointer(memScope).rawValue, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_remove(p_self: CValuesRef<godot_pool_color_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge259(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_pool_color_array_resize(p_self: CValuesRef<godot_pool_color_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge260(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_pool_color_array_read(p_self: CValuesRef<godot_pool_color_array>?): CPointer<godot_pool_color_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_color_array_read_access>(kniBridge261(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_write(p_self: CValuesRef<godot_pool_color_array>?): CPointer<godot_pool_color_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_color_array_write_access>(kniBridge262(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_set(p_self: CValuesRef<godot_pool_color_array>?, p_idx: godot_int, p_data: CValuesRef<godot_color>?): Unit {
    memScoped {
        return kniBridge263(p_self?.getPointer(memScope).rawValue, p_idx, p_data?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_get(p_self: CValuesRef<godot_pool_color_array>?, p_idx: godot_int): CValue<godot_color> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_color>()
        try {
            kniBridge264(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_pool_color_array_size(p_self: CValuesRef<godot_pool_color_array>?): godot_int {
    memScoped {
        return kniBridge265(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_destroy(p_self: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge266(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_read_access_copy(p_other: CValuesRef<godot_pool_byte_array_read_access>?): CPointer<godot_pool_byte_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_byte_array_read_access>(kniBridge267(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_byte_array_read_access_ptr(p_read: CValuesRef<godot_pool_byte_array_read_access>?): CPointer<uint8_tVar>? {
    memScoped {
        return interpretCPointer<uint8_tVar>(kniBridge268(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_byte_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_byte_array_read_access>?, p_other: CValuesRef<godot_pool_byte_array_read_access>?): Unit {
    memScoped {
        return kniBridge269(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_read_access_destroy(p_read: CValuesRef<godot_pool_byte_array_read_access>?): Unit {
    memScoped {
        return kniBridge270(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_read_access_copy(p_other: CValuesRef<godot_pool_int_array_read_access>?): CPointer<godot_pool_int_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_int_array_read_access>(kniBridge271(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_int_array_read_access_ptr(p_read: CValuesRef<godot_pool_int_array_read_access>?): CPointer<godot_intVar>? {
    memScoped {
        return interpretCPointer<godot_intVar>(kniBridge272(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_int_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_int_array_read_access>?, p_other: CValuesRef<godot_pool_int_array_read_access>?): Unit {
    memScoped {
        return kniBridge273(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_read_access_destroy(p_read: CValuesRef<godot_pool_int_array_read_access>?): Unit {
    memScoped {
        return kniBridge274(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_read_access_copy(p_other: CValuesRef<godot_pool_real_array_read_access>?): CPointer<godot_pool_real_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_real_array_read_access>(kniBridge275(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_real_array_read_access_ptr(p_read: CValuesRef<godot_pool_real_array_read_access>?): CPointer<godot_realVar>? {
    memScoped {
        return interpretCPointer<godot_realVar>(kniBridge276(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_real_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_real_array_read_access>?, p_other: CValuesRef<godot_pool_real_array_read_access>?): Unit {
    memScoped {
        return kniBridge277(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_read_access_destroy(p_read: CValuesRef<godot_pool_real_array_read_access>?): Unit {
    memScoped {
        return kniBridge278(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_read_access_copy(p_other: CValuesRef<godot_pool_string_array_read_access>?): CPointer<godot_pool_string_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_string_array_read_access>(kniBridge279(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_read_access_ptr(p_read: CValuesRef<godot_pool_string_array_read_access>?): CPointer<godot_string>? {
    memScoped {
        return interpretCPointer<godot_string>(kniBridge280(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_string_array_read_access>?, p_other: CValuesRef<godot_pool_string_array_read_access>?): Unit {
    memScoped {
        return kniBridge281(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_read_access_destroy(p_read: CValuesRef<godot_pool_string_array_read_access>?): Unit {
    memScoped {
        return kniBridge282(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_read_access_copy(p_other: CValuesRef<godot_pool_vector2_array_read_access>?): CPointer<godot_pool_vector2_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector2_array_read_access>(kniBridge283(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_read_access_ptr(p_read: CValuesRef<godot_pool_vector2_array_read_access>?): CPointer<godot_vector2>? {
    memScoped {
        return interpretCPointer<godot_vector2>(kniBridge284(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_vector2_array_read_access>?, p_other: CValuesRef<godot_pool_vector2_array_read_access>?): Unit {
    memScoped {
        return kniBridge285(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_read_access_destroy(p_read: CValuesRef<godot_pool_vector2_array_read_access>?): Unit {
    memScoped {
        return kniBridge286(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_read_access_copy(p_other: CValuesRef<godot_pool_vector3_array_read_access>?): CPointer<godot_pool_vector3_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector3_array_read_access>(kniBridge287(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_read_access_ptr(p_read: CValuesRef<godot_pool_vector3_array_read_access>?): CPointer<godot_vector3>? {
    memScoped {
        return interpretCPointer<godot_vector3>(kniBridge288(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_vector3_array_read_access>?, p_other: CValuesRef<godot_pool_vector3_array_read_access>?): Unit {
    memScoped {
        return kniBridge289(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_read_access_destroy(p_read: CValuesRef<godot_pool_vector3_array_read_access>?): Unit {
    memScoped {
        return kniBridge290(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_read_access_copy(p_other: CValuesRef<godot_pool_color_array_read_access>?): CPointer<godot_pool_color_array_read_access>? {
    memScoped {
        return interpretCPointer<godot_pool_color_array_read_access>(kniBridge291(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_read_access_ptr(p_read: CValuesRef<godot_pool_color_array_read_access>?): CPointer<godot_color>? {
    memScoped {
        return interpretCPointer<godot_color>(kniBridge292(p_read?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_read_access_operator_assign(p_read: CValuesRef<godot_pool_color_array_read_access>?, p_other: CValuesRef<godot_pool_color_array_read_access>?): Unit {
    memScoped {
        return kniBridge293(p_read?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_read_access_destroy(p_read: CValuesRef<godot_pool_color_array_read_access>?): Unit {
    memScoped {
        return kniBridge294(p_read?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_write_access_copy(p_other: CValuesRef<godot_pool_byte_array_write_access>?): CPointer<godot_pool_byte_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_byte_array_write_access>(kniBridge295(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_byte_array_write_access_ptr(p_write: CValuesRef<godot_pool_byte_array_write_access>?): CPointer<uint8_tVar>? {
    memScoped {
        return interpretCPointer<uint8_tVar>(kniBridge296(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_byte_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_byte_array_write_access>?, p_other: CValuesRef<godot_pool_byte_array_write_access>?): Unit {
    memScoped {
        return kniBridge297(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_byte_array_write_access_destroy(p_write: CValuesRef<godot_pool_byte_array_write_access>?): Unit {
    memScoped {
        return kniBridge298(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_write_access_copy(p_other: CValuesRef<godot_pool_int_array_write_access>?): CPointer<godot_pool_int_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_int_array_write_access>(kniBridge299(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_int_array_write_access_ptr(p_write: CValuesRef<godot_pool_int_array_write_access>?): CPointer<godot_intVar>? {
    memScoped {
        return interpretCPointer<godot_intVar>(kniBridge300(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_int_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_int_array_write_access>?, p_other: CValuesRef<godot_pool_int_array_write_access>?): Unit {
    memScoped {
        return kniBridge301(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_int_array_write_access_destroy(p_write: CValuesRef<godot_pool_int_array_write_access>?): Unit {
    memScoped {
        return kniBridge302(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_write_access_copy(p_other: CValuesRef<godot_pool_real_array_write_access>?): CPointer<godot_pool_real_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_real_array_write_access>(kniBridge303(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_real_array_write_access_ptr(p_write: CValuesRef<godot_pool_real_array_write_access>?): CPointer<godot_realVar>? {
    memScoped {
        return interpretCPointer<godot_realVar>(kniBridge304(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_real_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_real_array_write_access>?, p_other: CValuesRef<godot_pool_real_array_write_access>?): Unit {
    memScoped {
        return kniBridge305(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_real_array_write_access_destroy(p_write: CValuesRef<godot_pool_real_array_write_access>?): Unit {
    memScoped {
        return kniBridge306(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_write_access_copy(p_other: CValuesRef<godot_pool_string_array_write_access>?): CPointer<godot_pool_string_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_string_array_write_access>(kniBridge307(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_write_access_ptr(p_write: CValuesRef<godot_pool_string_array_write_access>?): CPointer<godot_string>? {
    memScoped {
        return interpretCPointer<godot_string>(kniBridge308(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_string_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_string_array_write_access>?, p_other: CValuesRef<godot_pool_string_array_write_access>?): Unit {
    memScoped {
        return kniBridge309(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_string_array_write_access_destroy(p_write: CValuesRef<godot_pool_string_array_write_access>?): Unit {
    memScoped {
        return kniBridge310(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_write_access_copy(p_other: CValuesRef<godot_pool_vector2_array_write_access>?): CPointer<godot_pool_vector2_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector2_array_write_access>(kniBridge311(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_write_access_ptr(p_write: CValuesRef<godot_pool_vector2_array_write_access>?): CPointer<godot_vector2>? {
    memScoped {
        return interpretCPointer<godot_vector2>(kniBridge312(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector2_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_vector2_array_write_access>?, p_other: CValuesRef<godot_pool_vector2_array_write_access>?): Unit {
    memScoped {
        return kniBridge313(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector2_array_write_access_destroy(p_write: CValuesRef<godot_pool_vector2_array_write_access>?): Unit {
    memScoped {
        return kniBridge314(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_write_access_copy(p_other: CValuesRef<godot_pool_vector3_array_write_access>?): CPointer<godot_pool_vector3_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_vector3_array_write_access>(kniBridge315(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_write_access_ptr(p_write: CValuesRef<godot_pool_vector3_array_write_access>?): CPointer<godot_vector3>? {
    memScoped {
        return interpretCPointer<godot_vector3>(kniBridge316(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_vector3_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_vector3_array_write_access>?, p_other: CValuesRef<godot_pool_vector3_array_write_access>?): Unit {
    memScoped {
        return kniBridge317(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_vector3_array_write_access_destroy(p_write: CValuesRef<godot_pool_vector3_array_write_access>?): Unit {
    memScoped {
        return kniBridge318(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_write_access_copy(p_other: CValuesRef<godot_pool_color_array_write_access>?): CPointer<godot_pool_color_array_write_access>? {
    memScoped {
        return interpretCPointer<godot_pool_color_array_write_access>(kniBridge319(p_other?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_write_access_ptr(p_write: CValuesRef<godot_pool_color_array_write_access>?): CPointer<godot_color>? {
    memScoped {
        return interpretCPointer<godot_color>(kniBridge320(p_write?.getPointer(memScope).rawValue))
    }
}

fun godot_pool_color_array_write_access_operator_assign(p_write: CValuesRef<godot_pool_color_array_write_access>?, p_other: CValuesRef<godot_pool_color_array_write_access>?): Unit {
    memScoped {
        return kniBridge321(p_write?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue)
    }
}

fun godot_pool_color_array_write_access_destroy(p_write: CValuesRef<godot_pool_color_array_write_access>?): Unit {
    memScoped {
        return kniBridge322(p_write?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_new(r_dest: CValuesRef<godot_dictionary>?): Unit {
    memScoped {
        return kniBridge323(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_new_copy(r_dest: CValuesRef<godot_dictionary>?, p_src: CValuesRef<godot_dictionary>?): Unit {
    memScoped {
        return kniBridge324(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_destroy(p_self: CValuesRef<godot_dictionary>?): Unit {
    memScoped {
        return kniBridge325(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_size(p_self: CValuesRef<godot_dictionary>?): godot_int {
    memScoped {
        return kniBridge326(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_empty(p_self: CValuesRef<godot_dictionary>?): godot_bool {
    memScoped {
        return kniBridge327(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_dictionary_clear(p_self: CValuesRef<godot_dictionary>?): Unit {
    memScoped {
        return kniBridge328(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_has(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge329(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_dictionary_has_all(p_self: CValuesRef<godot_dictionary>?, p_keys: CValuesRef<godot_array>?): godot_bool {
    memScoped {
        return kniBridge330(p_self?.getPointer(memScope).rawValue, p_keys?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_dictionary_erase(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge331(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_hash(p_self: CValuesRef<godot_dictionary>?): godot_int {
    memScoped {
        return kniBridge332(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_keys(p_self: CValuesRef<godot_dictionary>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge333(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_dictionary_values(p_self: CValuesRef<godot_dictionary>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge334(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_dictionary_get(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge335(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_dictionary_set(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge336(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_dictionary_operator_index(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?): CPointer<godot_variant>? {
    memScoped {
        return interpretCPointer<godot_variant>(kniBridge337(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue))
    }
}

fun godot_dictionary_operator_index_const(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?): CPointer<godot_variant>? {
    memScoped {
        return interpretCPointer<godot_variant>(kniBridge338(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue))
    }
}

fun godot_dictionary_next(p_self: CValuesRef<godot_dictionary>?, p_key: CValuesRef<godot_variant>?): CPointer<godot_variant>? {
    memScoped {
        return interpretCPointer<godot_variant>(kniBridge339(p_self?.getPointer(memScope).rawValue, p_key?.getPointer(memScope).rawValue))
    }
}

fun godot_dictionary_operator_equal(p_self: CValuesRef<godot_dictionary>?, p_b: CValuesRef<godot_dictionary>?): godot_bool {
    memScoped {
        return kniBridge340(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_dictionary_to_json(p_self: CValuesRef<godot_dictionary>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge341(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_node_path_new(r_dest: CValuesRef<godot_node_path>?, p_from: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge342(r_dest?.getPointer(memScope).rawValue, p_from?.getPointer(memScope).rawValue)
    }
}

fun godot_node_path_new_copy(r_dest: CValuesRef<godot_node_path>?, p_src: CValuesRef<godot_node_path>?): Unit {
    memScoped {
        return kniBridge343(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_node_path_destroy(p_self: CValuesRef<godot_node_path>?): Unit {
    memScoped {
        return kniBridge344(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_node_path_as_string(p_self: CValuesRef<godot_node_path>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge345(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_node_path_is_absolute(p_self: CValuesRef<godot_node_path>?): godot_bool {
    memScoped {
        return kniBridge346(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_node_path_get_name_count(p_self: CValuesRef<godot_node_path>?): godot_int {
    memScoped {
        return kniBridge347(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_node_path_get_name(p_self: CValuesRef<godot_node_path>?, p_idx: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge348(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_node_path_get_subname_count(p_self: CValuesRef<godot_node_path>?): godot_int {
    memScoped {
        return kniBridge349(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_node_path_get_subname(p_self: CValuesRef<godot_node_path>?, p_idx: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge350(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_node_path_get_concatenated_subnames(p_self: CValuesRef<godot_node_path>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge351(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_node_path_is_empty(p_self: CValuesRef<godot_node_path>?): godot_bool {
    memScoped {
        return kniBridge352(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_node_path_operator_equal(p_self: CValuesRef<godot_node_path>?, p_b: CValuesRef<godot_node_path>?): godot_bool {
    memScoped {
        return kniBridge353(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_plane_new_with_reals(r_dest: CValuesRef<godot_plane>?, p_a: godot_real, p_b: godot_real, p_c: godot_real, p_d: godot_real): Unit {
    memScoped {
        return kniBridge354(r_dest?.getPointer(memScope).rawValue, p_a, p_b, p_c, p_d)
    }
}

fun godot_plane_new_with_vectors(r_dest: CValuesRef<godot_plane>?, p_v1: CValuesRef<godot_vector3>?, p_v2: CValuesRef<godot_vector3>?, p_v3: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge355(r_dest?.getPointer(memScope).rawValue, p_v1?.getPointer(memScope).rawValue, p_v2?.getPointer(memScope).rawValue, p_v3?.getPointer(memScope).rawValue)
    }
}

fun godot_plane_new_with_normal(r_dest: CValuesRef<godot_plane>?, p_normal: CValuesRef<godot_vector3>?, p_d: godot_real): Unit {
    memScoped {
        return kniBridge356(r_dest?.getPointer(memScope).rawValue, p_normal?.getPointer(memScope).rawValue, p_d)
    }
}

fun godot_plane_as_string(p_self: CValuesRef<godot_plane>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge357(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_normalized(p_self: CValuesRef<godot_plane>?): CValue<godot_plane> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_plane>()
        try {
            kniBridge358(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_center(p_self: CValuesRef<godot_plane>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge359(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_get_any_point(p_self: CValuesRef<godot_plane>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge360(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_is_point_over(p_self: CValuesRef<godot_plane>?, p_point: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge361(p_self?.getPointer(memScope).rawValue, p_point?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_plane_distance_to(p_self: CValuesRef<godot_plane>?, p_point: CValuesRef<godot_vector3>?): godot_real {
    memScoped {
        return kniBridge362(p_self?.getPointer(memScope).rawValue, p_point?.getPointer(memScope).rawValue)
    }
}

fun godot_plane_has_point(p_self: CValuesRef<godot_plane>?, p_point: CValuesRef<godot_vector3>?, p_epsilon: godot_real): godot_bool {
    memScoped {
        return kniBridge363(p_self?.getPointer(memScope).rawValue, p_point?.getPointer(memScope).rawValue, p_epsilon).toBoolean()
    }
}

fun godot_plane_project(p_self: CValuesRef<godot_plane>?, p_point: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge364(p_self?.getPointer(memScope).rawValue, p_point?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_intersect_3(p_self: CValuesRef<godot_plane>?, r_dest: CValuesRef<godot_vector3>?, p_b: CValuesRef<godot_plane>?, p_c: CValuesRef<godot_plane>?): godot_bool {
    memScoped {
        return kniBridge365(p_self?.getPointer(memScope).rawValue, r_dest?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, p_c?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_plane_intersects_ray(p_self: CValuesRef<godot_plane>?, r_dest: CValuesRef<godot_vector3>?, p_from: CValuesRef<godot_vector3>?, p_dir: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge366(p_self?.getPointer(memScope).rawValue, r_dest?.getPointer(memScope).rawValue, p_from?.getPointer(memScope).rawValue, p_dir?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_plane_intersects_segment(p_self: CValuesRef<godot_plane>?, r_dest: CValuesRef<godot_vector3>?, p_begin: CValuesRef<godot_vector3>?, p_end: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge367(p_self?.getPointer(memScope).rawValue, r_dest?.getPointer(memScope).rawValue, p_begin?.getPointer(memScope).rawValue, p_end?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_plane_operator_neg(p_self: CValuesRef<godot_plane>?): CValue<godot_plane> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_plane>()
        try {
            kniBridge368(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_operator_equal(p_self: CValuesRef<godot_plane>?, p_b: CValuesRef<godot_plane>?): godot_bool {
    memScoped {
        return kniBridge369(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_plane_set_normal(p_self: CValuesRef<godot_plane>?, p_normal: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge370(p_self?.getPointer(memScope).rawValue, p_normal?.getPointer(memScope).rawValue)
    }
}

fun godot_plane_get_normal(p_self: CValuesRef<godot_plane>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge371(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_plane_get_d(p_self: CValuesRef<godot_plane>?): godot_real {
    memScoped {
        return kniBridge372(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_plane_set_d(p_self: CValuesRef<godot_plane>?, p_d: godot_real): Unit {
    memScoped {
        return kniBridge373(p_self?.getPointer(memScope).rawValue, p_d)
    }
}

fun godot_rect2_new_with_position_and_size(r_dest: CValuesRef<godot_rect2>?, p_pos: CValuesRef<godot_vector2>?, p_size: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge374(r_dest?.getPointer(memScope).rawValue, p_pos?.getPointer(memScope).rawValue, p_size?.getPointer(memScope).rawValue)
    }
}

fun godot_rect2_new(r_dest: CValuesRef<godot_rect2>?, p_x: godot_real, p_y: godot_real, p_width: godot_real, p_height: godot_real): Unit {
    memScoped {
        return kniBridge375(r_dest?.getPointer(memScope).rawValue, p_x, p_y, p_width, p_height)
    }
}

fun godot_rect2_as_string(p_self: CValuesRef<godot_rect2>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge376(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_get_area(p_self: CValuesRef<godot_rect2>?): godot_real {
    memScoped {
        return kniBridge377(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_rect2_intersects(p_self: CValuesRef<godot_rect2>?, p_b: CValuesRef<godot_rect2>?): godot_bool {
    memScoped {
        return kniBridge378(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_rect2_encloses(p_self: CValuesRef<godot_rect2>?, p_b: CValuesRef<godot_rect2>?): godot_bool {
    memScoped {
        return kniBridge379(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_rect2_has_no_area(p_self: CValuesRef<godot_rect2>?): godot_bool {
    memScoped {
        return kniBridge380(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_rect2_clip(p_self: CValuesRef<godot_rect2>?, p_b: CValuesRef<godot_rect2>?): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge381(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_merge(p_self: CValuesRef<godot_rect2>?, p_b: CValuesRef<godot_rect2>?): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge382(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_has_point(p_self: CValuesRef<godot_rect2>?, p_point: CValuesRef<godot_vector2>?): godot_bool {
    memScoped {
        return kniBridge383(p_self?.getPointer(memScope).rawValue, p_point?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_rect2_grow(p_self: CValuesRef<godot_rect2>?, p_by: godot_real): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge384(p_self?.getPointer(memScope).rawValue, p_by, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_expand(p_self: CValuesRef<godot_rect2>?, p_to: CValuesRef<godot_vector2>?): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge385(p_self?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_operator_equal(p_self: CValuesRef<godot_rect2>?, p_b: CValuesRef<godot_rect2>?): godot_bool {
    memScoped {
        return kniBridge386(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_rect2_get_position(p_self: CValuesRef<godot_rect2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge387(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_get_size(p_self: CValuesRef<godot_rect2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge388(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_rect2_set_position(p_self: CValuesRef<godot_rect2>?, p_pos: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge389(p_self?.getPointer(memScope).rawValue, p_pos?.getPointer(memScope).rawValue)
    }
}

fun godot_rect2_set_size(p_self: CValuesRef<godot_rect2>?, p_size: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge390(p_self?.getPointer(memScope).rawValue, p_size?.getPointer(memScope).rawValue)
    }
}

fun godot_rid_new(r_dest: CValuesRef<godot_rid>?): Unit {
    memScoped {
        return kniBridge391(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_rid_get_id(p_self: CValuesRef<godot_rid>?): godot_int {
    memScoped {
        return kniBridge392(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_rid_new_with_resource(r_dest: CValuesRef<godot_rid>?, p_from: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge393(r_dest?.getPointer(memScope).rawValue, p_from?.getPointer(memScope).rawValue)
    }
}

fun godot_rid_operator_equal(p_self: CValuesRef<godot_rid>?, p_b: CValuesRef<godot_rid>?): godot_bool {
    memScoped {
        return kniBridge394(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_rid_operator_less(p_self: CValuesRef<godot_rid>?, p_b: CValuesRef<godot_rid>?): godot_bool {
    memScoped {
        return kniBridge395(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_transform_new_with_axis_origin(r_dest: CValuesRef<godot_transform>?, p_x_axis: CValuesRef<godot_vector3>?, p_y_axis: CValuesRef<godot_vector3>?, p_z_axis: CValuesRef<godot_vector3>?, p_origin: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge396(r_dest?.getPointer(memScope).rawValue, p_x_axis?.getPointer(memScope).rawValue, p_y_axis?.getPointer(memScope).rawValue, p_z_axis?.getPointer(memScope).rawValue, p_origin?.getPointer(memScope).rawValue)
    }
}

fun godot_transform_new(r_dest: CValuesRef<godot_transform>?, p_basis: CValuesRef<godot_basis>?, p_origin: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge397(r_dest?.getPointer(memScope).rawValue, p_basis?.getPointer(memScope).rawValue, p_origin?.getPointer(memScope).rawValue)
    }
}

fun godot_transform_get_basis(p_self: CValuesRef<godot_transform>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge398(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_set_basis(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_basis>?): Unit {
    memScoped {
        return kniBridge399(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue)
    }
}

fun godot_transform_get_origin(p_self: CValuesRef<godot_transform>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge400(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_set_origin(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge401(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue)
    }
}

fun godot_transform_as_string(p_self: CValuesRef<godot_transform>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge402(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_inverse(p_self: CValuesRef<godot_transform>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge403(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_affine_inverse(p_self: CValuesRef<godot_transform>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge404(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_orthonormalized(p_self: CValuesRef<godot_transform>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge405(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_rotated(p_self: CValuesRef<godot_transform>?, p_axis: CValuesRef<godot_vector3>?, p_phi: godot_real): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge406(p_self?.getPointer(memScope).rawValue, p_axis?.getPointer(memScope).rawValue, p_phi, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_scaled(p_self: CValuesRef<godot_transform>?, p_scale: CValuesRef<godot_vector3>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge407(p_self?.getPointer(memScope).rawValue, p_scale?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_translated(p_self: CValuesRef<godot_transform>?, p_ofs: CValuesRef<godot_vector3>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge408(p_self?.getPointer(memScope).rawValue, p_ofs?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_looking_at(p_self: CValuesRef<godot_transform>?, p_target: CValuesRef<godot_vector3>?, p_up: CValuesRef<godot_vector3>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge409(p_self?.getPointer(memScope).rawValue, p_target?.getPointer(memScope).rawValue, p_up?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_xform_plane(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_plane>?): CValue<godot_plane> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_plane>()
        try {
            kniBridge410(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_xform_inv_plane(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_plane>?): CValue<godot_plane> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_plane>()
        try {
            kniBridge411(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_new_identity(r_dest: CValuesRef<godot_transform>?): Unit {
    memScoped {
        return kniBridge412(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_transform_operator_equal(p_self: CValuesRef<godot_transform>?, p_b: CValuesRef<godot_transform>?): godot_bool {
    memScoped {
        return kniBridge413(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_transform_operator_multiply(p_self: CValuesRef<godot_transform>?, p_b: CValuesRef<godot_transform>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge414(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_xform_vector3(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge415(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_xform_inv_vector3(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge416(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_xform_aabb(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_aabb>?): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge417(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform_xform_inv_aabb(p_self: CValuesRef<godot_transform>?, p_v: CValuesRef<godot_aabb>?): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge418(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_new(r_dest: CValuesRef<godot_transform2d>?, p_rot: godot_real, p_pos: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge419(r_dest?.getPointer(memScope).rawValue, p_rot, p_pos?.getPointer(memScope).rawValue)
    }
}

fun godot_transform2d_new_axis_origin(r_dest: CValuesRef<godot_transform2d>?, p_x_axis: CValuesRef<godot_vector2>?, p_y_axis: CValuesRef<godot_vector2>?, p_origin: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge420(r_dest?.getPointer(memScope).rawValue, p_x_axis?.getPointer(memScope).rawValue, p_y_axis?.getPointer(memScope).rawValue, p_origin?.getPointer(memScope).rawValue)
    }
}

fun godot_transform2d_as_string(p_self: CValuesRef<godot_transform2d>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge421(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_inverse(p_self: CValuesRef<godot_transform2d>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge422(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_affine_inverse(p_self: CValuesRef<godot_transform2d>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge423(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_get_rotation(p_self: CValuesRef<godot_transform2d>?): godot_real {
    memScoped {
        return kniBridge424(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_transform2d_get_origin(p_self: CValuesRef<godot_transform2d>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge425(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_get_scale(p_self: CValuesRef<godot_transform2d>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge426(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_orthonormalized(p_self: CValuesRef<godot_transform2d>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge427(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_rotated(p_self: CValuesRef<godot_transform2d>?, p_phi: godot_real): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge428(p_self?.getPointer(memScope).rawValue, p_phi, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_scaled(p_self: CValuesRef<godot_transform2d>?, p_scale: CValuesRef<godot_vector2>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge429(p_self?.getPointer(memScope).rawValue, p_scale?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_translated(p_self: CValuesRef<godot_transform2d>?, p_offset: CValuesRef<godot_vector2>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge430(p_self?.getPointer(memScope).rawValue, p_offset?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_xform_vector2(p_self: CValuesRef<godot_transform2d>?, p_v: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge431(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_xform_inv_vector2(p_self: CValuesRef<godot_transform2d>?, p_v: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge432(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_basis_xform_vector2(p_self: CValuesRef<godot_transform2d>?, p_v: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge433(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_basis_xform_inv_vector2(p_self: CValuesRef<godot_transform2d>?, p_v: CValuesRef<godot_vector2>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge434(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_interpolate_with(p_self: CValuesRef<godot_transform2d>?, p_m: CValuesRef<godot_transform2d>?, p_c: godot_real): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge435(p_self?.getPointer(memScope).rawValue, p_m?.getPointer(memScope).rawValue, p_c, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_operator_equal(p_self: CValuesRef<godot_transform2d>?, p_b: CValuesRef<godot_transform2d>?): godot_bool {
    memScoped {
        return kniBridge436(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_transform2d_operator_multiply(p_self: CValuesRef<godot_transform2d>?, p_b: CValuesRef<godot_transform2d>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge437(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_new_identity(r_dest: CValuesRef<godot_transform2d>?): Unit {
    memScoped {
        return kniBridge438(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_transform2d_xform_rect2(p_self: CValuesRef<godot_transform2d>?, p_v: CValuesRef<godot_rect2>?): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge439(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_transform2d_xform_inv_rect2(p_self: CValuesRef<godot_transform2d>?, p_v: CValuesRef<godot_rect2>?): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge440(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_get_type(p_v: CValuesRef<godot_variant>?): godot_variant_type {
    memScoped {
        return godot_variant_type.byValue(kniBridge441(p_v?.getPointer(memScope).rawValue))
    }
}

fun godot_variant_new_copy(r_dest: CValuesRef<godot_variant>?, p_src: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge442(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_nil(r_dest: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge443(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_bool(r_dest: CValuesRef<godot_variant>?, p_b: godot_bool): Unit {
    memScoped {
        return kniBridge444(r_dest?.getPointer(memScope).rawValue, p_b.toByte())
    }
}

fun godot_variant_new_uint(r_dest: CValuesRef<godot_variant>?, p_i: uint64_t): Unit {
    memScoped {
        return kniBridge445(r_dest?.getPointer(memScope).rawValue, p_i)
    }
}

fun godot_variant_new_int(r_dest: CValuesRef<godot_variant>?, p_i: int64_t): Unit {
    memScoped {
        return kniBridge446(r_dest?.getPointer(memScope).rawValue, p_i)
    }
}

fun godot_variant_new_real(r_dest: CValuesRef<godot_variant>?, p_r: Double): Unit {
    memScoped {
        return kniBridge447(r_dest?.getPointer(memScope).rawValue, p_r)
    }
}

fun godot_variant_new_string(r_dest: CValuesRef<godot_variant>?, p_s: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge448(r_dest?.getPointer(memScope).rawValue, p_s?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_vector2(r_dest: CValuesRef<godot_variant>?, p_v2: CValuesRef<godot_vector2>?): Unit {
    memScoped {
        return kniBridge449(r_dest?.getPointer(memScope).rawValue, p_v2?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_rect2(r_dest: CValuesRef<godot_variant>?, p_rect2: CValuesRef<godot_rect2>?): Unit {
    memScoped {
        return kniBridge450(r_dest?.getPointer(memScope).rawValue, p_rect2?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_vector3(r_dest: CValuesRef<godot_variant>?, p_v3: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge451(r_dest?.getPointer(memScope).rawValue, p_v3?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_transform2d(r_dest: CValuesRef<godot_variant>?, p_t2d: CValuesRef<godot_transform2d>?): Unit {
    memScoped {
        return kniBridge452(r_dest?.getPointer(memScope).rawValue, p_t2d?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_plane(r_dest: CValuesRef<godot_variant>?, p_plane: CValuesRef<godot_plane>?): Unit {
    memScoped {
        return kniBridge453(r_dest?.getPointer(memScope).rawValue, p_plane?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_quat(r_dest: CValuesRef<godot_variant>?, p_quat: CValuesRef<godot_quat>?): Unit {
    memScoped {
        return kniBridge454(r_dest?.getPointer(memScope).rawValue, p_quat?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_aabb(r_dest: CValuesRef<godot_variant>?, p_aabb: CValuesRef<godot_aabb>?): Unit {
    memScoped {
        return kniBridge455(r_dest?.getPointer(memScope).rawValue, p_aabb?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_basis(r_dest: CValuesRef<godot_variant>?, p_basis: CValuesRef<godot_basis>?): Unit {
    memScoped {
        return kniBridge456(r_dest?.getPointer(memScope).rawValue, p_basis?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_transform(r_dest: CValuesRef<godot_variant>?, p_trans: CValuesRef<godot_transform>?): Unit {
    memScoped {
        return kniBridge457(r_dest?.getPointer(memScope).rawValue, p_trans?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_color(r_dest: CValuesRef<godot_variant>?, p_color: CValuesRef<godot_color>?): Unit {
    memScoped {
        return kniBridge458(r_dest?.getPointer(memScope).rawValue, p_color?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_node_path(r_dest: CValuesRef<godot_variant>?, p_np: CValuesRef<godot_node_path>?): Unit {
    memScoped {
        return kniBridge459(r_dest?.getPointer(memScope).rawValue, p_np?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_rid(r_dest: CValuesRef<godot_variant>?, p_rid: CValuesRef<godot_rid>?): Unit {
    memScoped {
        return kniBridge460(r_dest?.getPointer(memScope).rawValue, p_rid?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_object(r_dest: CValuesRef<godot_variant>?, p_obj: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge461(r_dest?.getPointer(memScope).rawValue, p_obj?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_dictionary(r_dest: CValuesRef<godot_variant>?, p_dict: CValuesRef<godot_dictionary>?): Unit {
    memScoped {
        return kniBridge462(r_dest?.getPointer(memScope).rawValue, p_dict?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_array(r_dest: CValuesRef<godot_variant>?, p_arr: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge463(r_dest?.getPointer(memScope).rawValue, p_arr?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_byte_array(r_dest: CValuesRef<godot_variant>?, p_pba: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge464(r_dest?.getPointer(memScope).rawValue, p_pba?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_int_array(r_dest: CValuesRef<godot_variant>?, p_pia: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge465(r_dest?.getPointer(memScope).rawValue, p_pia?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_real_array(r_dest: CValuesRef<godot_variant>?, p_pra: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge466(r_dest?.getPointer(memScope).rawValue, p_pra?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_string_array(r_dest: CValuesRef<godot_variant>?, p_psa: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge467(r_dest?.getPointer(memScope).rawValue, p_psa?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_vector2_array(r_dest: CValuesRef<godot_variant>?, p_pv2a: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge468(r_dest?.getPointer(memScope).rawValue, p_pv2a?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_vector3_array(r_dest: CValuesRef<godot_variant>?, p_pv3a: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge469(r_dest?.getPointer(memScope).rawValue, p_pv3a?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_new_pool_color_array(r_dest: CValuesRef<godot_variant>?, p_pca: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge470(r_dest?.getPointer(memScope).rawValue, p_pca?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_as_bool(p_self: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge471(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_variant_as_uint(p_self: CValuesRef<godot_variant>?): uint64_t {
    memScoped {
        return kniBridge472(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_as_int(p_self: CValuesRef<godot_variant>?): int64_t {
    memScoped {
        return kniBridge473(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_as_real(p_self: CValuesRef<godot_variant>?): Double {
    memScoped {
        return kniBridge474(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_variant_as_string(p_self: CValuesRef<godot_variant>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge475(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_vector2(p_self: CValuesRef<godot_variant>?): CValue<godot_vector2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector2>()
        try {
            kniBridge476(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_rect2(p_self: CValuesRef<godot_variant>?): CValue<godot_rect2> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rect2>()
        try {
            kniBridge477(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_vector3(p_self: CValuesRef<godot_variant>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge478(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_transform2d(p_self: CValuesRef<godot_variant>?): CValue<godot_transform2d> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform2d>()
        try {
            kniBridge479(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_plane(p_self: CValuesRef<godot_variant>?): CValue<godot_plane> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_plane>()
        try {
            kniBridge480(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_quat(p_self: CValuesRef<godot_variant>?): CValue<godot_quat> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_quat>()
        try {
            kniBridge481(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_aabb(p_self: CValuesRef<godot_variant>?): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge482(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_basis(p_self: CValuesRef<godot_variant>?): CValue<godot_basis> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_basis>()
        try {
            kniBridge483(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_transform(p_self: CValuesRef<godot_variant>?): CValue<godot_transform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_transform>()
        try {
            kniBridge484(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_color(p_self: CValuesRef<godot_variant>?): CValue<godot_color> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_color>()
        try {
            kniBridge485(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_node_path(p_self: CValuesRef<godot_variant>?): CValue<godot_node_path> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_node_path>()
        try {
            kniBridge486(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_rid(p_self: CValuesRef<godot_variant>?): CValue<godot_rid> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_rid>()
        try {
            kniBridge487(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_object(p_self: CValuesRef<godot_variant>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge488(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_variant_as_dictionary(p_self: CValuesRef<godot_variant>?): CValue<godot_dictionary> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_dictionary>()
        try {
            kniBridge489(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_array(p_self: CValuesRef<godot_variant>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge490(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_byte_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_byte_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_byte_array>()
        try {
            kniBridge491(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_int_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_int_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_int_array>()
        try {
            kniBridge492(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_real_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_real_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_real_array>()
        try {
            kniBridge493(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_string_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_string_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_string_array>()
        try {
            kniBridge494(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_vector2_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_vector2_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_vector2_array>()
        try {
            kniBridge495(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_vector3_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_vector3_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_vector3_array>()
        try {
            kniBridge496(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_as_pool_color_array(p_self: CValuesRef<godot_variant>?): CValue<godot_pool_color_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_color_array>()
        try {
            kniBridge497(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_call(p_self: CValuesRef<godot_variant>?, p_method: CValuesRef<godot_string>?, p_args: CValuesRef<CPointerVar<godot_variant>>?, p_argcount: godot_int, r_error: CValuesRef<godot_variant_call_error>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge498(p_self?.getPointer(memScope).rawValue, p_method?.getPointer(memScope).rawValue, p_args?.getPointer(memScope).rawValue, p_argcount, r_error?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_variant_has_method(p_self: CValuesRef<godot_variant>?, p_method: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge499(p_self?.getPointer(memScope).rawValue, p_method?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_variant_operator_equal(p_self: CValuesRef<godot_variant>?, p_other: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge500(p_self?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_variant_operator_less(p_self: CValuesRef<godot_variant>?, p_other: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge501(p_self?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_variant_hash_compare(p_self: CValuesRef<godot_variant>?, p_other: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge502(p_self?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_variant_booleanize(p_self: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge503(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_variant_destroy(p_self: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge504(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new(r_dest: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge505(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_copy(r_dest: CValuesRef<godot_array>?, p_src: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge506(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_color_array(r_dest: CValuesRef<godot_array>?, p_pca: CValuesRef<godot_pool_color_array>?): Unit {
    memScoped {
        return kniBridge507(r_dest?.getPointer(memScope).rawValue, p_pca?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_vector3_array(r_dest: CValuesRef<godot_array>?, p_pv3a: CValuesRef<godot_pool_vector3_array>?): Unit {
    memScoped {
        return kniBridge508(r_dest?.getPointer(memScope).rawValue, p_pv3a?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_vector2_array(r_dest: CValuesRef<godot_array>?, p_pv2a: CValuesRef<godot_pool_vector2_array>?): Unit {
    memScoped {
        return kniBridge509(r_dest?.getPointer(memScope).rawValue, p_pv2a?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_string_array(r_dest: CValuesRef<godot_array>?, p_psa: CValuesRef<godot_pool_string_array>?): Unit {
    memScoped {
        return kniBridge510(r_dest?.getPointer(memScope).rawValue, p_psa?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_real_array(r_dest: CValuesRef<godot_array>?, p_pra: CValuesRef<godot_pool_real_array>?): Unit {
    memScoped {
        return kniBridge511(r_dest?.getPointer(memScope).rawValue, p_pra?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_int_array(r_dest: CValuesRef<godot_array>?, p_pia: CValuesRef<godot_pool_int_array>?): Unit {
    memScoped {
        return kniBridge512(r_dest?.getPointer(memScope).rawValue, p_pia?.getPointer(memScope).rawValue)
    }
}

fun godot_array_new_pool_byte_array(r_dest: CValuesRef<godot_array>?, p_pba: CValuesRef<godot_pool_byte_array>?): Unit {
    memScoped {
        return kniBridge513(r_dest?.getPointer(memScope).rawValue, p_pba?.getPointer(memScope).rawValue)
    }
}

fun godot_array_set(p_self: CValuesRef<godot_array>?, p_idx: godot_int, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge514(p_self?.getPointer(memScope).rawValue, p_idx, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_get(p_self: CValuesRef<godot_array>?, p_idx: godot_int): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge515(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_array_operator_index(p_self: CValuesRef<godot_array>?, p_idx: godot_int): CPointer<godot_variant>? {
    memScoped {
        return interpretCPointer<godot_variant>(kniBridge516(p_self?.getPointer(memScope).rawValue, p_idx))
    }
}

fun godot_array_operator_index_const(p_self: CValuesRef<godot_array>?, p_idx: godot_int): CPointer<godot_variant>? {
    memScoped {
        return interpretCPointer<godot_variant>(kniBridge517(p_self?.getPointer(memScope).rawValue, p_idx))
    }
}

fun godot_array_append(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge518(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_clear(p_self: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge519(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_array_count(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?): godot_int {
    memScoped {
        return kniBridge520(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_empty(p_self: CValuesRef<godot_array>?): godot_bool {
    memScoped {
        return kniBridge521(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_array_erase(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge522(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_front(p_self: CValuesRef<godot_array>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge523(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_array_back(p_self: CValuesRef<godot_array>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge524(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_array_find(p_self: CValuesRef<godot_array>?, p_what: CValuesRef<godot_variant>?, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge525(p_self?.getPointer(memScope).rawValue, p_what?.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_array_find_last(p_self: CValuesRef<godot_array>?, p_what: CValuesRef<godot_variant>?): godot_int {
    memScoped {
        return kniBridge526(p_self?.getPointer(memScope).rawValue, p_what?.getPointer(memScope).rawValue)
    }
}

fun godot_array_has(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?): godot_bool {
    memScoped {
        return kniBridge527(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_array_hash(p_self: CValuesRef<godot_array>?): godot_int {
    memScoped {
        return kniBridge528(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_array_insert(p_self: CValuesRef<godot_array>?, p_pos: godot_int, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge529(p_self?.getPointer(memScope).rawValue, p_pos, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_invert(p_self: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge530(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_array_pop_back(p_self: CValuesRef<godot_array>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge531(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_array_pop_front(p_self: CValuesRef<godot_array>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge532(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_array_push_back(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge533(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_push_front(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?): Unit {
    memScoped {
        return kniBridge534(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue)
    }
}

fun godot_array_remove(p_self: CValuesRef<godot_array>?, p_idx: godot_int): Unit {
    memScoped {
        return kniBridge535(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_array_resize(p_self: CValuesRef<godot_array>?, p_size: godot_int): Unit {
    memScoped {
        return kniBridge536(p_self?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_array_rfind(p_self: CValuesRef<godot_array>?, p_what: CValuesRef<godot_variant>?, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge537(p_self?.getPointer(memScope).rawValue, p_what?.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_array_size(p_self: CValuesRef<godot_array>?): godot_int {
    memScoped {
        return kniBridge538(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_array_sort(p_self: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge539(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_array_sort_custom(p_self: CValuesRef<godot_array>?, p_obj: CValuesRef<*>?, p_func: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge540(p_self?.getPointer(memScope).rawValue, p_obj?.getPointer(memScope).rawValue, p_func?.getPointer(memScope).rawValue)
    }
}

fun godot_array_bsearch(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?, p_before: godot_bool): godot_int {
    memScoped {
        return kniBridge541(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue, p_before.toByte())
    }
}

fun godot_array_bsearch_custom(p_self: CValuesRef<godot_array>?, p_value: CValuesRef<godot_variant>?, p_obj: CValuesRef<*>?, p_func: CValuesRef<godot_string>?, p_before: godot_bool): godot_int {
    memScoped {
        return kniBridge542(p_self?.getPointer(memScope).rawValue, p_value?.getPointer(memScope).rawValue, p_obj?.getPointer(memScope).rawValue, p_func?.getPointer(memScope).rawValue, p_before.toByte())
    }
}

fun godot_array_destroy(p_self: CValuesRef<godot_array>?): Unit {
    memScoped {
        return kniBridge543(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_char_string_length(p_cs: CValuesRef<godot_char_string>?): godot_int {
    memScoped {
        return kniBridge544(p_cs?.getPointer(memScope).rawValue)
    }
}

fun godot_char_string_get_data(p_cs: CValuesRef<godot_char_string>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge545(p_cs?.getPointer(memScope).rawValue))
    }
}

fun godot_char_string_destroy(p_cs: CValuesRef<godot_char_string>?): Unit {
    memScoped {
        return kniBridge546(p_cs?.getPointer(memScope).rawValue)
    }
}

fun godot_string_new(r_dest: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge547(r_dest?.getPointer(memScope).rawValue)
    }
}

fun godot_string_new_copy(r_dest: CValuesRef<godot_string>?, p_src: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge548(r_dest?.getPointer(memScope).rawValue, p_src?.getPointer(memScope).rawValue)
    }
}

fun godot_string_new_with_wide_string(r_dest: CValuesRef<godot_string>?, p_contents: CValuesRef<wchar_tVar>?, p_size: Int): Unit {
    memScoped {
        return kniBridge549(r_dest?.getPointer(memScope).rawValue, p_contents?.getPointer(memScope).rawValue, p_size)
    }
}

fun godot_string_operator_index(p_self: CValuesRef<godot_string>?, p_idx: godot_int): CPointer<wchar_tVar>? {
    memScoped {
        return interpretCPointer<wchar_tVar>(kniBridge550(p_self?.getPointer(memScope).rawValue, p_idx))
    }
}

fun godot_string_operator_index_const(p_self: CValuesRef<godot_string>?, p_idx: godot_int): wchar_t {
    memScoped {
        return kniBridge551(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_string_wide_str(p_self: CValuesRef<godot_string>?): CPointer<wchar_tVar>? {
    memScoped {
        return interpretCPointer<wchar_tVar>(kniBridge552(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_string_operator_equal(p_self: CValuesRef<godot_string>?, p_b: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge553(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_operator_less(p_self: CValuesRef<godot_string>?, p_b: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge554(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_operator_plus(p_self: CValuesRef<godot_string>?, p_b: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge555(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_length(p_self: CValuesRef<godot_string>?): godot_int {
    memScoped {
        return kniBridge556(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_casecmp_to(p_self: CValuesRef<godot_string>?, p_str: CValuesRef<godot_string>?): Byte {
    memScoped {
        return kniBridge557(p_self?.getPointer(memScope).rawValue, p_str?.getPointer(memScope).rawValue)
    }
}

fun godot_string_nocasecmp_to(p_self: CValuesRef<godot_string>?, p_str: CValuesRef<godot_string>?): Byte {
    memScoped {
        return kniBridge558(p_self?.getPointer(memScope).rawValue, p_str?.getPointer(memScope).rawValue)
    }
}

fun godot_string_naturalnocasecmp_to(p_self: CValuesRef<godot_string>?, p_str: CValuesRef<godot_string>?): Byte {
    memScoped {
        return kniBridge559(p_self?.getPointer(memScope).rawValue, p_str?.getPointer(memScope).rawValue)
    }
}

fun godot_string_begins_with(p_self: CValuesRef<godot_string>?, p_string: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge560(p_self?.getPointer(memScope).rawValue, p_string?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_begins_with_char_array(p_self: CValuesRef<godot_string>?, p_char_array: String?): godot_bool {
    memScoped {
        return kniBridge561(p_self?.getPointer(memScope).rawValue, p_char_array?.cstr?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_bigrams(p_self: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge562(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_chr(p_character: wchar_t): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge563(p_character, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_ends_with(p_self: CValuesRef<godot_string>?, p_string: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge564(p_self?.getPointer(memScope).rawValue, p_string?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_find(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>): godot_int {
    memScoped {
        return kniBridge565(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue)
    }
}

fun godot_string_find_from(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge566(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_string_findmk(p_self: CValuesRef<godot_string>?, p_keys: CValuesRef<godot_array>?): godot_int {
    memScoped {
        return kniBridge567(p_self?.getPointer(memScope).rawValue, p_keys?.getPointer(memScope).rawValue)
    }
}

fun godot_string_findmk_from(p_self: CValuesRef<godot_string>?, p_keys: CValuesRef<godot_array>?, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge568(p_self?.getPointer(memScope).rawValue, p_keys?.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_string_findmk_from_in_place(p_self: CValuesRef<godot_string>?, p_keys: CValuesRef<godot_array>?, p_from: godot_int, r_key: CValuesRef<godot_intVar>?): godot_int {
    memScoped {
        return kniBridge569(p_self?.getPointer(memScope).rawValue, p_keys?.getPointer(memScope).rawValue, p_from, r_key?.getPointer(memScope).rawValue)
    }
}

fun godot_string_findn(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>): godot_int {
    memScoped {
        return kniBridge570(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue)
    }
}

fun godot_string_findn_from(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge571(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_string_find_last(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>): godot_int {
    memScoped {
        return kniBridge572(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue)
    }
}

fun godot_string_format(p_self: CValuesRef<godot_string>?, p_values: CValuesRef<godot_variant>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge573(p_self?.getPointer(memScope).rawValue, p_values?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_format_with_custom_placeholder(p_self: CValuesRef<godot_string>?, p_values: CValuesRef<godot_variant>?, p_placeholder: String?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge574(p_self?.getPointer(memScope).rawValue, p_values?.getPointer(memScope).rawValue, p_placeholder?.cstr?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_hex_encode_buffer(p_buffer: CValuesRef<uint8_tVar>?, p_len: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge575(p_buffer?.getPointer(memScope).rawValue, p_len, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_hex_to_int(p_self: CValuesRef<godot_string>?): godot_int {
    memScoped {
        return kniBridge576(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_hex_to_int_without_prefix(p_self: CValuesRef<godot_string>?): godot_int {
    memScoped {
        return kniBridge577(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_insert(p_self: CValuesRef<godot_string>?, p_at_pos: godot_int, p_string: CValue<godot_string>): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge578(p_self?.getPointer(memScope).rawValue, p_at_pos, p_string.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_is_numeric(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge579(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_subsequence_of(p_self: CValuesRef<godot_string>?, p_string: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge580(p_self?.getPointer(memScope).rawValue, p_string?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_subsequence_ofi(p_self: CValuesRef<godot_string>?, p_string: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge581(p_self?.getPointer(memScope).rawValue, p_string?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_lpad(p_self: CValuesRef<godot_string>?, p_min_length: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge582(p_self?.getPointer(memScope).rawValue, p_min_length, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_lpad_with_custom_character(p_self: CValuesRef<godot_string>?, p_min_length: godot_int, p_character: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge583(p_self?.getPointer(memScope).rawValue, p_min_length, p_character?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_match(p_self: CValuesRef<godot_string>?, p_wildcard: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge584(p_self?.getPointer(memScope).rawValue, p_wildcard?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_matchn(p_self: CValuesRef<godot_string>?, p_wildcard: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge585(p_self?.getPointer(memScope).rawValue, p_wildcard?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_md5(p_md5: CValuesRef<uint8_tVar>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge586(p_md5?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_num(p_num: Double): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge587(p_num, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_num_int64(p_num: int64_t, p_base: godot_int): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge588(p_num, p_base, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_num_int64_capitalized(p_num: int64_t, p_base: godot_int, p_capitalize_hex: godot_bool): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge589(p_num, p_base, p_capitalize_hex.toByte(), kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_num_real(p_num: Double): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge590(p_num, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_num_scientific(p_num: Double): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge591(p_num, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_num_with_decimals(p_num: Double, p_decimals: godot_int): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge592(p_num, p_decimals, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_pad_decimals(p_self: CValuesRef<godot_string>?, p_digits: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge593(p_self?.getPointer(memScope).rawValue, p_digits, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_pad_zeros(p_self: CValuesRef<godot_string>?, p_digits: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge594(p_self?.getPointer(memScope).rawValue, p_digits, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_replace_first(p_self: CValuesRef<godot_string>?, p_key: CValue<godot_string>, p_with: CValue<godot_string>): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge595(p_self?.getPointer(memScope).rawValue, p_key.getPointer(memScope).rawValue, p_with.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_replace(p_self: CValuesRef<godot_string>?, p_key: CValue<godot_string>, p_with: CValue<godot_string>): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge596(p_self?.getPointer(memScope).rawValue, p_key.getPointer(memScope).rawValue, p_with.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_replacen(p_self: CValuesRef<godot_string>?, p_key: CValue<godot_string>, p_with: CValue<godot_string>): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge597(p_self?.getPointer(memScope).rawValue, p_key.getPointer(memScope).rawValue, p_with.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_rfind(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>): godot_int {
    memScoped {
        return kniBridge598(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue)
    }
}

fun godot_string_rfindn(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>): godot_int {
    memScoped {
        return kniBridge599(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue)
    }
}

fun godot_string_rfind_from(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge600(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_string_rfindn_from(p_self: CValuesRef<godot_string>?, p_what: CValue<godot_string>, p_from: godot_int): godot_int {
    memScoped {
        return kniBridge601(p_self?.getPointer(memScope).rawValue, p_what.getPointer(memScope).rawValue, p_from)
    }
}

fun godot_string_rpad(p_self: CValuesRef<godot_string>?, p_min_length: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge602(p_self?.getPointer(memScope).rawValue, p_min_length, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_rpad_with_custom_character(p_self: CValuesRef<godot_string>?, p_min_length: godot_int, p_character: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge603(p_self?.getPointer(memScope).rawValue, p_min_length, p_character?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_similarity(p_self: CValuesRef<godot_string>?, p_string: CValuesRef<godot_string>?): godot_real {
    memScoped {
        return kniBridge604(p_self?.getPointer(memScope).rawValue, p_string?.getPointer(memScope).rawValue)
    }
}

fun godot_string_sprintf(p_self: CValuesRef<godot_string>?, p_values: CValuesRef<godot_array>?, p_error: CValuesRef<godot_boolVar>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge605(p_self?.getPointer(memScope).rawValue, p_values?.getPointer(memScope).rawValue, p_error?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_substr(p_self: CValuesRef<godot_string>?, p_from: godot_int, p_chars: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge606(p_self?.getPointer(memScope).rawValue, p_from, p_chars, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_to_double(p_self: CValuesRef<godot_string>?): Double {
    memScoped {
        return kniBridge607(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_to_float(p_self: CValuesRef<godot_string>?): godot_real {
    memScoped {
        return kniBridge608(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_to_int(p_self: CValuesRef<godot_string>?): godot_int {
    memScoped {
        return kniBridge609(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_camelcase_to_underscore(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge610(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_camelcase_to_underscore_lowercased(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge611(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_capitalize(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge612(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_char_to_double(p_what: String?): Double {
    memScoped {
        return kniBridge613(p_what?.cstr?.getPointer(memScope).rawValue)
    }
}

fun godot_string_char_to_int(p_what: String?): godot_int {
    memScoped {
        return kniBridge614(p_what?.cstr?.getPointer(memScope).rawValue)
    }
}

fun godot_string_wchar_to_int(p_str: CValuesRef<wchar_tVar>?): int64_t {
    memScoped {
        return kniBridge615(p_str?.getPointer(memScope).rawValue)
    }
}

fun godot_string_char_to_int_with_len(p_what: String?, p_len: godot_int): godot_int {
    memScoped {
        return kniBridge616(p_what?.cstr?.getPointer(memScope).rawValue, p_len)
    }
}

fun godot_string_char_to_int64_with_len(p_str: CValuesRef<wchar_tVar>?, p_len: Int): int64_t {
    memScoped {
        return kniBridge617(p_str?.getPointer(memScope).rawValue, p_len)
    }
}

fun godot_string_hex_to_int64(p_self: CValuesRef<godot_string>?): int64_t {
    memScoped {
        return kniBridge618(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_hex_to_int64_with_prefix(p_self: CValuesRef<godot_string>?): int64_t {
    memScoped {
        return kniBridge619(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_to_int64(p_self: CValuesRef<godot_string>?): int64_t {
    memScoped {
        return kniBridge620(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_unicode_char_to_double(p_str: CValuesRef<wchar_tVar>?, r_end: CValuesRef<CPointerVar<wchar_tVar>>?): Double {
    memScoped {
        return kniBridge621(p_str?.getPointer(memScope).rawValue, r_end?.getPointer(memScope).rawValue)
    }
}

fun godot_string_get_slice_count(p_self: CValuesRef<godot_string>?, p_splitter: CValue<godot_string>): godot_int {
    memScoped {
        return kniBridge622(p_self?.getPointer(memScope).rawValue, p_splitter.getPointer(memScope).rawValue)
    }
}

fun godot_string_get_slice(p_self: CValuesRef<godot_string>?, p_splitter: CValue<godot_string>, p_slice: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge623(p_self?.getPointer(memScope).rawValue, p_splitter.getPointer(memScope).rawValue, p_slice, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_get_slicec(p_self: CValuesRef<godot_string>?, p_splitter: wchar_t, p_slice: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge624(p_self?.getPointer(memScope).rawValue, p_splitter, p_slice, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split(p_self: CValuesRef<godot_string>?, p_splitter: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge625(p_self?.getPointer(memScope).rawValue, p_splitter?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_allow_empty(p_self: CValuesRef<godot_string>?, p_splitter: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge626(p_self?.getPointer(memScope).rawValue, p_splitter?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_floats(p_self: CValuesRef<godot_string>?, p_splitter: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge627(p_self?.getPointer(memScope).rawValue, p_splitter?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_floats_allows_empty(p_self: CValuesRef<godot_string>?, p_splitter: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge628(p_self?.getPointer(memScope).rawValue, p_splitter?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_floats_mk(p_self: CValuesRef<godot_string>?, p_splitters: CValuesRef<godot_array>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge629(p_self?.getPointer(memScope).rawValue, p_splitters?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_floats_mk_allows_empty(p_self: CValuesRef<godot_string>?, p_splitters: CValuesRef<godot_array>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge630(p_self?.getPointer(memScope).rawValue, p_splitters?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_ints(p_self: CValuesRef<godot_string>?, p_splitter: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge631(p_self?.getPointer(memScope).rawValue, p_splitter?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_ints_allows_empty(p_self: CValuesRef<godot_string>?, p_splitter: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge632(p_self?.getPointer(memScope).rawValue, p_splitter?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_ints_mk(p_self: CValuesRef<godot_string>?, p_splitters: CValuesRef<godot_array>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge633(p_self?.getPointer(memScope).rawValue, p_splitters?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_ints_mk_allows_empty(p_self: CValuesRef<godot_string>?, p_splitters: CValuesRef<godot_array>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge634(p_self?.getPointer(memScope).rawValue, p_splitters?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_split_spaces(p_self: CValuesRef<godot_string>?): CValue<godot_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_array>()
        try {
            kniBridge635(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_char_lowercase(p_char: wchar_t): wchar_t {
    return kniBridge636(p_char)
}

fun godot_string_char_uppercase(p_char: wchar_t): wchar_t {
    return kniBridge637(p_char)
}

fun godot_string_to_lower(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge638(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_to_upper(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge639(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_get_basename(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge640(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_get_extension(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge641(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_left(p_self: CValuesRef<godot_string>?, p_pos: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge642(p_self?.getPointer(memScope).rawValue, p_pos, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_ord_at(p_self: CValuesRef<godot_string>?, p_idx: godot_int): wchar_t {
    memScoped {
        return kniBridge643(p_self?.getPointer(memScope).rawValue, p_idx)
    }
}

fun godot_string_plus_file(p_self: CValuesRef<godot_string>?, p_file: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge644(p_self?.getPointer(memScope).rawValue, p_file?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_right(p_self: CValuesRef<godot_string>?, p_pos: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge645(p_self?.getPointer(memScope).rawValue, p_pos, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_strip_edges(p_self: CValuesRef<godot_string>?, p_left: godot_bool, p_right: godot_bool): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge646(p_self?.getPointer(memScope).rawValue, p_left.toByte(), p_right.toByte(), kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_strip_escapes(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge647(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_erase(p_self: CValuesRef<godot_string>?, p_pos: godot_int, p_chars: godot_int): Unit {
    memScoped {
        return kniBridge648(p_self?.getPointer(memScope).rawValue, p_pos, p_chars)
    }
}

fun godot_string_ascii(p_self: CValuesRef<godot_string>?): CValue<godot_char_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_char_string>()
        try {
            kniBridge649(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_ascii_extended(p_self: CValuesRef<godot_string>?): CValue<godot_char_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_char_string>()
        try {
            kniBridge650(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_utf8(p_self: CValuesRef<godot_string>?): CValue<godot_char_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_char_string>()
        try {
            kniBridge651(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_parse_utf8(p_self: CValuesRef<godot_string>?, p_utf8: String?): godot_bool {
    memScoped {
        return kniBridge652(p_self?.getPointer(memScope).rawValue, p_utf8?.cstr?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_parse_utf8_with_len(p_self: CValuesRef<godot_string>?, p_utf8: String?, p_len: godot_int): godot_bool {
    memScoped {
        return kniBridge653(p_self?.getPointer(memScope).rawValue, p_utf8?.cstr?.getPointer(memScope).rawValue, p_len).toBoolean()
    }
}

fun godot_string_chars_to_utf8(p_utf8: String?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge654(p_utf8?.cstr?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_chars_to_utf8_with_len(p_utf8: String?, p_len: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge655(p_utf8?.cstr?.getPointer(memScope).rawValue, p_len, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_hash(p_self: CValuesRef<godot_string>?): uint32_t {
    memScoped {
        return kniBridge656(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_hash64(p_self: CValuesRef<godot_string>?): uint64_t {
    memScoped {
        return kniBridge657(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_hash_chars(p_cstr: String?): uint32_t {
    memScoped {
        return kniBridge658(p_cstr?.cstr?.getPointer(memScope).rawValue)
    }
}

fun godot_string_hash_chars_with_len(p_cstr: String?, p_len: godot_int): uint32_t {
    memScoped {
        return kniBridge659(p_cstr?.cstr?.getPointer(memScope).rawValue, p_len)
    }
}

fun godot_string_hash_utf8_chars(p_str: CValuesRef<wchar_tVar>?): uint32_t {
    memScoped {
        return kniBridge660(p_str?.getPointer(memScope).rawValue)
    }
}

fun godot_string_hash_utf8_chars_with_len(p_str: CValuesRef<wchar_tVar>?, p_len: godot_int): uint32_t {
    memScoped {
        return kniBridge661(p_str?.getPointer(memScope).rawValue, p_len)
    }
}

fun godot_string_md5_buffer(p_self: CValuesRef<godot_string>?): CValue<godot_pool_byte_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_byte_array>()
        try {
            kniBridge662(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_md5_text(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge663(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_sha256_buffer(p_self: CValuesRef<godot_string>?): CValue<godot_pool_byte_array> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_pool_byte_array>()
        try {
            kniBridge664(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_sha256_text(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge665(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_empty(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge666(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_get_base_dir(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge667(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_get_file(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge668(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_humanize_size(p_size: size_t): CValue<godot_string> {
    val kniRetVal = nativeHeap.alloc<godot_string>()
    try {
        kniBridge669(p_size, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_string_is_abs_path(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge670(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_rel_path(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge671(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_resource_file(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge672(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_path_to(p_self: CValuesRef<godot_string>?, p_path: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge673(p_self?.getPointer(memScope).rawValue, p_path?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_path_to_file(p_self: CValuesRef<godot_string>?, p_path: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge674(p_self?.getPointer(memScope).rawValue, p_path?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_simplify_path(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge675(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_c_escape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge676(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_c_escape_multiline(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge677(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_c_unescape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge678(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_http_escape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge679(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_http_unescape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge680(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_json_escape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge681(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_word_wrap(p_self: CValuesRef<godot_string>?, p_chars_per_line: godot_int): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge682(p_self?.getPointer(memScope).rawValue, p_chars_per_line, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_xml_escape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge683(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_xml_escape_with_quotes(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge684(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_xml_unescape(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge685(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_percent_decode(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge686(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_percent_encode(p_self: CValuesRef<godot_string>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge687(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_is_valid_float(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge688(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_valid_hex_number(p_self: CValuesRef<godot_string>?, p_with_prefix: godot_bool): godot_bool {
    memScoped {
        return kniBridge689(p_self?.getPointer(memScope).rawValue, p_with_prefix.toByte()).toBoolean()
    }
}

fun godot_string_is_valid_html_color(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge690(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_valid_identifier(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge691(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_valid_integer(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge692(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_is_valid_ip_address(p_self: CValuesRef<godot_string>?): godot_bool {
    memScoped {
        return kniBridge693(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_destroy(p_self: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge694(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_name_new(r_dest: CValuesRef<godot_string_name>?, p_name: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge695(r_dest?.getPointer(memScope).rawValue, p_name?.getPointer(memScope).rawValue)
    }
}

fun godot_string_name_new_data(r_dest: CValuesRef<godot_string_name>?, p_name: String?): Unit {
    memScoped {
        return kniBridge696(r_dest?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun godot_string_name_get_name(p_self: CValuesRef<godot_string_name>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge697(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_string_name_get_hash(p_self: CValuesRef<godot_string_name>?): uint32_t {
    memScoped {
        return kniBridge698(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_string_name_get_data_unique_pointer(p_self: CValuesRef<godot_string_name>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge699(p_self?.getPointer(memScope).rawValue))
    }
}

fun godot_string_name_operator_equal(p_self: CValuesRef<godot_string_name>?, p_other: CValuesRef<godot_string_name>?): godot_bool {
    memScoped {
        return kniBridge700(p_self?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_name_operator_less(p_self: CValuesRef<godot_string_name>?, p_other: CValuesRef<godot_string_name>?): godot_bool {
    memScoped {
        return kniBridge701(p_self?.getPointer(memScope).rawValue, p_other?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_string_name_destroy(p_self: CValuesRef<godot_string_name>?): Unit {
    memScoped {
        return kniBridge702(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_object_destroy(p_o: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge703(p_o?.getPointer(memScope).rawValue)
    }
}

fun godot_global_get_singleton(p_name: CValuesRef<ByteVar>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge704(p_name?.getPointer(memScope).rawValue))
    }
}

fun godot_method_bind_get_method(p_classname: String?, p_methodname: String?): CPointer<godot_method_bind>? {
    memScoped {
        return interpretCPointer<godot_method_bind>(kniBridge705(p_classname?.cstr?.getPointer(memScope).rawValue, p_methodname?.cstr?.getPointer(memScope).rawValue))
    }
}

fun godot_method_bind_ptrcall(p_method_bind: CValuesRef<godot_method_bind>?, p_instance: CValuesRef<*>?, p_args: CValuesRef<COpaquePointerVar>?, p_ret: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge706(p_method_bind?.getPointer(memScope).rawValue, p_instance?.getPointer(memScope).rawValue, p_args?.getPointer(memScope).rawValue, p_ret?.getPointer(memScope).rawValue)
    }
}

fun godot_method_bind_call(p_method_bind: CValuesRef<godot_method_bind>?, p_instance: CValuesRef<*>?, p_args: CValuesRef<CPointerVar<godot_variant>>?, p_arg_count: Int, p_call_error: CValuesRef<godot_variant_call_error>?): CValue<godot_variant> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_variant>()
        try {
            kniBridge707(p_method_bind?.getPointer(memScope).rawValue, p_instance?.getPointer(memScope).rawValue, p_args?.getPointer(memScope).rawValue, p_arg_count, p_call_error?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_get_class_constructor(p_classname: String?): godot_class_constructor? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge708(p_classname?.cstr?.getPointer(memScope).rawValue))
    }
}

fun godot_get_global_constants(): CValue<godot_dictionary> {
    val kniRetVal = nativeHeap.alloc<godot_dictionary>()
    try {
        kniBridge709(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_register_native_call_type(p_call_type: String?, p_callback: native_call_cb?): Unit {
    memScoped {
        return kniBridge710(p_call_type?.cstr?.getPointer(memScope).rawValue, p_callback.rawValue)
    }
}

fun godot_alloc(p_bytes: Int): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge711(p_bytes))
}

fun godot_realloc(p_ptr: CValuesRef<*>?, p_bytes: Int): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge712(p_ptr?.getPointer(memScope).rawValue, p_bytes))
    }
}

fun godot_free(p_ptr: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge713(p_ptr?.getPointer(memScope).rawValue)
    }
}

fun godot_print_error(p_description: String?, p_function: String?, p_file: String?, p_line: Int): Unit {
    memScoped {
        return kniBridge714(p_description?.cstr?.getPointer(memScope).rawValue, p_function?.cstr?.getPointer(memScope).rawValue, p_file?.cstr?.getPointer(memScope).rawValue, p_line)
    }
}

fun godot_print_warning(p_description: String?, p_function: String?, p_file: String?, p_line: Int): Unit {
    memScoped {
        return kniBridge715(p_description?.cstr?.getPointer(memScope).rawValue, p_function?.cstr?.getPointer(memScope).rawValue, p_file?.cstr?.getPointer(memScope).rawValue, p_line)
    }
}

fun godot_print(p_message: CValuesRef<godot_string>?): Unit {
    memScoped {
        return kniBridge716(p_message?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_new(r_dest: CValuesRef<godot_aabb>?, p_pos: CValuesRef<godot_vector3>?, p_size: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge717(r_dest?.getPointer(memScope).rawValue, p_pos?.getPointer(memScope).rawValue, p_size?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_get_position(p_self: CValuesRef<godot_aabb>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge718(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_set_position(p_self: CValuesRef<godot_aabb>?, p_v: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge719(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_get_size(p_self: CValuesRef<godot_aabb>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge720(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_set_size(p_self: CValuesRef<godot_aabb>?, p_v: CValuesRef<godot_vector3>?): Unit {
    memScoped {
        return kniBridge721(p_self?.getPointer(memScope).rawValue, p_v?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_as_string(p_self: CValuesRef<godot_aabb>?): CValue<godot_string> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_string>()
        try {
            kniBridge722(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_get_area(p_self: CValuesRef<godot_aabb>?): godot_real {
    memScoped {
        return kniBridge723(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_has_no_area(p_self: CValuesRef<godot_aabb>?): godot_bool {
    memScoped {
        return kniBridge724(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_has_no_surface(p_self: CValuesRef<godot_aabb>?): godot_bool {
    memScoped {
        return kniBridge725(p_self?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_intersects(p_self: CValuesRef<godot_aabb>?, p_with: CValuesRef<godot_aabb>?): godot_bool {
    memScoped {
        return kniBridge726(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_encloses(p_self: CValuesRef<godot_aabb>?, p_with: CValuesRef<godot_aabb>?): godot_bool {
    memScoped {
        return kniBridge727(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_merge(p_self: CValuesRef<godot_aabb>?, p_with: CValuesRef<godot_aabb>?): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge728(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_intersection(p_self: CValuesRef<godot_aabb>?, p_with: CValuesRef<godot_aabb>?): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge729(p_self?.getPointer(memScope).rawValue, p_with?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_intersects_plane(p_self: CValuesRef<godot_aabb>?, p_plane: CValuesRef<godot_plane>?): godot_bool {
    memScoped {
        return kniBridge730(p_self?.getPointer(memScope).rawValue, p_plane?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_intersects_segment(p_self: CValuesRef<godot_aabb>?, p_from: CValuesRef<godot_vector3>?, p_to: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge731(p_self?.getPointer(memScope).rawValue, p_from?.getPointer(memScope).rawValue, p_to?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_has_point(p_self: CValuesRef<godot_aabb>?, p_point: CValuesRef<godot_vector3>?): godot_bool {
    memScoped {
        return kniBridge732(p_self?.getPointer(memScope).rawValue, p_point?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_aabb_get_support(p_self: CValuesRef<godot_aabb>?, p_dir: CValuesRef<godot_vector3>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge733(p_self?.getPointer(memScope).rawValue, p_dir?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_get_longest_axis(p_self: CValuesRef<godot_aabb>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge734(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_get_longest_axis_index(p_self: CValuesRef<godot_aabb>?): godot_int {
    memScoped {
        return kniBridge735(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_get_longest_axis_size(p_self: CValuesRef<godot_aabb>?): godot_real {
    memScoped {
        return kniBridge736(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_get_shortest_axis(p_self: CValuesRef<godot_aabb>?): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge737(p_self?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_get_shortest_axis_index(p_self: CValuesRef<godot_aabb>?): godot_int {
    memScoped {
        return kniBridge738(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_get_shortest_axis_size(p_self: CValuesRef<godot_aabb>?): godot_real {
    memScoped {
        return kniBridge739(p_self?.getPointer(memScope).rawValue)
    }
}

fun godot_aabb_expand(p_self: CValuesRef<godot_aabb>?, p_to_point: CValuesRef<godot_vector3>?): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge740(p_self?.getPointer(memScope).rawValue, p_to_point?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_grow(p_self: CValuesRef<godot_aabb>?, p_by: godot_real): CValue<godot_aabb> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_aabb>()
        try {
            kniBridge741(p_self?.getPointer(memScope).rawValue, p_by, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_get_endpoint(p_self: CValuesRef<godot_aabb>?, p_idx: godot_int): CValue<godot_vector3> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<godot_vector3>()
        try {
            kniBridge742(p_self?.getPointer(memScope).rawValue, p_idx, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun godot_aabb_operator_equal(p_self: CValuesRef<godot_aabb>?, p_b: CValuesRef<godot_aabb>?): godot_bool {
    memScoped {
        return kniBridge743(p_self?.getPointer(memScope).rawValue, p_b?.getPointer(memScope).rawValue).toBoolean()
    }
}

fun godot_arvr_register_interface(p_interface: CValuesRef<godot_arvr_interface_gdnative>?): Unit {
    memScoped {
        return kniBridge744(p_interface?.getPointer(memScope).rawValue)
    }
}

fun godot_arvr_get_worldscale(): godot_real {
    return kniBridge745()
}

fun godot_arvr_get_reference_frame(): CValue<godot_transform> {
    val kniRetVal = nativeHeap.alloc<godot_transform>()
    try {
        kniBridge746(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun godot_arvr_blit(p_eye: godot_int, p_render_target: CValuesRef<godot_rid>?, p_rect: CValuesRef<godot_rect2>?): Unit {
    memScoped {
        return kniBridge747(p_eye, p_render_target?.getPointer(memScope).rawValue, p_rect?.getPointer(memScope).rawValue)
    }
}

fun godot_arvr_get_texid(p_render_target: CValuesRef<godot_rid>?): godot_int {
    memScoped {
        return kniBridge748(p_render_target?.getPointer(memScope).rawValue)
    }
}

fun godot_arvr_add_controller(p_device_name: CValuesRef<ByteVar>?, p_hand: godot_int, p_tracks_orientation: godot_bool, p_tracks_position: godot_bool): godot_int {
    memScoped {
        return kniBridge749(p_device_name?.getPointer(memScope).rawValue, p_hand, p_tracks_orientation.toByte(), p_tracks_position.toByte())
    }
}

fun godot_arvr_remove_controller(p_controller_id: godot_int): Unit {
    return kniBridge750(p_controller_id)
}

fun godot_arvr_set_controller_transform(p_controller_id: godot_int, p_transform: CValuesRef<godot_transform>?, p_tracks_orientation: godot_bool, p_tracks_position: godot_bool): Unit {
    memScoped {
        return kniBridge751(p_controller_id, p_transform?.getPointer(memScope).rawValue, p_tracks_orientation.toByte(), p_tracks_position.toByte())
    }
}

fun godot_arvr_set_controller_button(p_controller_id: godot_int, p_button: godot_int, p_is_pressed: godot_bool): Unit {
    return kniBridge752(p_controller_id, p_button, p_is_pressed.toByte())
}

fun godot_arvr_set_controller_axis(p_controller_id: godot_int, p_axis: godot_int, p_value: godot_real, p_can_be_negative: godot_bool): Unit {
    return kniBridge753(p_controller_id, p_axis, p_value, p_can_be_negative.toByte())
}

fun godot_arvr_get_controller_rumble(p_controller_id: godot_int): godot_real {
    return kniBridge754(p_controller_id)
}

fun godot_nativescript_register_class(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_base: String?, p_create_func: CValue<godot_instance_create_func>, p_destroy_func: CValue<godot_instance_destroy_func>): Unit {
    memScoped {
        return kniBridge755(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_base?.cstr?.getPointer(memScope).rawValue, p_create_func.getPointer(memScope).rawValue, p_destroy_func.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_register_tool_class(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_base: String?, p_create_func: CValue<godot_instance_create_func>, p_destroy_func: CValue<godot_instance_destroy_func>): Unit {
    memScoped {
        return kniBridge756(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_base?.cstr?.getPointer(memScope).rawValue, p_create_func.getPointer(memScope).rawValue, p_destroy_func.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_register_method(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_function_name: String?, p_attr: CValue<godot_method_attributes>, p_method: CValue<godot_instance_method>): Unit {
    memScoped {
        return kniBridge757(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_function_name?.cstr?.getPointer(memScope).rawValue, p_attr.getPointer(memScope).rawValue, p_method.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_register_property(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_path: String?, p_attr: CValuesRef<godot_property_attributes>?, p_set_func: CValue<godot_property_set_func>, p_get_func: CValue<godot_property_get_func>): Unit {
    memScoped {
        return kniBridge758(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_path?.cstr?.getPointer(memScope).rawValue, p_attr?.getPointer(memScope).rawValue, p_set_func.getPointer(memScope).rawValue, p_get_func.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_register_signal(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_signal: CValuesRef<godot_signal>?): Unit {
    memScoped {
        return kniBridge759(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_signal?.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_get_userdata(p_instance: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge760(p_instance?.getPointer(memScope).rawValue))
    }
}

fun godot_nativescript_set_method_argument_information(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_function_name: String?, p_num_args: Int, p_args: CValuesRef<godot_method_arg>?): Unit {
    memScoped {
        return kniBridge761(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_function_name?.cstr?.getPointer(memScope).rawValue, p_num_args, p_args?.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_set_class_documentation(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_documentation: CValue<godot_string>): Unit {
    memScoped {
        return kniBridge762(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_documentation.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_set_method_documentation(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_function_name: String?, p_documentation: CValue<godot_string>): Unit {
    memScoped {
        return kniBridge763(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_function_name?.cstr?.getPointer(memScope).rawValue, p_documentation.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_set_property_documentation(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_path: String?, p_documentation: CValue<godot_string>): Unit {
    memScoped {
        return kniBridge764(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_path?.cstr?.getPointer(memScope).rawValue, p_documentation.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_set_signal_documentation(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_signal_name: String?, p_documentation: CValue<godot_string>): Unit {
    memScoped {
        return kniBridge765(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_signal_name?.cstr?.getPointer(memScope).rawValue, p_documentation.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_set_global_type_tag(p_idx: Int, p_name: String?, p_type_tag: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge766(p_idx, p_name?.cstr?.getPointer(memScope).rawValue, p_type_tag?.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_get_global_type_tag(p_idx: Int, p_name: String?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge767(p_idx, p_name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun godot_nativescript_set_type_tag(p_gdnative_handle: CValuesRef<*>?, p_name: String?, p_type_tag: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge768(p_gdnative_handle?.getPointer(memScope).rawValue, p_name?.cstr?.getPointer(memScope).rawValue, p_type_tag?.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_get_type_tag(p_object: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge769(p_object?.getPointer(memScope).rawValue))
    }
}

fun godot_nativescript_register_instance_binding_data_functions(p_binding_functions: CValue<godot_instance_binding_functions>): Int {
    memScoped {
        return kniBridge770(p_binding_functions.getPointer(memScope).rawValue)
    }
}

fun godot_nativescript_unregister_instance_binding_data_functions(p_idx: Int): Unit {
    return kniBridge771(p_idx)
}

fun godot_nativescript_get_instance_binding_data(p_idx: Int, p_object: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge772(p_idx, p_object?.getPointer(memScope).rawValue))
    }
}

fun godot_pluginscript_register_language(language_desc: CValuesRef<godot_pluginscript_language_desc>?): Unit {
    memScoped {
        return kniBridge773(language_desc?.getPointer(memScope).rawValue)
    }
}

val GODOT_AABB_SIZE: Int get() = 24

val GODOT_API_VERSION: Int get() = 1

val GODOT_TRUE: Int get() = 1

val GODOT_FALSE: Int get() = 0

val GODOT_STRING_SIZE: Long get() = 8

val GODOT_CHAR_STRING_SIZE: Long get() = 8

val GODOT_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_ARRAY_READ_ACCESS_SIZE: Int get() = 1

val GODOT_POOL_ARRAY_WRITE_ACCESS_SIZE: Int get() = 1

val GODOT_POOL_BYTE_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_INT_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_REAL_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_STRING_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_VECTOR2_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_VECTOR3_ARRAY_SIZE: Long get() = 8

val GODOT_POOL_COLOR_ARRAY_SIZE: Long get() = 8

val GODOT_COLOR_SIZE: Int get() = 16

val GODOT_VECTOR2_SIZE: Int get() = 8

val GODOT_VECTOR3_SIZE: Int get() = 12

val GODOT_BASIS_SIZE: Int get() = 36

val GODOT_QUAT_SIZE: Int get() = 16

val GODOT_VARIANT_SIZE: Long get() = 24

val GODOT_DICTIONARY_SIZE: Long get() = 8

val GODOT_NODE_PATH_SIZE: Long get() = 8

val GODOT_PLANE_SIZE: Int get() = 16

val GODOT_RID_SIZE: Long get() = 8

val GODOT_TRANSFORM_SIZE: Int get() = 48

val GODOT_TRANSFORM2D_SIZE: Int get() = 24

val GODOT_STRING_NAME_SIZE: Long get() = 8

class godot_aabb(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_string(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_char_string(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_array_read_access(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_array_write_access(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_byte_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_int_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_real_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_string_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_vector2_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_vector3_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_pool_color_array(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_color(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_vector2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_vector3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_basis(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_quat(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_variant(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_variant_call_error(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var error: godot_variant_call_error_error
        get() = memberAt<godot_variant_call_error_error.Var>(0).value
        set(value) { memberAt<godot_variant_call_error_error.Var>(0).value = value }
    
    var argument: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var expected: godot_variant_type
        get() = memberAt<godot_variant_type.Var>(8).value
        set(value) { memberAt<godot_variant_type.Var>(8).value = value }
    
}

class godot_dictionary(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_node_path(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_plane(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_rect2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_rid(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_transform(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_transform2d(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_string_name(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_method_bind(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val _dont_touch_that: CArrayPointer<uint8_tVar>
        get() = arrayMemberAt(0)
    
}

class godot_gdnative_api_version(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var major: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var minor: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class godot_gdnative_api_struct(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var type: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    val version: godot_gdnative_api_version
        get() = memberAt(4)
    
    var next: CPointer<godot_gdnative_api_struct>?
        get() = memberAt<CPointerVar<godot_gdnative_api_struct>>(16).value
        set(value) { memberAt<CPointerVar<godot_gdnative_api_struct>>(16).value = value }
    
}

class godot_gdnative_init_options(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(72, 8)
    
    var in_editor: godot_bool
        get() = memberAt<godot_boolVar>(0).value
        set(value) { memberAt<godot_boolVar>(0).value = value }
    
    var core_api_hash: uint64_t
        get() = memberAt<uint64_tVar>(8).value
        set(value) { memberAt<uint64_tVar>(8).value = value }
    
    var editor_api_hash: uint64_t
        get() = memberAt<uint64_tVar>(16).value
        set(value) { memberAt<uint64_tVar>(16).value = value }
    
    var no_api_hash: uint64_t
        get() = memberAt<uint64_tVar>(24).value
        set(value) { memberAt<uint64_tVar>(24).value = value }
    
    var report_version_mismatch: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CValue<godot_gdnative_api_version>, CValue<godot_gdnative_api_version>) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CValue<godot_gdnative_api_version>, CValue<godot_gdnative_api_version>) -> Unit>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CValue<godot_gdnative_api_version>, CValue<godot_gdnative_api_version>) -> Unit>>>(32).value = value }
    
    var report_loading_error: CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<ByteVar>?) -> Unit>>>(40).value = value }
    
    var gd_native_library: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(48).value
        set(value) { memberAt<COpaquePointerVar>(48).value = value }
    
    var api_struct: CPointer<godot_gdnative_core_api_struct>?
        get() = memberAt<CPointerVar<godot_gdnative_core_api_struct>>(56).value
        set(value) { memberAt<CPointerVar<godot_gdnative_core_api_struct>>(56).value = value }
    
    var active_library_path: CPointer<godot_string>?
        get() = memberAt<CPointerVar<godot_string>>(64).value
        set(value) { memberAt<CPointerVar<godot_string>>(64).value = value }
    
}


class godot_gdnative_terminate_options(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    var in_editor: godot_bool
        get() = memberAt<godot_boolVar>(0).value
        set(value) { memberAt<godot_boolVar>(0).value = value }
    
}

class godot_arvr_interface_gdnative(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(120, 8)
    
    var constructor: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> COpaquePointer?>>>(0).value = value }
    
    var destructor: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
    var get_name: CPointer<CFunction<(COpaquePointer?) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> CValue<godot_string>>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> CValue<godot_string>>>>(16).value = value }
    
    var get_capabilities: CPointer<CFunction<(COpaquePointer?) -> godot_int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_int>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_int>>>(24).value = value }
    
    var get_anchor_detection_is_enabled: CPointer<CFunction<(COpaquePointer?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(32).value = value }
    
    var set_anchor_detection_is_enabled: CPointer<CFunction<(COpaquePointer?, godot_bool) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, godot_bool) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, godot_bool) -> Unit>>>(40).value = value }
    
    var is_stereo: CPointer<CFunction<(COpaquePointer?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(48).value = value }
    
    var is_initialized: CPointer<CFunction<(COpaquePointer?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(56).value = value }
    
    var initialize: CPointer<CFunction<(COpaquePointer?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> godot_bool>>>(64).value = value }
    
    var uninitialize: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(72).value = value }
    
    var get_render_targetsize: CPointer<CFunction<(COpaquePointer?) -> CValue<godot_vector2>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> CValue<godot_vector2>>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> CValue<godot_vector2>>>>(80).value = value }
    
    var get_transform_for_eye: CPointer<CFunction<(COpaquePointer?, godot_int, CPointer<godot_transform>?) -> CValue<godot_transform>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, godot_int, CPointer<godot_transform>?) -> CValue<godot_transform>>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, godot_int, CPointer<godot_transform>?) -> CValue<godot_transform>>>>(88).value = value }
    
    var fill_projection_for_eye: CPointer<CFunction<(COpaquePointer?, CPointer<godot_realVar>?, godot_int, godot_real, godot_real, godot_real) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_realVar>?, godot_int, godot_real, godot_real, godot_real) -> Unit>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_realVar>?, godot_int, godot_real, godot_real, godot_real) -> Unit>>>(96).value = value }
    
    var commit_for_eye: CPointer<CFunction<(COpaquePointer?, godot_int, CPointer<godot_rid>?, CPointer<godot_rect2>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, godot_int, CPointer<godot_rid>?, CPointer<godot_rect2>?) -> Unit>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, godot_int, CPointer<godot_rid>?, CPointer<godot_rect2>?) -> Unit>>>(104).value = value }
    
    var process: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(112).value = value }
    
}

class godot_property_attributes(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 4)
    
    var rset_type: godot_method_rpc_mode
        get() = memberAt<godot_method_rpc_mode.Var>(0).value
        set(value) { memberAt<godot_method_rpc_mode.Var>(0).value = value }
    
    var type: godot_int
        get() = memberAt<godot_intVar>(4).value
        set(value) { memberAt<godot_intVar>(4).value = value }
    
    var hint: godot_property_hint
        get() = memberAt<godot_property_hint.Var>(8).value
        set(value) { memberAt<godot_property_hint.Var>(8).value = value }
    
    val hint_string: godot_string
        get() = memberAt(12)
    
    var usage: godot_property_usage_flags
        get() = memberAt<godot_property_usage_flagsVar>(20).value
        set(value) { memberAt<godot_property_usage_flagsVar>(20).value = value }
    
    val default_value: godot_variant
        get() = memberAt(24)
    
}

class godot_instance_create_func(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var create_func: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>>(0).value = value }
    
    var method_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var free_func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
}

class godot_instance_destroy_func(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var destroy_func: CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Unit>>>(0).value = value }
    
    var method_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var free_func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
}

class godot_method_attributes(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var rpc_type: godot_method_rpc_mode
        get() = memberAt<godot_method_rpc_mode.Var>(0).value
        set(value) { memberAt<godot_method_rpc_mode.Var>(0).value = value }
    
}

class godot_instance_method(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var method: CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?, Int, CPointer<CPointerVar<godot_variant>>?) -> CValue<godot_variant>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?, Int, CPointer<CPointerVar<godot_variant>>?) -> CValue<godot_variant>>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?, Int, CPointer<CPointerVar<godot_variant>>?) -> CValue<godot_variant>>>>(0).value = value }
    
    var method_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var free_func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
}

class godot_property_set_func(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var set_func: CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?, CPointer<godot_variant>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?, CPointer<godot_variant>?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?, CPointer<godot_variant>?) -> Unit>>>(0).value = value }
    
    var method_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var free_func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
}

class godot_property_get_func(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var get_func: CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CValue<godot_variant>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CValue<godot_variant>>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CValue<godot_variant>>>>(0).value = value }
    
    var method_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var free_func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(16).value = value }
    
}

class godot_signal_argument(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(52, 4)
    
    val name: godot_string
        get() = memberAt(0)
    
    var type: godot_int
        get() = memberAt<godot_intVar>(8).value
        set(value) { memberAt<godot_intVar>(8).value = value }
    
    var hint: godot_property_hint
        get() = memberAt<godot_property_hint.Var>(12).value
        set(value) { memberAt<godot_property_hint.Var>(12).value = value }
    
    val hint_string: godot_string
        get() = memberAt(16)
    
    var usage: godot_property_usage_flags
        get() = memberAt<godot_property_usage_flagsVar>(24).value
        set(value) { memberAt<godot_property_usage_flagsVar>(24).value = value }
    
    val default_value: godot_variant
        get() = memberAt(28)
    
}

class godot_signal(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    val name: godot_string
        get() = memberAt(0)
    
    var num_args: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var args: CPointer<godot_signal_argument>?
        get() = memberAt<CPointerVar<godot_signal_argument>>(16).value
        set(value) { memberAt<CPointerVar<godot_signal_argument>>(16).value = value }
    
    var num_default_args: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var default_args: CPointer<godot_variant>?
        get() = memberAt<CPointerVar<godot_variant>>(32).value
        set(value) { memberAt<CPointerVar<godot_variant>>(32).value = value }
    
}

class godot_method_arg(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    val name: godot_string
        get() = memberAt(0)
    
    var type: godot_variant_type
        get() = memberAt<godot_variant_type.Var>(8).value
        set(value) { memberAt<godot_variant_type.Var>(8).value = value }
    
    var hint: godot_property_hint
        get() = memberAt<godot_property_hint.Var>(12).value
        set(value) { memberAt<godot_property_hint.Var>(12).value = value }
    
    val hint_string: godot_string
        get() = memberAt(16)
    
}

class godot_instance_binding_functions(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var alloc_instance_binding_data: CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>>(0).value = value }
    
    var free_instance_binding_data: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>>(8).value = value }
    
    var data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var free_func: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(24).value = value }
    
}

class godot_pluginscript_instance_desc(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(80, 8)
    
    var init: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, COpaquePointer?) -> COpaquePointer?>>>(0).value = value }
    
    var finish: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
    var set_prop: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> godot_bool>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> godot_bool>>>(16).value = value }
    
    var get_prop: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> godot_bool>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> godot_bool>>>(24).value = value }
    
    var call_method: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string_name>?, CPointer<CPointerVar<godot_variant>>?, Int, CPointer<godot_variant_call_error>?) -> CValue<godot_variant>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string_name>?, CPointer<CPointerVar<godot_variant>>?, Int, CPointer<godot_variant_call_error>?) -> CValue<godot_variant>>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string_name>?, CPointer<CPointerVar<godot_variant>>?, Int, CPointer<godot_variant_call_error>?) -> CValue<godot_variant>>>>(32).value = value }
    
    var notification: CPointer<CFunction<(COpaquePointer?, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> Unit>>>(40).value = value }
    
    var get_rpc_mode: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?) -> godot_method_rpc_mode>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?) -> godot_method_rpc_mode>>>(48).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?) -> godot_method_rpc_mode>>>(48).value = value }
    
    var get_rset_mode: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?) -> godot_method_rpc_mode>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?) -> godot_method_rpc_mode>>>(56).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?) -> godot_method_rpc_mode>>>(56).value = value }
    
    var refcount_incremented: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(64).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(64).value = value }
    
    var refcount_decremented: CPointer<CFunction<(COpaquePointer?) -> Boolean>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Boolean>>>(72).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Boolean>>>(72).value = value }
    
}

class godot_pluginscript_script_manifest(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    val name: godot_string_name
        get() = memberAt(8)
    
    var is_tool: godot_bool
        get() = memberAt<godot_boolVar>(16).value
        set(value) { memberAt<godot_boolVar>(16).value = value }
    
    val base: godot_string_name
        get() = memberAt(17)
    
    val member_lines: godot_dictionary
        get() = memberAt(25)
    
    val methods: godot_array
        get() = memberAt(33)
    
    val signals: godot_array
        get() = memberAt(41)
    
    val properties: godot_array
        get() = memberAt(49)
    
}

class godot_pluginscript_script_desc(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(96, 8)
    
    var init: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_error.Var>?) -> CValue<godot_pluginscript_script_manifest>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_error.Var>?) -> CValue<godot_pluginscript_script_manifest>>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_error.Var>?) -> CValue<godot_pluginscript_script_manifest>>>>(0).value = value }
    
    var finish: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(8).value = value }
    
    val instance_desc: godot_pluginscript_instance_desc
        get() = memberAt(16)
    
}

class godot_pluginscript_profiling_data(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    val signature: godot_string_name
        get() = memberAt(0)
    
    var call_count: godot_int
        get() = memberAt<godot_intVar>(8).value
        set(value) { memberAt<godot_intVar>(8).value = value }
    
    var total_time: godot_int
        get() = memberAt<godot_intVar>(12).value
        set(value) { memberAt<godot_intVar>(12).value = value }
    
    var self_time: godot_int
        get() = memberAt<godot_intVar>(16).value
        set(value) { memberAt<godot_intVar>(16).value = value }
    
}

class godot_pluginscript_language_desc(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(360, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var type: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var extension: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var recognized_extensions: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(24).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(24).value = value }
    
    var init: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
    var finish: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(40).value = value }
    
    var reserved_words: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(48).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(48).value = value }
    
    var comment_delimiters: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(56).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(56).value = value }
    
    var string_delimiters: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value = value }
    
    var has_named_classes: godot_bool
        get() = memberAt<godot_boolVar>(72).value
        set(value) { memberAt<godot_boolVar>(72).value = value }
    
    var supports_builtin_mode: godot_bool
        get() = memberAt<godot_boolVar>(73).value
        set(value) { memberAt<godot_boolVar>(73).value = value }
    
    var get_template_source_code: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?) -> CValue<godot_string>>>>(80).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?) -> CValue<godot_string>>>>(80).value = value }
    
    var validate: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_pool_string_array>?) -> godot_bool>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_pool_string_array>?) -> godot_bool>>>(88).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<IntVar>?, CPointer<IntVar>?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_pool_string_array>?) -> godot_bool>>>(88).value = value }
    
    var find_function: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?) -> Int>>>(96).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?) -> Int>>>(96).value = value }
    
    var make_function: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_pool_string_array>?) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_pool_string_array>?) -> CValue<godot_string>>>>(104).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, CPointer<godot_pool_string_array>?) -> CValue<godot_string>>>>(104).value = value }
    
    var complete_code: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, COpaquePointer?, CPointer<godot_array>?, CPointer<godot_boolVar>?, CPointer<godot_string>?) -> godot_error>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, COpaquePointer?, CPointer<godot_array>?, CPointer<godot_boolVar>?, CPointer<godot_string>?) -> godot_error>>>(112).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_string>?, COpaquePointer?, CPointer<godot_array>?, CPointer<godot_boolVar>?, CPointer<godot_string>?) -> godot_error>>>(112).value = value }
    
    var auto_indent_code: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, Int, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, Int, Int) -> Unit>>>(120).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, Int, Int) -> Unit>>>(120).value = value }
    
    var add_global_constant: CPointer<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> Unit>>>(128).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_string>?, CPointer<godot_variant>?) -> Unit>>>(128).value = value }
    
    var debug_get_error: CPointer<CFunction<(COpaquePointer?) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> CValue<godot_string>>>>(136).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> CValue<godot_string>>>>(136).value = value }
    
    var debug_get_stack_level_count: CPointer<CFunction<(COpaquePointer?) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(144).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Int>>>(144).value = value }
    
    var debug_get_stack_level_line: CPointer<CFunction<(COpaquePointer?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> Int>>>(152).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> Int>>>(152).value = value }
    
    var debug_get_stack_level_function: CPointer<CFunction<(COpaquePointer?, Int) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> CValue<godot_string>>>>(160).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> CValue<godot_string>>>>(160).value = value }
    
    var debug_get_stack_level_source: CPointer<CFunction<(COpaquePointer?, Int) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> CValue<godot_string>>>>(168).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int) -> CValue<godot_string>>>>(168).value = value }
    
    var debug_get_stack_level_locals: CPointer<CFunction<(COpaquePointer?, Int, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>>(176).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>>(176).value = value }
    
    var debug_get_stack_level_members: CPointer<CFunction<(COpaquePointer?, Int, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>>(184).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>>(184).value = value }
    
    var debug_get_globals: CPointer<CFunction<(COpaquePointer?, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>>(192).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_pool_string_array>?, CPointer<godot_array>?, Int, Int) -> Unit>>>(192).value = value }
    
    var debug_parse_stack_level_expression: CPointer<CFunction<(COpaquePointer?, Int, CPointer<godot_string>?, Int, Int) -> CValue<godot_string>>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<godot_string>?, Int, Int) -> CValue<godot_string>>>>(200).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, Int, CPointer<godot_string>?, Int, Int) -> CValue<godot_string>>>>(200).value = value }
    
    var get_public_functions: CPointer<CFunction<(COpaquePointer?, CPointer<godot_array>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_array>?) -> Unit>>>(208).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_array>?) -> Unit>>>(208).value = value }
    
    var get_public_constants: CPointer<CFunction<(COpaquePointer?, CPointer<godot_dictionary>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_dictionary>?) -> Unit>>>(216).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_dictionary>?) -> Unit>>>(216).value = value }
    
    var profiling_start: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(224).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(224).value = value }
    
    var profiling_stop: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(232).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(232).value = value }
    
    var profiling_get_accumulated_data: CPointer<CFunction<(COpaquePointer?, CPointer<godot_pluginscript_profiling_data>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_pluginscript_profiling_data>?, Int) -> Int>>>(240).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_pluginscript_profiling_data>?, Int) -> Int>>>(240).value = value }
    
    var profiling_get_frame_data: CPointer<CFunction<(COpaquePointer?, CPointer<godot_pluginscript_profiling_data>?, Int) -> Int>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_pluginscript_profiling_data>?, Int) -> Int>>>(248).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?, CPointer<godot_pluginscript_profiling_data>?, Int) -> Int>>>(248).value = value }
    
    var profiling_frame: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(256).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(256).value = value }
    
    val script_desc: godot_pluginscript_script_desc
        get() = memberAt(264)
    
}

enum class godot_error(override val value: Int) : CEnum {
    GODOT_OK(0),
    GODOT_FAILED(1),
    GODOT_ERR_UNAVAILABLE(2),
    GODOT_ERR_UNCONFIGURED(3),
    GODOT_ERR_UNAUTHORIZED(4),
    GODOT_ERR_PARAMETER_RANGE_ERROR(5),
    GODOT_ERR_OUT_OF_MEMORY(6),
    GODOT_ERR_FILE_NOT_FOUND(7),
    GODOT_ERR_FILE_BAD_DRIVE(8),
    GODOT_ERR_FILE_BAD_PATH(9),
    GODOT_ERR_FILE_NO_PERMISSION(10),
    GODOT_ERR_FILE_ALREADY_IN_USE(11),
    GODOT_ERR_FILE_CANT_OPEN(12),
    GODOT_ERR_FILE_CANT_WRITE(13),
    GODOT_ERR_FILE_CANT_READ(14),
    GODOT_ERR_FILE_UNRECOGNIZED(15),
    GODOT_ERR_FILE_CORRUPT(16),
    GODOT_ERR_FILE_MISSING_DEPENDENCIES(17),
    GODOT_ERR_FILE_EOF(18),
    GODOT_ERR_CANT_OPEN(19),
    GODOT_ERR_CANT_CREATE(20),
    GODOT_ERR_QUERY_FAILED(21),
    GODOT_ERR_ALREADY_IN_USE(22),
    GODOT_ERR_LOCKED(23),
    GODOT_ERR_TIMEOUT(24),
    GODOT_ERR_CANT_CONNECT(25),
    GODOT_ERR_CANT_RESOLVE(26),
    GODOT_ERR_CONNECTION_ERROR(27),
    GODOT_ERR_CANT_ACQUIRE_RESOURCE(28),
    GODOT_ERR_CANT_FORK(29),
    GODOT_ERR_INVALID_DATA(30),
    GODOT_ERR_INVALID_PARAMETER(31),
    GODOT_ERR_ALREADY_EXISTS(32),
    GODOT_ERR_DOES_NOT_EXIST(33),
    GODOT_ERR_DATABASE_CANT_READ(34),
    GODOT_ERR_DATABASE_CANT_WRITE(35),
    GODOT_ERR_COMPILATION_FAILED(36),
    GODOT_ERR_METHOD_NOT_FOUND(37),
    GODOT_ERR_LINK_FAILED(38),
    GODOT_ERR_SCRIPT_FAILED(39),
    GODOT_ERR_CYCLIC_LINK(40),
    GODOT_ERR_INVALID_DECLARATION(41),
    GODOT_ERR_DUPLICATE_SYMBOL(42),
    GODOT_ERR_PARSE_ERROR(43),
    GODOT_ERR_BUSY(44),
    GODOT_ERR_SKIP(45),
    GODOT_ERR_HELP(46),
    GODOT_ERR_BUG(47),
    GODOT_ERR_PRINTER_ON_FIRE(48),
    ;
    
    companion object {
        fun byValue(value: Int) = godot_error.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: godot_error
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class godot_vector3_axis(override val value: Int) : CEnum {
    GODOT_VECTOR3_AXIS_X(0),
    GODOT_VECTOR3_AXIS_Y(1),
    GODOT_VECTOR3_AXIS_Z(2),
    ;
    
    companion object {
        fun byValue(value: Int) = godot_vector3_axis.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: godot_vector3_axis
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class godot_variant_type(override val value: Int) : CEnum {
    GODOT_VARIANT_TYPE_NIL(0),
    GODOT_VARIANT_TYPE_BOOL(1),
    GODOT_VARIANT_TYPE_INT(2),
    GODOT_VARIANT_TYPE_REAL(3),
    GODOT_VARIANT_TYPE_STRING(4),
    GODOT_VARIANT_TYPE_VECTOR2(5),
    GODOT_VARIANT_TYPE_RECT2(6),
    GODOT_VARIANT_TYPE_VECTOR3(7),
    GODOT_VARIANT_TYPE_TRANSFORM2D(8),
    GODOT_VARIANT_TYPE_PLANE(9),
    GODOT_VARIANT_TYPE_QUAT(10),
    GODOT_VARIANT_TYPE_AABB(11),
    GODOT_VARIANT_TYPE_BASIS(12),
    GODOT_VARIANT_TYPE_TRANSFORM(13),
    GODOT_VARIANT_TYPE_COLOR(14),
    GODOT_VARIANT_TYPE_NODE_PATH(15),
    GODOT_VARIANT_TYPE_RID(16),
    GODOT_VARIANT_TYPE_OBJECT(17),
    GODOT_VARIANT_TYPE_DICTIONARY(18),
    GODOT_VARIANT_TYPE_ARRAY(19),
    GODOT_VARIANT_TYPE_POOL_BYTE_ARRAY(20),
    GODOT_VARIANT_TYPE_POOL_INT_ARRAY(21),
    GODOT_VARIANT_TYPE_POOL_REAL_ARRAY(22),
    GODOT_VARIANT_TYPE_POOL_STRING_ARRAY(23),
    GODOT_VARIANT_TYPE_POOL_VECTOR2_ARRAY(24),
    GODOT_VARIANT_TYPE_POOL_VECTOR3_ARRAY(25),
    GODOT_VARIANT_TYPE_POOL_COLOR_ARRAY(26),
    ;
    
    companion object {
        fun byValue(value: Int) = godot_variant_type.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: godot_variant_type
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class godot_variant_call_error_error(override val value: Int) : CEnum {
    GODOT_CALL_ERROR_CALL_OK(0),
    GODOT_CALL_ERROR_CALL_ERROR_INVALID_METHOD(1),
    GODOT_CALL_ERROR_CALL_ERROR_INVALID_ARGUMENT(2),
    GODOT_CALL_ERROR_CALL_ERROR_TOO_MANY_ARGUMENTS(3),
    GODOT_CALL_ERROR_CALL_ERROR_TOO_FEW_ARGUMENTS(4),
    GODOT_CALL_ERROR_CALL_ERROR_INSTANCE_IS_NULL(5),
    ;
    
    companion object {
        fun byValue(value: Int) = godot_variant_call_error_error.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: godot_variant_call_error_error
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class godot_method_rpc_mode(override val value: Int) : CEnum {
    GODOT_METHOD_RPC_MODE_DISABLED(0),
    GODOT_METHOD_RPC_MODE_REMOTE(1),
    GODOT_METHOD_RPC_MODE_SYNC(2),
    GODOT_METHOD_RPC_MODE_MASTER(3),
    GODOT_METHOD_RPC_MODE_SLAVE(4),
    ;
    
    companion object {
        fun byValue(value: Int) = godot_method_rpc_mode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: godot_method_rpc_mode
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class godot_property_hint(override val value: Int) : CEnum {
    GODOT_PROPERTY_HINT_NONE(0),
    GODOT_PROPERTY_HINT_RANGE(1),
    GODOT_PROPERTY_HINT_EXP_RANGE(2),
    GODOT_PROPERTY_HINT_ENUM(3),
    GODOT_PROPERTY_HINT_EXP_EASING(4),
    GODOT_PROPERTY_HINT_LENGTH(5),
    GODOT_PROPERTY_HINT_SPRITE_FRAME(6),
    GODOT_PROPERTY_HINT_KEY_ACCEL(7),
    GODOT_PROPERTY_HINT_FLAGS(8),
    GODOT_PROPERTY_HINT_LAYERS_2D_RENDER(9),
    GODOT_PROPERTY_HINT_LAYERS_2D_PHYSICS(10),
    GODOT_PROPERTY_HINT_LAYERS_3D_RENDER(11),
    GODOT_PROPERTY_HINT_LAYERS_3D_PHYSICS(12),
    GODOT_PROPERTY_HINT_FILE(13),
    GODOT_PROPERTY_HINT_DIR(14),
    GODOT_PROPERTY_HINT_GLOBAL_FILE(15),
    GODOT_PROPERTY_HINT_GLOBAL_DIR(16),
    GODOT_PROPERTY_HINT_RESOURCE_TYPE(17),
    GODOT_PROPERTY_HINT_MULTILINE_TEXT(18),
    GODOT_PROPERTY_HINT_COLOR_NO_ALPHA(19),
    GODOT_PROPERTY_HINT_IMAGE_COMPRESS_LOSSY(20),
    GODOT_PROPERTY_HINT_IMAGE_COMPRESS_LOSSLESS(21),
    GODOT_PROPERTY_HINT_OBJECT_ID(22),
    GODOT_PROPERTY_HINT_TYPE_STRING(23),
    GODOT_PROPERTY_HINT_NODE_PATH_TO_EDITED_NODE(24),
    GODOT_PROPERTY_HINT_METHOD_OF_VARIANT_TYPE(25),
    GODOT_PROPERTY_HINT_METHOD_OF_BASE_TYPE(26),
    GODOT_PROPERTY_HINT_METHOD_OF_INSTANCE(27),
    GODOT_PROPERTY_HINT_METHOD_OF_SCRIPT(28),
    GODOT_PROPERTY_HINT_PROPERTY_OF_VARIANT_TYPE(29),
    GODOT_PROPERTY_HINT_PROPERTY_OF_BASE_TYPE(30),
    GODOT_PROPERTY_HINT_PROPERTY_OF_INSTANCE(31),
    GODOT_PROPERTY_HINT_PROPERTY_OF_SCRIPT(32),
    GODOT_PROPERTY_HINT_MAX(33),
    ;
    
    companion object {
        fun byValue(value: Int) = godot_property_hint.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: godot_property_hint
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias godot_property_usage_flagsVar = IntVarOf<godot_property_usage_flags>
typealias godot_property_usage_flags = Int

val GODOT_PROPERTY_USAGE_STORAGE: godot_property_usage_flags = 1
val GODOT_PROPERTY_USAGE_EDITOR: godot_property_usage_flags = 2
val GODOT_PROPERTY_USAGE_NETWORK: godot_property_usage_flags = 4
val GODOT_PROPERTY_USAGE_EDITOR_HELPER: godot_property_usage_flags = 8
val GODOT_PROPERTY_USAGE_CHECKABLE: godot_property_usage_flags = 16
val GODOT_PROPERTY_USAGE_CHECKED: godot_property_usage_flags = 32
val GODOT_PROPERTY_USAGE_INTERNATIONALIZED: godot_property_usage_flags = 64
val GODOT_PROPERTY_USAGE_GROUP: godot_property_usage_flags = 128
val GODOT_PROPERTY_USAGE_CATEGORY: godot_property_usage_flags = 256
val GODOT_PROPERTY_USAGE_STORE_IF_NONZERO: godot_property_usage_flags = 512
val GODOT_PROPERTY_USAGE_STORE_IF_NONONE: godot_property_usage_flags = 1024
val GODOT_PROPERTY_USAGE_NO_INSTANCE_STATE: godot_property_usage_flags = 2048
val GODOT_PROPERTY_USAGE_RESTART_IF_CHANGED: godot_property_usage_flags = 4096
val GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE: godot_property_usage_flags = 8192
val GODOT_PROPERTY_USAGE_STORE_IF_NULL: godot_property_usage_flags = 16384
val GODOT_PROPERTY_USAGE_ANIMATE_AS_TRIGGER: godot_property_usage_flags = 32768
val GODOT_PROPERTY_USAGE_UPDATE_ALL_IF_MODIFIED: godot_property_usage_flags = 65536
val GODOT_PROPERTY_USAGE_DEFAULT: godot_property_usage_flags = 7
val GODOT_PROPERTY_USAGE_DEFAULT_INTL: godot_property_usage_flags = 71
val GODOT_PROPERTY_USAGE_NOEDITOR: godot_property_usage_flags = 5

typealias godot_boolVar = BooleanVarOf<godot_bool>
typealias godot_bool = Boolean

typealias godot_intVar = IntVarOf<godot_int>
typealias godot_int = Int

typealias godot_realVar = FloatVarOf<godot_real>
typealias godot_real = Float

typealias godot_char_typeVar = IntVarOf<godot_char_type>
typealias godot_char_type = wchar_t

typealias godot_pool_byte_array_read_access = godot_pool_array_read_access

typealias godot_pool_int_array_read_access = godot_pool_array_read_access

typealias godot_pool_real_array_read_access = godot_pool_array_read_access

typealias godot_pool_string_array_read_access = godot_pool_array_read_access

typealias godot_pool_vector2_array_read_access = godot_pool_array_read_access

typealias godot_pool_vector3_array_read_access = godot_pool_array_read_access

typealias godot_pool_color_array_read_access = godot_pool_array_read_access

typealias godot_pool_byte_array_write_access = godot_pool_array_write_access

typealias godot_pool_int_array_write_access = godot_pool_array_write_access

typealias godot_pool_real_array_write_access = godot_pool_array_write_access

typealias godot_pool_string_array_write_access = godot_pool_array_write_access

typealias godot_pool_vector2_array_write_access = godot_pool_array_write_access

typealias godot_pool_vector3_array_write_access = godot_pool_array_write_access

typealias godot_pool_color_array_write_access = godot_pool_array_write_access

typealias godot_class_constructorVar = CPointerVarOf<godot_class_constructor>
typealias godot_class_constructor = COpaquePointer

typealias godot_gdnative_init_fnVar = CPointerVarOf<godot_gdnative_init_fn>
typealias godot_gdnative_init_fn = CPointer<CFunction<(CPointer<godot_gdnative_init_options>?) -> Unit>>

typealias godot_gdnative_terminate_fnVar = CPointerVarOf<godot_gdnative_terminate_fn>
typealias godot_gdnative_terminate_fn = CPointer<CFunction<(CPointer<godot_gdnative_terminate_options>?) -> Unit>>

typealias godot_gdnative_procedure_fnVar = CPointerVarOf<godot_gdnative_procedure_fn>
typealias godot_gdnative_procedure_fn = CPointer<CFunction<(CPointer<godot_array>?) -> CValue<godot_variant>>>

typealias native_call_cbVar = CPointerVarOf<native_call_cb>
typealias native_call_cb = CPointer<CFunction<(COpaquePointer?, CPointer<godot_array>?) -> CValue<godot_variant>>>

@SymbolName("godotapi_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("godotapi_kniBridge1")
private external fun kniBridge1(p0: NativePtr, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("godotapi_kniBridge2")
private external fun kniBridge2(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge4")
private external fun kniBridge4(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge6")
private external fun kniBridge6(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge8")
private external fun kniBridge8(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge10")
private external fun kniBridge10(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge12")
private external fun kniBridge12(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge14")
private external fun kniBridge14(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge16")
private external fun kniBridge16(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: Byte, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: Float, p2: Float): Unit
@SymbolName("godotapi_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge27")
private external fun kniBridge27(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge28")
private external fun kniBridge28(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge29")
private external fun kniBridge29(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge30")
private external fun kniBridge30(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge31")
private external fun kniBridge31(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Float, p5: NativePtr): Unit
@SymbolName("godotapi_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge41")
private external fun kniBridge41(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge59")
private external fun kniBridge59(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge60")
private external fun kniBridge60(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("godotapi_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr, p2: Float): Unit
@SymbolName("godotapi_kniBridge63")
private external fun kniBridge63(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge65")
private external fun kniBridge65(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge67")
private external fun kniBridge67(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge69")
private external fun kniBridge69(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge72")
private external fun kniBridge72(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge73")
private external fun kniBridge73(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge75")
private external fun kniBridge75(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge79")
private external fun kniBridge79(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Float, p5: NativePtr): Unit
@SymbolName("godotapi_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge85")
private external fun kniBridge85(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: NativePtr, p2: Float): Unit
@SymbolName("godotapi_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge91")
private external fun kniBridge91(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge95")
private external fun kniBridge95(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge103")
private external fun kniBridge103(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge105")
private external fun kniBridge105(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge106")
private external fun kniBridge106(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge109")
private external fun kniBridge109(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge113")
private external fun kniBridge113(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("godotapi_kniBridge119")
private external fun kniBridge119(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge120")
private external fun kniBridge120(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge121")
private external fun kniBridge121(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge122")
private external fun kniBridge122(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge123")
private external fun kniBridge123(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge124")
private external fun kniBridge124(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Float, p5: NativePtr): Unit
@SymbolName("godotapi_kniBridge131")
private external fun kniBridge131(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge133")
private external fun kniBridge133(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge135")
private external fun kniBridge135(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge139")
private external fun kniBridge139(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge141")
private external fun kniBridge141(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge143")
private external fun kniBridge143(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge145")
private external fun kniBridge145(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge147")
private external fun kniBridge147(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge151")
private external fun kniBridge151(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge153")
private external fun kniBridge153(p0: NativePtr, p1: Int, p2: Float): Unit
@SymbolName("godotapi_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: Int): Float
@SymbolName("godotapi_kniBridge155")
private external fun kniBridge155(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge158")
private external fun kniBridge158(p0: NativePtr, p1: Byte): Unit
@SymbolName("godotapi_kniBridge159")
private external fun kniBridge159(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: Int, p2: Byte): Int
@SymbolName("godotapi_kniBridge161")
private external fun kniBridge161(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: Byte): Unit
@SymbolName("godotapi_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge165")
private external fun kniBridge165(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge166")
private external fun kniBridge166(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: Int, p2: Byte): Unit
@SymbolName("godotapi_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: Int): Byte
@SymbolName("godotapi_kniBridge169")
private external fun kniBridge169(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge170")
private external fun kniBridge170(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge171")
private external fun kniBridge171(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge173")
private external fun kniBridge173(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge175")
private external fun kniBridge175(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("godotapi_kniBridge177")
private external fun kniBridge177(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge181")
private external fun kniBridge181(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge182")
private external fun kniBridge182(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge183")
private external fun kniBridge183(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("godotapi_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: Int): Int
@SymbolName("godotapi_kniBridge185")
private external fun kniBridge185(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge186")
private external fun kniBridge186(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge187")
private external fun kniBridge187(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge188")
private external fun kniBridge188(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge189")
private external fun kniBridge189(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge191")
private external fun kniBridge191(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: Int, p2: Float): Int
@SymbolName("godotapi_kniBridge193")
private external fun kniBridge193(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge194")
private external fun kniBridge194(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge197")
private external fun kniBridge197(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge198")
private external fun kniBridge198(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge199")
private external fun kniBridge199(p0: NativePtr, p1: Int, p2: Float): Unit
@SymbolName("godotapi_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: Int): Float
@SymbolName("godotapi_kniBridge201")
private external fun kniBridge201(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge202")
private external fun kniBridge202(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge203")
private external fun kniBridge203(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge205")
private external fun kniBridge205(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge207")
private external fun kniBridge207(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("godotapi_kniBridge209")
private external fun kniBridge209(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge211")
private external fun kniBridge211(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge212")
private external fun kniBridge212(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge213")
private external fun kniBridge213(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge214")
private external fun kniBridge214(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge215")
private external fun kniBridge215(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge217")
private external fun kniBridge217(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge218")
private external fun kniBridge218(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge219")
private external fun kniBridge219(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge220")
private external fun kniBridge220(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge221")
private external fun kniBridge221(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge223")
private external fun kniBridge223(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("godotapi_kniBridge225")
private external fun kniBridge225(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge226")
private external fun kniBridge226(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge227")
private external fun kniBridge227(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge228")
private external fun kniBridge228(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge229")
private external fun kniBridge229(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge230")
private external fun kniBridge230(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge231")
private external fun kniBridge231(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge233")
private external fun kniBridge233(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge234")
private external fun kniBridge234(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge235")
private external fun kniBridge235(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge237")
private external fun kniBridge237(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge238")
private external fun kniBridge238(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge239")
private external fun kniBridge239(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge240")
private external fun kniBridge240(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("godotapi_kniBridge241")
private external fun kniBridge241(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge243")
private external fun kniBridge243(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge245")
private external fun kniBridge245(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge246")
private external fun kniBridge246(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge247")
private external fun kniBridge247(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge248")
private external fun kniBridge248(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge249")
private external fun kniBridge249(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge250")
private external fun kniBridge250(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge251")
private external fun kniBridge251(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge253")
private external fun kniBridge253(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge255")
private external fun kniBridge255(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("godotapi_kniBridge257")
private external fun kniBridge257(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge259")
private external fun kniBridge259(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge260")
private external fun kniBridge260(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge261")
private external fun kniBridge261(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge262")
private external fun kniBridge262(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge263")
private external fun kniBridge263(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge265")
private external fun kniBridge265(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge266")
private external fun kniBridge266(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge267")
private external fun kniBridge267(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge268")
private external fun kniBridge268(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge269")
private external fun kniBridge269(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge270")
private external fun kniBridge270(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge271")
private external fun kniBridge271(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge272")
private external fun kniBridge272(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge273")
private external fun kniBridge273(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge274")
private external fun kniBridge274(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge275")
private external fun kniBridge275(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge276")
private external fun kniBridge276(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge277")
private external fun kniBridge277(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge278")
private external fun kniBridge278(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge279")
private external fun kniBridge279(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge280")
private external fun kniBridge280(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge281")
private external fun kniBridge281(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge282")
private external fun kniBridge282(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge283")
private external fun kniBridge283(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge284")
private external fun kniBridge284(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge285")
private external fun kniBridge285(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge286")
private external fun kniBridge286(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge287")
private external fun kniBridge287(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge288")
private external fun kniBridge288(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge289")
private external fun kniBridge289(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge290")
private external fun kniBridge290(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge291")
private external fun kniBridge291(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge292")
private external fun kniBridge292(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge293")
private external fun kniBridge293(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge294")
private external fun kniBridge294(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge295")
private external fun kniBridge295(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge296")
private external fun kniBridge296(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge297")
private external fun kniBridge297(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge298")
private external fun kniBridge298(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge299")
private external fun kniBridge299(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge300")
private external fun kniBridge300(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge301")
private external fun kniBridge301(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge302")
private external fun kniBridge302(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge303")
private external fun kniBridge303(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge304")
private external fun kniBridge304(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge305")
private external fun kniBridge305(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge306")
private external fun kniBridge306(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge307")
private external fun kniBridge307(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge308")
private external fun kniBridge308(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge309")
private external fun kniBridge309(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge310")
private external fun kniBridge310(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge311")
private external fun kniBridge311(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge312")
private external fun kniBridge312(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge313")
private external fun kniBridge313(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge314")
private external fun kniBridge314(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge315")
private external fun kniBridge315(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge316")
private external fun kniBridge316(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge317")
private external fun kniBridge317(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge318")
private external fun kniBridge318(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge319")
private external fun kniBridge319(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge320")
private external fun kniBridge320(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge321")
private external fun kniBridge321(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge322")
private external fun kniBridge322(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge323")
private external fun kniBridge323(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge324")
private external fun kniBridge324(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge325")
private external fun kniBridge325(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge326")
private external fun kniBridge326(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge327")
private external fun kniBridge327(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge328")
private external fun kniBridge328(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge329")
private external fun kniBridge329(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge330")
private external fun kniBridge330(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge331")
private external fun kniBridge331(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge332")
private external fun kniBridge332(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge333")
private external fun kniBridge333(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge334")
private external fun kniBridge334(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge335")
private external fun kniBridge335(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge337")
private external fun kniBridge337(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge338")
private external fun kniBridge338(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge339")
private external fun kniBridge339(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge340")
private external fun kniBridge340(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge341")
private external fun kniBridge341(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge342")
private external fun kniBridge342(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge343")
private external fun kniBridge343(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge344")
private external fun kniBridge344(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge345")
private external fun kniBridge345(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge346")
private external fun kniBridge346(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge347")
private external fun kniBridge347(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge348")
private external fun kniBridge348(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge349")
private external fun kniBridge349(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge351")
private external fun kniBridge351(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge352")
private external fun kniBridge352(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge353")
private external fun kniBridge353(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge354")
private external fun kniBridge354(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("godotapi_kniBridge355")
private external fun kniBridge355(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: NativePtr, p2: Float): Unit
@SymbolName("godotapi_kniBridge357")
private external fun kniBridge357(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge358")
private external fun kniBridge358(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge359")
private external fun kniBridge359(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge360")
private external fun kniBridge360(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge361")
private external fun kniBridge361(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge362")
private external fun kniBridge362(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge363")
private external fun kniBridge363(p0: NativePtr, p1: NativePtr, p2: Float): Byte
@SymbolName("godotapi_kniBridge364")
private external fun kniBridge364(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge365")
private external fun kniBridge365(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@SymbolName("godotapi_kniBridge366")
private external fun kniBridge366(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@SymbolName("godotapi_kniBridge367")
private external fun kniBridge367(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@SymbolName("godotapi_kniBridge368")
private external fun kniBridge368(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge369")
private external fun kniBridge369(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge370")
private external fun kniBridge370(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge371")
private external fun kniBridge371(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge372")
private external fun kniBridge372(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge373")
private external fun kniBridge373(p0: NativePtr, p1: Float): Unit
@SymbolName("godotapi_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge375")
private external fun kniBridge375(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("godotapi_kniBridge376")
private external fun kniBridge376(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge377")
private external fun kniBridge377(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge378")
private external fun kniBridge378(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge379")
private external fun kniBridge379(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge380")
private external fun kniBridge380(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge381")
private external fun kniBridge381(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge382")
private external fun kniBridge382(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge383")
private external fun kniBridge383(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge384")
private external fun kniBridge384(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge385")
private external fun kniBridge385(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge386")
private external fun kniBridge386(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge387")
private external fun kniBridge387(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge388")
private external fun kniBridge388(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge389")
private external fun kniBridge389(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge390")
private external fun kniBridge390(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge391")
private external fun kniBridge391(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge392")
private external fun kniBridge392(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge393")
private external fun kniBridge393(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge394")
private external fun kniBridge394(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge395")
private external fun kniBridge395(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge396")
private external fun kniBridge396(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("godotapi_kniBridge397")
private external fun kniBridge397(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge398")
private external fun kniBridge398(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge399")
private external fun kniBridge399(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge401")
private external fun kniBridge401(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge402")
private external fun kniBridge402(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge403")
private external fun kniBridge403(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge404")
private external fun kniBridge404(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge405")
private external fun kniBridge405(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge406")
private external fun kniBridge406(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge407")
private external fun kniBridge407(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge408")
private external fun kniBridge408(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge409")
private external fun kniBridge409(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge410")
private external fun kniBridge410(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge411")
private external fun kniBridge411(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge412")
private external fun kniBridge412(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge413")
private external fun kniBridge413(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge414")
private external fun kniBridge414(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge415")
private external fun kniBridge415(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge416")
private external fun kniBridge416(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge417")
private external fun kniBridge417(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge418")
private external fun kniBridge418(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge419")
private external fun kniBridge419(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge420")
private external fun kniBridge420(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge421")
private external fun kniBridge421(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge422")
private external fun kniBridge422(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge423")
private external fun kniBridge423(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge424")
private external fun kniBridge424(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge425")
private external fun kniBridge425(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge426")
private external fun kniBridge426(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge427")
private external fun kniBridge427(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge428")
private external fun kniBridge428(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge429")
private external fun kniBridge429(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge431")
private external fun kniBridge431(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge432")
private external fun kniBridge432(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge433")
private external fun kniBridge433(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge434")
private external fun kniBridge434(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge435")
private external fun kniBridge435(p0: NativePtr, p1: NativePtr, p2: Float, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge437")
private external fun kniBridge437(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge438")
private external fun kniBridge438(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge439")
private external fun kniBridge439(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge440")
private external fun kniBridge440(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge441")
private external fun kniBridge441(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge442")
private external fun kniBridge442(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge443")
private external fun kniBridge443(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge444")
private external fun kniBridge444(p0: NativePtr, p1: Byte): Unit
@SymbolName("godotapi_kniBridge445")
private external fun kniBridge445(p0: NativePtr, p1: Long): Unit
@SymbolName("godotapi_kniBridge446")
private external fun kniBridge446(p0: NativePtr, p1: Long): Unit
@SymbolName("godotapi_kniBridge447")
private external fun kniBridge447(p0: NativePtr, p1: Double): Unit
@SymbolName("godotapi_kniBridge448")
private external fun kniBridge448(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge449")
private external fun kniBridge449(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge450")
private external fun kniBridge450(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge451")
private external fun kniBridge451(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge452")
private external fun kniBridge452(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge453")
private external fun kniBridge453(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge454")
private external fun kniBridge454(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge455")
private external fun kniBridge455(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge456")
private external fun kniBridge456(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge457")
private external fun kniBridge457(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge458")
private external fun kniBridge458(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge459")
private external fun kniBridge459(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge460")
private external fun kniBridge460(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge461")
private external fun kniBridge461(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge462")
private external fun kniBridge462(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge463")
private external fun kniBridge463(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge464")
private external fun kniBridge464(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge465")
private external fun kniBridge465(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge466")
private external fun kniBridge466(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge467")
private external fun kniBridge467(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge468")
private external fun kniBridge468(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge469")
private external fun kniBridge469(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge470")
private external fun kniBridge470(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge471")
private external fun kniBridge471(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge472")
private external fun kniBridge472(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge473")
private external fun kniBridge473(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge474")
private external fun kniBridge474(p0: NativePtr): Double
@SymbolName("godotapi_kniBridge475")
private external fun kniBridge475(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge477")
private external fun kniBridge477(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge478")
private external fun kniBridge478(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge479")
private external fun kniBridge479(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge480")
private external fun kniBridge480(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge481")
private external fun kniBridge481(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge482")
private external fun kniBridge482(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge483")
private external fun kniBridge483(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge484")
private external fun kniBridge484(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge485")
private external fun kniBridge485(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge486")
private external fun kniBridge486(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge487")
private external fun kniBridge487(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge488")
private external fun kniBridge488(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge489")
private external fun kniBridge489(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge490")
private external fun kniBridge490(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge491")
private external fun kniBridge491(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge492")
private external fun kniBridge492(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge493")
private external fun kniBridge493(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge494")
private external fun kniBridge494(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge495")
private external fun kniBridge495(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge496")
private external fun kniBridge496(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge497")
private external fun kniBridge497(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge498")
private external fun kniBridge498(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("godotapi_kniBridge499")
private external fun kniBridge499(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge500")
private external fun kniBridge500(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge501")
private external fun kniBridge501(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge503")
private external fun kniBridge503(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge504")
private external fun kniBridge504(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge505")
private external fun kniBridge505(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge506")
private external fun kniBridge506(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge507")
private external fun kniBridge507(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge508")
private external fun kniBridge508(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge509")
private external fun kniBridge509(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge510")
private external fun kniBridge510(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge511")
private external fun kniBridge511(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge512")
private external fun kniBridge512(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge513")
private external fun kniBridge513(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge514")
private external fun kniBridge514(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge515")
private external fun kniBridge515(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge516")
private external fun kniBridge516(p0: NativePtr, p1: Int): NativePtr
@SymbolName("godotapi_kniBridge517")
private external fun kniBridge517(p0: NativePtr, p1: Int): NativePtr
@SymbolName("godotapi_kniBridge518")
private external fun kniBridge518(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge519")
private external fun kniBridge519(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge520")
private external fun kniBridge520(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge521")
private external fun kniBridge521(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge522")
private external fun kniBridge522(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge523")
private external fun kniBridge523(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge524")
private external fun kniBridge524(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge525")
private external fun kniBridge525(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge527")
private external fun kniBridge527(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge528")
private external fun kniBridge528(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge529")
private external fun kniBridge529(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge530")
private external fun kniBridge530(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge531")
private external fun kniBridge531(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge533")
private external fun kniBridge533(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge534")
private external fun kniBridge534(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge535")
private external fun kniBridge535(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge536")
private external fun kniBridge536(p0: NativePtr, p1: Int): Unit
@SymbolName("godotapi_kniBridge537")
private external fun kniBridge537(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge538")
private external fun kniBridge538(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge539")
private external fun kniBridge539(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge540")
private external fun kniBridge540(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge541")
private external fun kniBridge541(p0: NativePtr, p1: NativePtr, p2: Byte): Int
@SymbolName("godotapi_kniBridge542")
private external fun kniBridge542(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Byte): Int
@SymbolName("godotapi_kniBridge543")
private external fun kniBridge543(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge544")
private external fun kniBridge544(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge545")
private external fun kniBridge545(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge546")
private external fun kniBridge546(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge547")
private external fun kniBridge547(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge548")
private external fun kniBridge548(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge549")
private external fun kniBridge549(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("godotapi_kniBridge550")
private external fun kniBridge550(p0: NativePtr, p1: Int): NativePtr
@SymbolName("godotapi_kniBridge551")
private external fun kniBridge551(p0: NativePtr, p1: Int): Int
@SymbolName("godotapi_kniBridge552")
private external fun kniBridge552(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge553")
private external fun kniBridge553(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge554")
private external fun kniBridge554(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge555")
private external fun kniBridge555(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge556")
private external fun kniBridge556(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge557")
private external fun kniBridge557(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge558")
private external fun kniBridge558(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge559")
private external fun kniBridge559(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge560")
private external fun kniBridge560(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge561")
private external fun kniBridge561(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge562")
private external fun kniBridge562(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge563")
private external fun kniBridge563(p0: Int, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge564")
private external fun kniBridge564(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge565")
private external fun kniBridge565(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge566")
private external fun kniBridge566(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge567")
private external fun kniBridge567(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge568")
private external fun kniBridge568(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge569")
private external fun kniBridge569(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Int
@SymbolName("godotapi_kniBridge570")
private external fun kniBridge570(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge571")
private external fun kniBridge571(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge572")
private external fun kniBridge572(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge573")
private external fun kniBridge573(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge574")
private external fun kniBridge574(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge575")
private external fun kniBridge575(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge576")
private external fun kniBridge576(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge577")
private external fun kniBridge577(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge578")
private external fun kniBridge578(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge579")
private external fun kniBridge579(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge580")
private external fun kniBridge580(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge581")
private external fun kniBridge581(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge582")
private external fun kniBridge582(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge583")
private external fun kniBridge583(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge584")
private external fun kniBridge584(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge585")
private external fun kniBridge585(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge586")
private external fun kniBridge586(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge587")
private external fun kniBridge587(p0: Double, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge588")
private external fun kniBridge588(p0: Long, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge589")
private external fun kniBridge589(p0: Long, p1: Int, p2: Byte, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge590")
private external fun kniBridge590(p0: Double, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge591")
private external fun kniBridge591(p0: Double, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge592")
private external fun kniBridge592(p0: Double, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge593")
private external fun kniBridge593(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge594")
private external fun kniBridge594(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge595")
private external fun kniBridge595(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge596")
private external fun kniBridge596(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge597")
private external fun kniBridge597(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge598")
private external fun kniBridge598(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge599")
private external fun kniBridge599(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge600")
private external fun kniBridge600(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge601")
private external fun kniBridge601(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("godotapi_kniBridge602")
private external fun kniBridge602(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge603")
private external fun kniBridge603(p0: NativePtr, p1: Int, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge604")
private external fun kniBridge604(p0: NativePtr, p1: NativePtr): Float
@SymbolName("godotapi_kniBridge605")
private external fun kniBridge605(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge606")
private external fun kniBridge606(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge607")
private external fun kniBridge607(p0: NativePtr): Double
@SymbolName("godotapi_kniBridge608")
private external fun kniBridge608(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge609")
private external fun kniBridge609(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge611")
private external fun kniBridge611(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge612")
private external fun kniBridge612(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge613")
private external fun kniBridge613(p0: NativePtr): Double
@SymbolName("godotapi_kniBridge614")
private external fun kniBridge614(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge615")
private external fun kniBridge615(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge616")
private external fun kniBridge616(p0: NativePtr, p1: Int): Int
@SymbolName("godotapi_kniBridge617")
private external fun kniBridge617(p0: NativePtr, p1: Int): Long
@SymbolName("godotapi_kniBridge618")
private external fun kniBridge618(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge619")
private external fun kniBridge619(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge620")
private external fun kniBridge620(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge621")
private external fun kniBridge621(p0: NativePtr, p1: NativePtr): Double
@SymbolName("godotapi_kniBridge622")
private external fun kniBridge622(p0: NativePtr, p1: NativePtr): Int
@SymbolName("godotapi_kniBridge623")
private external fun kniBridge623(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge624")
private external fun kniBridge624(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge625")
private external fun kniBridge625(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge626")
private external fun kniBridge626(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge627")
private external fun kniBridge627(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge628")
private external fun kniBridge628(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge629")
private external fun kniBridge629(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge630")
private external fun kniBridge630(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge631")
private external fun kniBridge631(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge632")
private external fun kniBridge632(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge633")
private external fun kniBridge633(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge634")
private external fun kniBridge634(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge635")
private external fun kniBridge635(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge636")
private external fun kniBridge636(p0: Int): Int
@SymbolName("godotapi_kniBridge637")
private external fun kniBridge637(p0: Int): Int
@SymbolName("godotapi_kniBridge638")
private external fun kniBridge638(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge639")
private external fun kniBridge639(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge640")
private external fun kniBridge640(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge641")
private external fun kniBridge641(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge642")
private external fun kniBridge642(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge643")
private external fun kniBridge643(p0: NativePtr, p1: Int): Int
@SymbolName("godotapi_kniBridge644")
private external fun kniBridge644(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge645")
private external fun kniBridge645(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge646")
private external fun kniBridge646(p0: NativePtr, p1: Byte, p2: Byte, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge647")
private external fun kniBridge647(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge648")
private external fun kniBridge648(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("godotapi_kniBridge649")
private external fun kniBridge649(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge650")
private external fun kniBridge650(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge651")
private external fun kniBridge651(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge652")
private external fun kniBridge652(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge653")
private external fun kniBridge653(p0: NativePtr, p1: NativePtr, p2: Int): Byte
@SymbolName("godotapi_kniBridge654")
private external fun kniBridge654(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge655")
private external fun kniBridge655(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge656")
private external fun kniBridge656(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge657")
private external fun kniBridge657(p0: NativePtr): Long
@SymbolName("godotapi_kniBridge658")
private external fun kniBridge658(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge659")
private external fun kniBridge659(p0: NativePtr, p1: Int): Int
@SymbolName("godotapi_kniBridge660")
private external fun kniBridge660(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge661")
private external fun kniBridge661(p0: NativePtr, p1: Int): Int
@SymbolName("godotapi_kniBridge662")
private external fun kniBridge662(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge663")
private external fun kniBridge663(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge664")
private external fun kniBridge664(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge665")
private external fun kniBridge665(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge666")
private external fun kniBridge666(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge667")
private external fun kniBridge667(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge668")
private external fun kniBridge668(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge669")
private external fun kniBridge669(p0: Long, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge670")
private external fun kniBridge670(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge671")
private external fun kniBridge671(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge672")
private external fun kniBridge672(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge673")
private external fun kniBridge673(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge674")
private external fun kniBridge674(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge675")
private external fun kniBridge675(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge676")
private external fun kniBridge676(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge677")
private external fun kniBridge677(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge678")
private external fun kniBridge678(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge679")
private external fun kniBridge679(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge680")
private external fun kniBridge680(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge681")
private external fun kniBridge681(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge682")
private external fun kniBridge682(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge683")
private external fun kniBridge683(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge684")
private external fun kniBridge684(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge685")
private external fun kniBridge685(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge686")
private external fun kniBridge686(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge687")
private external fun kniBridge687(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge688")
private external fun kniBridge688(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge689")
private external fun kniBridge689(p0: NativePtr, p1: Byte): Byte
@SymbolName("godotapi_kniBridge690")
private external fun kniBridge690(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge691")
private external fun kniBridge691(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge692")
private external fun kniBridge692(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge693")
private external fun kniBridge693(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge694")
private external fun kniBridge694(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge695")
private external fun kniBridge695(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge696")
private external fun kniBridge696(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge697")
private external fun kniBridge697(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge698")
private external fun kniBridge698(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge699")
private external fun kniBridge699(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge700")
private external fun kniBridge700(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge701")
private external fun kniBridge701(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge702")
private external fun kniBridge702(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge703")
private external fun kniBridge703(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge704")
private external fun kniBridge704(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge705")
private external fun kniBridge705(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge706")
private external fun kniBridge706(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge707")
private external fun kniBridge707(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("godotapi_kniBridge708")
private external fun kniBridge708(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge709")
private external fun kniBridge709(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge710")
private external fun kniBridge710(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge711")
private external fun kniBridge711(p0: Int): NativePtr
@SymbolName("godotapi_kniBridge712")
private external fun kniBridge712(p0: NativePtr, p1: Int): NativePtr
@SymbolName("godotapi_kniBridge713")
private external fun kniBridge713(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge714")
private external fun kniBridge714(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Unit
@SymbolName("godotapi_kniBridge715")
private external fun kniBridge715(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int): Unit
@SymbolName("godotapi_kniBridge716")
private external fun kniBridge716(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge717")
private external fun kniBridge717(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge718")
private external fun kniBridge718(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge719")
private external fun kniBridge719(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge720")
private external fun kniBridge720(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge721")
private external fun kniBridge721(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge722")
private external fun kniBridge722(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge723")
private external fun kniBridge723(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge724")
private external fun kniBridge724(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge725")
private external fun kniBridge725(p0: NativePtr): Byte
@SymbolName("godotapi_kniBridge726")
private external fun kniBridge726(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge727")
private external fun kniBridge727(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge728")
private external fun kniBridge728(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge729")
private external fun kniBridge729(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge730")
private external fun kniBridge730(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge731")
private external fun kniBridge731(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@SymbolName("godotapi_kniBridge732")
private external fun kniBridge732(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge733")
private external fun kniBridge733(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge734")
private external fun kniBridge734(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge735")
private external fun kniBridge735(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge736")
private external fun kniBridge736(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge737")
private external fun kniBridge737(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("godotapi_kniBridge738")
private external fun kniBridge738(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge739")
private external fun kniBridge739(p0: NativePtr): Float
@SymbolName("godotapi_kniBridge740")
private external fun kniBridge740(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge741")
private external fun kniBridge741(p0: NativePtr, p1: Float, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge742")
private external fun kniBridge742(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge743")
private external fun kniBridge743(p0: NativePtr, p1: NativePtr): Byte
@SymbolName("godotapi_kniBridge744")
private external fun kniBridge744(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge745")
private external fun kniBridge745(): Float
@SymbolName("godotapi_kniBridge746")
private external fun kniBridge746(p0: NativePtr): Unit
@SymbolName("godotapi_kniBridge747")
private external fun kniBridge747(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge748")
private external fun kniBridge748(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge749")
private external fun kniBridge749(p0: NativePtr, p1: Int, p2: Byte, p3: Byte): Int
@SymbolName("godotapi_kniBridge750")
private external fun kniBridge750(p0: Int): Unit
@SymbolName("godotapi_kniBridge751")
private external fun kniBridge751(p0: Int, p1: NativePtr, p2: Byte, p3: Byte): Unit
@SymbolName("godotapi_kniBridge752")
private external fun kniBridge752(p0: Int, p1: Int, p2: Byte): Unit
@SymbolName("godotapi_kniBridge753")
private external fun kniBridge753(p0: Int, p1: Int, p2: Float, p3: Byte): Unit
@SymbolName("godotapi_kniBridge754")
private external fun kniBridge754(p0: Int): Float
@SymbolName("godotapi_kniBridge755")
private external fun kniBridge755(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("godotapi_kniBridge756")
private external fun kniBridge756(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("godotapi_kniBridge757")
private external fun kniBridge757(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("godotapi_kniBridge758")
private external fun kniBridge758(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("godotapi_kniBridge759")
private external fun kniBridge759(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge760")
private external fun kniBridge760(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge761")
private external fun kniBridge761(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Int, p4: NativePtr): Unit
@SymbolName("godotapi_kniBridge762")
private external fun kniBridge762(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge763")
private external fun kniBridge763(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge764")
private external fun kniBridge764(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge765")
private external fun kniBridge765(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("godotapi_kniBridge766")
private external fun kniBridge766(p0: Int, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge767")
private external fun kniBridge767(p0: Int, p1: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge768")
private external fun kniBridge768(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("godotapi_kniBridge769")
private external fun kniBridge769(p0: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge770")
private external fun kniBridge770(p0: NativePtr): Int
@SymbolName("godotapi_kniBridge771")
private external fun kniBridge771(p0: Int): Unit
@SymbolName("godotapi_kniBridge772")
private external fun kniBridge772(p0: Int, p1: NativePtr): NativePtr
@SymbolName("godotapi_kniBridge773")
private external fun kniBridge773(p0: NativePtr): Unit
