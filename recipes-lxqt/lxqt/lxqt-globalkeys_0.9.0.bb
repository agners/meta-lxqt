DESCRIPTION = "LXQt about dialog"

include lxqt.inc

PR = "r0"

SRC_URI += "file://0001-lxqt_globalkeys-get-root-directory-from-CMAKE_CURREN.patch"

SRC_URI[md5sum] = "f7e0de7cac2379a7dd7af7fd97e9138c"
SRC_URI[sha256sum] = "45292e125e8cc2f18afa7d358366ade670c8d73871caf04f4536a4be985d9f12"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
FILES_${PN}-dev += "${libdir}/cmake"
