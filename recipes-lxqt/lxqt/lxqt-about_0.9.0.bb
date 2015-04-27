DESCRIPTION = "LXQt about dialog"

include lxqt.inc

PR = "r0"

SRC_URI[md5sum] = "8a9ea5b780101b071911a84bb258675d"
SRC_URI[sha256sum] = "6965eb5eba8acbd97cebd708da12f2aa8bbb3cf2c3fa211b5c00cc45fc48bf77"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
