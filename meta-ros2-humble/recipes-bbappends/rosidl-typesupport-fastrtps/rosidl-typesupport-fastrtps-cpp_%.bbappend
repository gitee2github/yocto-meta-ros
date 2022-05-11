# Copyright (c) 2019-2021 LG Electronics, Inc.
# Copyright (c) 2022 Acceleration Robotics, S.L.

ROS_BUILD_DEPENDS += " \
    fastcdr \
"

# Deal with CMake Error while building recipe
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://0001-Deal-with-CMake-Error-while-building-recipe.patch \
"

# ERROR: do_package: QA Issue: rosidl-adapter: Files/directories were installed but not shipped in any package
#
# NOTE: Can't use ${PN} in the additions below because of the "-" and "_" conflict (recipes and package names differ in this regard)
#
FILES:${PN} = " \
    ${STAGING_DIR_NATIVE}${libdir}/python3.9/site-packages/rosidl_typesupport_fastrtps_cpp \
    ${STAGING_DIR_NATIVE}${libdir}/python3.9/site-packages/rosidl_typesupport_fastrtps_cpp-2.2.0-py3.9.egg-info \
"

# QA Issue: rosidl-typesupport-fastrtps-cpp: Files/directories were installed but not shipped in any package:
#   /usr/lib/librosidl_typesupport_fastrtps_cpp.so
FILES:${PN} += "${libdir}/lib*${SOLIBSDEV}"