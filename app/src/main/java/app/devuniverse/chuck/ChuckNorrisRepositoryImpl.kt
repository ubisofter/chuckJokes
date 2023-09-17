package app.devuniverse.chuck

class ChuckNorrisRepositoryImpl(private val chuckNorrisApi: ChuckNorrisApi) : ChuckNorrisRepository {
    override suspend fun getRandomChuckNorrisJoke(): ChuckNorrisJoke {
        return chuckNorrisApi.getRandomChuckNorrisJoke()
    }
}