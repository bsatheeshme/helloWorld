#cmake_minimum_required(VERSION 3.6)
project(satheesh)
find_package(PkgConfig REQUIRED)
set(HELLOWORLD_SOURCE_FILE helloWorld.c)

add_executable(satheesh ${HELLOWORLD_SOURCE_FILE})
#set_target_properties(satheesh PROPERTIES SOVERSION 1 VERSION 1.0.0 )
#target_compile_options(satheesh PRIVATE -Wall -Wno-unused-function -Werror -fpic )
#target_include_directories(satheesh PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
#target_link_libraries(satheesh "-lpthread")

install(TARGETS satheesh
   RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR})
