package org.githut.kmp.qr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform