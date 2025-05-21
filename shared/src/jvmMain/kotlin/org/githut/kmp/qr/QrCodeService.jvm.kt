package org.githut.kmp.qr

import io.github.g0dkar.qrcode.QRCode

/**
 * JVM implementation of [QrCodeService] that delegates QR code generation to
 * the qrcode-kotlin library while returning the logical matrix expected by the shared
 * code.
 */
actual class QrCodeService {
    actual fun generate(data: String): LogicQrCode = generateWithLibrary(data)
}
