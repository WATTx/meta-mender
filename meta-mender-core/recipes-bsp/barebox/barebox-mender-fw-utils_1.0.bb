FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89aea4e17d99a7cacdbeed46a0096b10"
S = "${WORKDIR}"

SRC_URI += " \
             file://LICENSE \
             file://fw_printenv \
            "

do_install() {
    set -x

    mkdir -p ${D}/${bindir}
    install -m 755 ${WORKDIR}/fw_printenv ${D}/${bindir}/fw_printenv
    ln -fs fw_printenv ${D}/${bindir}/fw_setenv
}
