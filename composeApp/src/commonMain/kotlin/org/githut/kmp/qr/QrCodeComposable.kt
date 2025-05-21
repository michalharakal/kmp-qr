package org.githut.kmp.qr

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Draws the given [LogicQrCode] matrix on a Canvas.
 */
@Composable
fun QrCodeImage(qr: LogicQrCode, modifier: Modifier = Modifier, pixelSize: Dp = 8.dp) {
    val sizeDp = pixelSize * qr.matrix.size
    Canvas(modifier = modifier.size(sizeDp)) {
        val scale = size.width / qr.matrix.size
        for (y in qr.matrix.indices) {
            for (x in qr.matrix[y].indices) {
                if (qr.matrix[y][x]) {
                    drawRect(
                        color = Color.Black,
                        topLeft = Offset(x * scale, y * scale),
                        size = Size(scale, scale)
                    )
                }
            }
        }
    }
}
