package org.githut.kmp.qr

import java.io.FileOutputStream

/**
 * Example application that generates a QR code PNG using [QrGenerator].
 */
object QrExample {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size != 2) {
            System.err.println("Usage: QrExample <data> <output file>")
            return
        }
        val data = args[0]
        val output = args[1]
        FileOutputStream(output).use { fos ->
            QrGenerator.writeQrToStream(data, 300, fos)
        }
        println("QR code written to $output")
    }
}
