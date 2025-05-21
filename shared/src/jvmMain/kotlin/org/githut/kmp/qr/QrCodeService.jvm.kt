package org.githut.kmp.qr

import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter

/**
 * JVM implementation of [QrCodeService] that delegates QR code generation to
 * the ZXing library while returning the logical matrix expected by the shared
 * code.
 */
actual class QrCodeService {
    actual fun generate(data: String): LogicQrCode {
        val writer = QRCodeWriter()
        val matrix = writer.encode(data, BarcodeFormat.QR_CODE, SIMPLE_QR_SIZE, SIMPLE_QR_SIZE)
        val result = List(matrix.height) { y ->
            List(matrix.width) { x -> matrix.get(x, y) }
        }
        return LogicQrCode(result)
    }
}
