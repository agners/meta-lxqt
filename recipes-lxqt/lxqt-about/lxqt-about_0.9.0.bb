DESCRIPTION = "LXQt about dialog"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools liblxqt"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "8a9ea5b780101b071911a84bb258675d"
SRC_URI[sha256sum] = "6965eb5eba8acbd97cebd708da12f2aa8bbb3cf2c3fa211b5c00cc45fc48bf77"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"
