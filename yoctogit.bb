SUMMARY = "Simple Yocto github example"
LICENSE = "CLOSED"

SRC_URI = "git://github.com/bsatheeshme/helloWorld;branch=master"

# latest commit ID
SRCREV = "{AUTOREV}"

S = "${WORKDIR}/git"

#use cmake to compile/package
inherit cmake
