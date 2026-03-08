package concerrox.valley

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform