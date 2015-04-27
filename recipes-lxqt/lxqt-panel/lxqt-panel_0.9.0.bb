DESCRIPTION = "LXQt panel"
SECTION = "x11"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"
PR = "r0"

DEPENDS = "qtbase qtx11extras qttools liblxqt lxqt-common lxqt-globalkeys \
           liblxqt-mount"

inherit cmake_qt5

SRC_URI = "http://downloads.lxqt.org/lxqt/${PV}/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "cdae5a811c68fe8162230f1e9ef765f2"
SRC_URI[sha256sum] = "96b2c2f1b7de7605ac79f094936e6fcf8f0034342e11d84624a033f2450f6bf1"

EXTRA_OECMAKE += " \
    -DCPULOAD_PLUGIN=false \
    -DKBINDICATOR_PLUGIN=false \
    -DSENSORS_PLUGIN=false \
    -DNETWORKMONITOR_PLUGIN=false \
    -DSYSSTAT_PLUGIN=false \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
