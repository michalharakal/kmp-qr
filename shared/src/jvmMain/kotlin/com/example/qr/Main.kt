package com.example.qr

fun main(args: Array<String>) {
    if (args.isEmpty() || args.size > 2) {
        println("Usage: ./gradlew :shared:run --args=\"<url> [filename]\"")
        println("Example: ./gradlew :shared:run --args=\"https://example.com qrcode.png\"")
        return
    }

    val url = args[0]
    val filename = args.getOrNull(1) ?: "qrcode.png"

    try {
        QrCodeGenerator().generateQrCode(url, filename)
    } catch (e: Exception) {
        println("Error generating QR code: ${e.message}")
        e.printStackTrace()
    }
}
