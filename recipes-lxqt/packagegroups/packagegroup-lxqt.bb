DESCRIPTION = "LXQt desktop packages"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = " \
    lxqt-about \
    lxqt-config \
    lxqt-panel \
    lxqt-qtplugin \
    lxqt-runner \
    lxqt-session \
    qtbase \
    qtbase-plugins \
    xdg-utils \
"
