package org.nhta.nhta_kmp1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform