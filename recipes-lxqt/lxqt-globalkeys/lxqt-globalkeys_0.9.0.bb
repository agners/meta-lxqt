DESCRIPTION = "LXQt about dialog"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools liblxqt"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz \
	file://0001-lxqt_globalkeys-get-root-directory-from-CMAKE_CURREN.patch \
"

SRC_URI[md5sum] = "f7e0de7cac2379a7dd7af7fd97e9138c"
SRC_URI[sha256sum] = "45292e125e8cc2f18afa7d358366ade670c8d73871caf04f4536a4be985d9f12"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
FILES_${PN}-dev += "${libdir}/cmake"
