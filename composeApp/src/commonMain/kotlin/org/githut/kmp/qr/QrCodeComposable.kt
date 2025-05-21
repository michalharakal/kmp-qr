package org.githut.kmp.qr

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.skia.Image
import qrcode.QRCodeShapesEnum
import qrcode.raw.ErrorCorrectionLevel

@Composable
fun QRCode(
    data: String,
    size: Dp = 200.dp,
    spacing: Int? = null,
    shape: QRCodeShapesEnum = QRCodeShapesEnum.SQUARE,
    errorCorrectionLevel: ErrorCorrectionLevel = ErrorCorrectionLevel.MEDIUM,
    informationDensity: Int = 0
) {
    val density = LocalDensity.current
    //val qrCodeService = QRCodeService()

    // Generate QR code bytes
    val qrCodeBytes = QRCodeService().qrCode(
        data = data,
        spacing = spacing,
        shape = shape,
        ecl = errorCorrectionLevel,
        informationDensity = informationDensity
    )

    // Convert bytes to ImageBitmap for Compose
    val imageBitmap = Image.makeFromEncoded(qrCodeBytes).asImageBitmap()

    // Render the QR code as an Image
    androidx.compose.foundation.Image(
        bitmap = imageBitmap,
        contentDescription = "QR Code for $data",
        modifier = androidx.compose.ui.Modifier.size(size)
    )
}