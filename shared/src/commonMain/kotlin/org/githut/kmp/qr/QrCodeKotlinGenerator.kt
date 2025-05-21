package org.githut.kmp.qr

import io.github.g0dkar.qrcode.QRCode

internal fun generateWithLibrary(data: String): LogicQrCode {
    val qr = QRCode(data)
    val matrix = qr.matrix
    val result = List(matrix.size) { y ->
        List(matrix[y].size) { x -> matrix[y][x] != 0 }
    }
    return LogicQrCode(result)
}
