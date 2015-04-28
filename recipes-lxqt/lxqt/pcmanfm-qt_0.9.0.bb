DESCRIPTION = "LXQt about dialog"

include lxqt.inc

LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS += "libfm"
RDEPENDS_${PN} += "lxmenu-data"

PR = "r0"

SRC_URI[md5sum] = "b0ce100b4380ad1a47926a3465aeb6e9"
SRC_URI[sha256sum] = "2df0f0a0c092f9ee6e7311255ab2aed66c8ea897b3399affb96732c46421e2df"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} += "${datadir}/libfm-qt"
