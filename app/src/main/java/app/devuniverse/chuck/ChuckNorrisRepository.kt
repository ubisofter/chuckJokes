package app.devuniverse.chuck

interface ChuckNorrisRepository {
    suspend fun getRandomChuckNorrisJoke(): ChuckNorrisJoke
}