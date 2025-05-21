package org.githut.kmp.qr

internal const val SIMPLE_QR_SIZE = 21

internal fun generateSimpleMatrix(data: String): LogicQrCode {
    val bytes = data.encodeToByteArray()
    val result = MutableList(SIMPLE_QR_SIZE) { MutableList(SIMPLE_QR_SIZE) { false } }
    var bitIndex = 0
    for (byte in bytes) {
        for (i in 0 until 8) {
            if (bitIndex >= SIMPLE_QR_SIZE * SIMPLE_QR_SIZE) break
            val row = bitIndex / SIMPLE_QR_SIZE
            val col = bitIndex % SIMPLE_QR_SIZE
            val bit = ((byte.toInt() shr i) and 1) == 1
            result[row][col] = bit
            bitIndex++
        }
        if (bitIndex >= SIMPLE_QR_SIZE * SIMPLE_QR_SIZE) break
    }
    return LogicQrCode(result)
}
