package org.githut.kmp.qr

import io.github.g0dkar.qrcode.QRCode
import java.io.OutputStream

/**
 * Utility class for generating QR code PNGs using qrcode-kotlin.
 */
object QrGenerator {
    /**
     * Writes a QR code representing [text] to [output] with the given [size].
     */
    fun writeQrToStream(text: String, size: Int, output: OutputStream) {
        val qr = QRCode(text)
        // Render the QR code and write the PNG data to the stream
        qr.render().writeImage(output, scale = size)
    }
}
