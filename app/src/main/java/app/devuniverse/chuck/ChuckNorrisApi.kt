package app.devuniverse.chuck

import retrofit2.http.GET

interface ChuckNorrisApi {
    @GET("jokes/random")
    suspend fun getRandomChuckNorrisJoke(): ChuckNorrisJoke
}
