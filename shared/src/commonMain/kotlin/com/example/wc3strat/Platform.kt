package com.example.wc3strat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform