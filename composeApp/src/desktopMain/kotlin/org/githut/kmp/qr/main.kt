package org.githut.kmp.qr

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "QR-Generator",
    ) {
        App()
    }
}