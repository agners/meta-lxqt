DESCRIPTION = "LXQt system configuration"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools liblxqt"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "af485d58ed9aa78e46bb76db5c51eb9a"
SRC_URI[sha256sum] = "9d6b0d21846ac5d9c62c5806ce04383b92708ab7bd095b46d0ac9fbb3f84b913"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
