DESCRIPTION = "Core utility library for all LXQt components"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

inherit qmake5 cmake_qt5 cmake_kf5

DEPENDS = "qtbase qtx11extras qttools qttools-native libqtxdg kwindowsystem extra-cmake-modules"

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz \
	file://0001-liblxqt-remove-dupplicated-usr-definition.patch \
	file://0002-liblxqt-get-root-directory-from-CMAKE_CURRENT_LIST_D.patch \
"

SRC_URI[md5sum] = "b027c6114d543e24a35846d37d374009"
SRC_URI[sha256sum] = "b4f0941bcb8839163aed5c332a26d05650a8d75be241cb39c702f9bd15fe4d52"

EXTRA_OECMAKE += " \
    -DLXQT_ETC_XDG_DIR=${sysconfdir} \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
FILES_${PN}-dev += "${datadir}/cmake"
