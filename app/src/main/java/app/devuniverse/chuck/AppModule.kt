package app.devuniverse.chuck

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(AppComponent::class)
class AppModule {

    @Provides
    fun provideChuckNorrisApi(): ChuckNorrisApi {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.chucknorris.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ChuckNorrisApi::class.java)
    }

    @Provides
    fun provideUnsplashApi(): UnsplashApi {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.unsplash.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(UnsplashApi::class.java)
    }

    @Provides
    fun provideChuckNorrisRepository(api: ChuckNorrisApi): ChuckNorrisRepository {
        return ChuckNorrisRepositoryImpl(api)
    }
}