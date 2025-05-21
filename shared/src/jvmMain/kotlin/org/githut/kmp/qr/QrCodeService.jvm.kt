package org.githut.kmp.qr

import java.net.URL

actual class QrCodeService {
    actual fun generate(data: String): LogicQrCode {
        val url = URL(data)
        return generateSimpleMatrix(url.toExternalForm())
    }
}
