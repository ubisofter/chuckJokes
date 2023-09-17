package app.devuniverse.chuck

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UnsplashService {
    private const val BASE_URL = "https://api.unsplash.com/"
    private const val ACCESS_KEY = "F86C022v--5KIke3m32I_LDS_zdKz2IW7sB1mdNjECY" // Замените на ваш API ключ Unsplash

    fun create(): UnsplashApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(createOkHttpClient())
            .build()
        return retrofit.create(UnsplashApi::class.java)
    }

    private fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .addHeader("Authorization", "Client-ID $ACCESS_KEY")
                    .build()
                chain.proceed(request)
            }
            .build()
    }
}