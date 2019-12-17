# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "marti_nav_msgs"
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://github.com/swri-robotics/marti_messages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_messages"
ROS_BPN = "marti_nav_msgs"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    geographic-msgs \
    geometry-msgs \
    marti-common-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    geographic-msgs \
    geometry-msgs \
    marti-common-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    geographic-msgs \
    geometry-msgs \
    marti-common-msgs \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/dashing/marti_nav_msgs/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/marti_nav_msgs"
SRC_URI = "git://github.com/swri-robotics-gbp/marti_messages-release;${ROS_BRANCH};protocol=https"
SRCREV = "9595cfd2bacc8a6d46ed61bfd2c9605a2e33744d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
