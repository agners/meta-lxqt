do_compile_append() {
     # By default, the utilities running on the build host point to /usr/bin/qt5/...
     sed -i 's:/usr/bin:${STAGING_BINDIR_NATIVE}:g' ${B}/lib/cmake/Qt5LinguistTools/Qt5LinguistToolsConfig.cmake
}

