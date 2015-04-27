DESCRIPTION = "Common files for LXQt"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools liblxqt"
RDEPENDS_${PN} = "qtbase-plugins qtbase-fonts"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "7db547d46c4e4e5efb6b3ee8e4a90ad9"
SRC_URI[sha256sum] = "6e572cb10a1619dcfd51bdd33802a71d4556a55ece0bc781c1cb41d972e5734d"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += " \
    ${datadir}/apps \
    ${datadir}/desktop-directories \
    ${datadir}/icons \
    ${datadir}/xsessions \
"
FILES_${PN} += "${datadir}/lxqt"
