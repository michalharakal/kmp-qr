package org.githut.kmp.qr

import kotlin.test.Test
import kotlin.test.assertEquals

class SharedCommonTest {

    @Test
    fun example() {
        assertEquals(3, 1 + 2)
    }

    @Test
    fun qrCodeGeneration_size() {
        val qr = QrCodeService().generate("test")
        assertEquals(SIMPLE_QR_SIZE, qr.matrix.size)
        assertEquals(SIMPLE_QR_SIZE, qr.matrix.first().size)
    }
}