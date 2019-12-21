cmake_minimum_required(VERSION 3.6)
set(HELLOWORLD_SOURCE_FILE helloWorld.c)

add_library(satheesh SHARED ${HELLOWORLD_SOURCE_FILE})
#set_target_properties(mdm_layer PROPERTIES SOVERSION 1 VERSION 1.0.0 PUBLIC_HEADER "mdm_layer.h")
#target_compile_options(mdm_layer PRIVATE -Wall -Wno-unused-function -Werror -DSKY_RDKB -fpic -DDMP_TAENDPOINT_1 -DDMP_ENDPOINT_1 -DDMP_X_BROADCOM_COM_PSTNENDPOINT_1 -DDMP_SIPENDPOINT_1 -DDMP_VOICE_SERVICE_1 -DDMP_X_ITU_ORG_VOICE_SIP_1 -DDMP_X_BROADCOM_COM_BASELINE_SKY_1 -DDMP_X_BROADCOM_COM_IPV6_1)
#target_include_directories(mdm_layer PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
#target_link_libraries(mdm_layer "-lmsgpackc")
#export(TARGETS mdm_layer FILE mdm_layer.cmake)

install(TARGETS mdm_layer
    DESTINATION ${CMAKE_INSTALL_LIBDIR})
