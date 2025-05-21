package com.example.qr

import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import java.nio.file.Paths

actual class QrCodeGenerator {
    actual fun generateQrCode(url: String, filename: String) {
        val qrCodeWriter = QRCodeWriter()
        val bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 300, 300)
        val path = Paths.get(filename)
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path)
        println("QR code for $url has been saved as $filename")
    }
}
