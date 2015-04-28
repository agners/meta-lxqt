DESCRIPTION = "LXQt panel"

include lxqt.inc

PR = "r0"

DEPENDS += "lxqt-common lxqt-globalkeys liblxqt-mount"
RDEPENDS_${PN} += "kwindowsystem kguiaddons libxcomposite lxmenu-data menu-cache"

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
