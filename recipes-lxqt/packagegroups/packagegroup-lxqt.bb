DESCRIPTION = "LXQt desktop packages"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = " \
    lxqt-panel \
    lxqt-session \
    lxqt-about \
    lxqt-runner \
    qtbase \
    qtbase-plugins \
    xdg-utils \
"
