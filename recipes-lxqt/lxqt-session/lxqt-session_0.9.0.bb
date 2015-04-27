DESCRIPTION = "LXQt session"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qttools liblxqt lxqt-common libxcb"
RDEPENDS_${PN} = "qtbase-plugins lxqt-common"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "92fca1504bcd61d0c8a761ba3748e81f"
SRC_URI[sha256sum] = "c543ffb938e230c144399b59c99c53ee69fd0b37ff404a02576ce1179a551d06"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
