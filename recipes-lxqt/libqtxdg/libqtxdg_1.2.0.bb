DESCRIPTION = "An Qt implementation of freedesktop.org xdg specifications"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

inherit cmake_qt5

DEPENDS = "qtbase"

SRC_URI = "http://downloads.lxqt.org/libqtxdg/${PV}/libqtxdg-${PV}.tar.xz \
	file://0001-libqtxdg-remove-dupplicated-usr-definition.patch \
	file://0001-libqtxdg-get-root-directory-from-CMAKE_CURRENT_LIST_.patch \
"

SRC_URI[md5sum] = "3e92e224da807710862a0a94fad14dcd"
SRC_URI[sha256sum] = "88c9b01b56fea205226b53642833963e4f27471de3b90e93e9b650ca28d098d9"

EXTRA_OECMAKE += " \
    -DUSE_QT5=true \
"

FILES_${PN}-dev += "${datadir}/cmake"
