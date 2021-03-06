SUMMARY = "OpenBMC org.openbmc.Flash example implementation"
DESCRIPTION = "A sample implementation for the org.openbmc.Flash DBUS API. \
org.openbmc.Flash provides APIs for functions like BIOS flash access control \
and updating."
PR = "r1"

inherit skeleton-gdbus
inherit obmc-phosphor-dbus-service

RDEPENDS_${PN} += "mtd-utils-ubifs"

SKELETON_DIR = "flashbios"
DBUS_SERVICE_${PN} += "org.openbmc.control.Flash.service"
SYSTEMD_SERVICE_${PN} += "obmc-flash-init.service"
SYSTEMD_SERVICE_${PN} += "obmc-flash-bios-ubiattach.service"
SYSTEMD_SERVICE_${PN} += "obmc-flash-bios-ubimount@.service"
SYSTEMD_SERVICE_${PN} += "obmc-flash-bios-squashfsmount@.service"
