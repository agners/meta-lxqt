SECTION = "x11/lxqt"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

DEPENDS = "qtbase qtx11extras qttools liblxqt"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"
