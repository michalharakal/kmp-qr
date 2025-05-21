package org.githut.kmp.qr

import qrcode.QRCodeBuilder
import qrcode.QRCodeShapesEnum
import qrcode.raw.ErrorCorrectionLevel
import qrcode.render.QRCodeGraphicsFactory

class QRCodeService {
    fun qrCode(
        data: String,
        spacing: Int? = null,
        shape: QRCodeShapesEnum = QRCodeShapesEnum.SQUARE,
        ecl: ErrorCorrectionLevel = ErrorCorrectionLevel.MEDIUM,
        informationDensity: Int = 0,
    ): ByteArray =
        QRCodeBuilder(shape)
            .withErrorCorrectionLevel(ecl)
            .withGraphicsFactory(QRCodeGraphicsFactory())
            .withInformationDensity(informationDensity)
            .also {
                if (spacing != null && spacing >= 0) {
                    it.withInnerSpacing(spacing)
                }
            }
            .build(data)
            .render()
            .getBytes()
}