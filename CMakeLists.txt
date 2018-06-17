cmake_minimum_required(VERSION 3.8)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(godot-kotlin Kotlin)

#konanc_library_search(SDL2 SDL2/SDL.h)

#if (APPLE)
#    set(SDL2_LINKER_OPTS "-F /Library/Frameworks -framework SDL2")
#    set(KOTRIX_TARGET macbook)
#elseif (UNIX)
#    set(SDL2_LINKER_OPTS "-L${SDL2_LIBRARY_DIR} -lSDL2")
#    set(KOTRIX_TARGET linux)
#else ()
#    message(FATAL_ERROR Windows is not supported.)
#endif ()

cinterop(
        NAME godotapi
        TARGET ${GODOT_TARGET}
        DEF_FILE src/main/c_interop/godotapi.def
        COMPILER_OPTS "-I ${GODOTAPI_INCLUDE_DIR}"
)

#konanc_executable(
#        NAME godot
#        TARGET ${GODOT_TARGET}
#        SOURCES src/main/kotlin/
#        LIBRARIES godotapi
#        LINKER_OPTS "${GODOTAPI_LINKER_OPTS}"
#)

#add_custom_command(TARGET godot.kexe
#        PRE_BUILD
#        COMMAND ${CMAKE_COMMAND} -E copy_directory ${CMAKE_SOURCE_DIR}/src/main/resources ${CMAKE_CURRENT_BINARY_DIR})

