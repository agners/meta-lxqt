DESCRIPTION = "LXQt about dialog"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools qtscript liblxqt lxqt-globalkeys"
RDEPENDS_${PN} = "qtbase-plugins"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "f68f8b9876bc825a2f5c9d6e9621211a"
SRC_URI[sha256sum] = "7d9d4d85acb2a9e17892ca41637a677939ef7788df5cd45ba44d178ac066439a"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
