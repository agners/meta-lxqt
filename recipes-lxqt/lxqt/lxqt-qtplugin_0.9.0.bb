DESCRIPTION = "LXQt platform integration for Qt"

include lxqt.inc

PR = "r0"

SRC_URI[md5sum] = "91220a62607ea42a439bd56c23e7303d"
SRC_URI[sha256sum] = "7bc715d55ccf7b4356dc89b23f441b79b2a79a523efdb67bc4a81acaa86243c5"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"
