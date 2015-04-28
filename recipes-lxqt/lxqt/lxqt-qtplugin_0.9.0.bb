DESCRIPTION = "LXQt system integration plugin for Qt"

include lxqt.inc

SRC_URI += "file://0001-qt-plugins-get-Qt-plugin-path-from-OE-environment-va.patch"

PR = "r0"

SRC_URI[md5sum] = "91220a62607ea42a439bd56c23e7303d"
SRC_URI[sha256sum] = "7bc715d55ccf7b4356dc89b23f441b79b2a79a523efdb67bc4a81acaa86243c5"

EXTRA_OECMAKE += " \
    -DOE_KF5_PATH_HOST_ROOT=${STAGING_DIR_HOST} \
"

FILES_${PN} = "${OE_QMAKE_PATH_PLUGINS}/platformthemes/libqtlxqt.so"
FILES_${PN}-dbg = " \
    ${OE_QMAKE_PATH_PLUGINS}/platformthemes/.debug/libqtlxqt.so \
    ${prefix}/src \
"
