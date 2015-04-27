DESCRIPTION = "LXQt about dialog"

include lxqt.inc

PR = "r0"

DEPENDS += "qtscript lxqt-globalkeys"
RDEPENDS_${PN} = "qtbase-plugins kwindowsystem menu-cache"

SRC_URI[md5sum] = "f68f8b9876bc825a2f5c9d6e9621211a"
SRC_URI[sha256sum] = "7d9d4d85acb2a9e17892ca41637a677939ef7788df5cd45ba44d178ac066439a"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
