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
        assertEquals(qr.matrix.size, qr.matrix.first().size)
        assert(qr.matrix.isNotEmpty())
    }
}