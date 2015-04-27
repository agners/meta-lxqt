DESCRIPTION = "LXQt system configuration"

include lxqt.inc

PR = "r0"

RDEPENDS_${PN} = "libqtxdg"

SRC_URI[md5sum] = "af485d58ed9aa78e46bb76db5c51eb9a"
SRC_URI[sha256sum] = "9d6b0d21846ac5d9c62c5806ce04383b92708ab7bd095b46d0ac9fbb3f84b913"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN}-dev = ""
FILES_${PN} += " \
    ${datadir}/lxqt \
    ${libdir}/liblxqt-config-cursor.so \
"
