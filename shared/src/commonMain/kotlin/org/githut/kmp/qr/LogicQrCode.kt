package org.githut.kmp.qr

/**
 * Represents the logical QR code matrix where `true` denotes a black pixel
 * and `false` denotes a white pixel.
 */
data class LogicQrCode(val matrix: List<List<Boolean>>)
