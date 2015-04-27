DESCRIPTION = "LXQt platform integration for Qt"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools liblxqt"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "91220a62607ea42a439bd56c23e7303d"
SRC_URI[sha256sum] = "7bc715d55ccf7b4356dc89b23f441b79b2a79a523efdb67bc4a81acaa86243c5"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"
