SUMMARY = "Sample yocto helloworld"
LICENSE = "CLOSED"

SRC_URI = "file://helloWorld.c"

do_compile() {
        ${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/helloWorld.c -o helloWorld
}
