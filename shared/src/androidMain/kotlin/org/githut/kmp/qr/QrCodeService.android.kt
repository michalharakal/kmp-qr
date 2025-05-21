package org.githut.kmp.qr

actual class QrCodeService {
    actual fun generate(data: String): List<List<Boolean>> = generateSimpleMatrix(data)
}
