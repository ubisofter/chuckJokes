package app.devuniverse.chuck

data class UnsplashResponse(
    val total: Int,
    val totalPages: Int,
    val results: List<UnsplashPhoto>
)

data class UnsplashPhoto(
    val id: String,
    val urls: UnsplashUrls
)

data class UnsplashUrls(
    val small: String,
    val regular: String
)
