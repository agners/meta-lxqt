DESCRIPTION = "LXQt session"

include lxqt.inc

PR = "r0"

DEPENDS += "lxqt-common libxcb"
RDEPENDS_${PN} = "qtbase-plugins lxqt-common kwindowsystem libxkbcommon"

SRC_URI[md5sum] = "92fca1504bcd61d0c8a761ba3748e81f"
SRC_URI[sha256sum] = "c543ffb938e230c144399b59c99c53ee69fd0b37ff404a02576ce1179a551d06"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/lxqt"
