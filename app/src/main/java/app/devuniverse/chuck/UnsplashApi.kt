package app.devuniverse.chuck

import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApi {
    @GET("/search/photos")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("per_page") perPage: Int = 1
    ): UnsplashResponse
}