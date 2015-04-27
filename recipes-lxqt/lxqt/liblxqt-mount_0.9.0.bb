DESCRIPTION = "LXQt library used to manage removable devices"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

inherit qmake5 cmake_qt5

DEPENDS = "qtbase qttools qttools-native"

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz \
	file://0001-lxqt-mount-get-root-directory-from-CMAKE_CURRENT_LIS.patch \
"

SRC_URI[md5sum] = "476d91d6680f63b0dd7ab445120b9e20"
SRC_URI[sha256sum] = "c89ddce16a67831bf8975bc40f95729cb5069105b969f2c8abfb8ab0116dbf5d"

FILES_${PN}-dev += "${libdir}/cmake"
