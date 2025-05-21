package org.githut.kmp.qr

/**
 * Simple service for generating QR code data from a string.
 * The resulting matrix contains `true` for a black pixel and `false` for a white pixel.
 */
expect class QrCodeService() {
    fun generate(data: String): List<List<Boolean>>
}
