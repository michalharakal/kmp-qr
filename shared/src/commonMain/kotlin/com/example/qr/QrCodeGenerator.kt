package com.example.qr

/**
 * Generates QR codes from URLs and saves them as image files.
 */
expect class QrCodeGenerator() {
    /**
     * Generate a QR code for a given URL and save it as an image file.
     *
     * @param url The URL to encode into the QR code
     * @param filename The filename to save the QR code image (e.g., "qrcode.png")
     */
    fun generateQrCode(url: String, filename: String = "qrcode.png")
}
