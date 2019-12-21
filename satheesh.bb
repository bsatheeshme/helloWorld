SUMMARY = "SKY MDM layer library implementing the TR104 DM"
LICENSE = "CLOSED"

#SRC_URI = "git://github.com/sinjoysaha/simple-c-programs;branch=master"
SRC_URI = "git://github.com/bsatheeshme/helloWorld;branch=master"

#SRC_URI[md5sum] = "e84253165718b5e9b28b79ecf6258d5c"
#SRC_URI[sha256sum] = "66eb11a646f460938d70149f3447debb29d8384ff56ca0240167eff083f95234"

SRCREV = "a54193f66b3297151aca0d5dc9eceae9b82f1d49"   
# latest commit ID
S = "${WORKDIR}/git"

LDFLAGS += " -L ${STAGING_LIBDIR} "

#do_listtasks () {
#echo "=======BSK==================="
#echo ${AUTOREV}
#echo SRCREV=${SRCREV}
#echo DEPENDS=${DEPENDS}
#echo SRC_URI=${SRC_URI}
#echo PV=${PV}
#echo S=${S}
#echo LDFLAGS=${LDFLAGS}
#echo STAGING_INCDIR=${STAGING_INCDIR}
#echo "=======BSK-==================="
#}


