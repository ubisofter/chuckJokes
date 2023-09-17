package app.devuniverse.chuck

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import javax.inject.Inject

class JokeListViewModel @Inject constructor(private val repository: ChuckNorrisRepository, private val unsplashApi: UnsplashApi) : ViewModel() {

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _jokes = MutableLiveData<List<ChuckNorrisJokeWithImage>>()
    val jokes: LiveData<List<ChuckNorrisJokeWithImage>> get() = _jokes

    private suspend fun loadChuckNorrisJokeImage(query: String): String? {
        return try {
            val unsplashApi = UnsplashService.create()
            val response = unsplashApi.searchPhotos(query)

            if (response.results.isNotEmpty()) {
                response.results.first().urls.small
            } else {
                null
            }
        } catch (e: Exception) {
            null
        }
    }

    fun loadJokes() {
        viewModelScope.launch {
            try {
                // Устанавливаем состояние загрузки в true
                _isLoading.postValue(true)

                // Загружаем шутку и изображение
                val joke = repository.getRandomChuckNorrisJoke()
                val jokeTitle = generateTitleFromText(repository.getRandomChuckNorrisJoke().value).toString().replace("\"", "\\\"")
                val imageUrl = loadChuckNorrisJokeImage(joke.value)

                // Выводим список шуток и URL изображения в логи
                Log.d("JokeListViewModel", "Загружен список шуток: $joke")
                Log.d("JokeListViewModel", "URL изображения: $imageUrl")
                Log.d("JokeListViewModel", "Title шутки: $jokeTitle")

                // Создаем объект, который содержит как шутку, так и URL изображения
                val jokeWithImage = ChuckNorrisJokeWithImage(joke, imageUrl, jokeTitle)

                // Обновляем LiveData, чтобы передать как шутку, так и URL изображения
                _jokes.postValue(listOf(jokeWithImage))

                // Устанавливаем состояние загрузки в false
                _isLoading.postValue(false)
            } catch (e: Exception) {
                // Устанавливаем состояние загрузки в false в случае ошибки
                _isLoading.postValue(false)
                Log.e("JokeListViewModel", "Ошибка при загрузке шуток: ${e.message}")
            }
        }
    }

    suspend fun generateTitleFromText(text: String): String? {
        return try {
            withContext(Dispatchers.IO) {
                val client = OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    })
                    .build()

                val mediaType = "application/json".toMediaTypeOrNull()
                val requestBody = RequestBody.create(mediaType, "{\"text\": \"$text\", \"lang\": \"en\"}")

                val request = Request.Builder()
                    .url("https://article-extractor-and-summarizer.p.rapidapi.com/summarize-text")
                    .post(requestBody)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("X-RapidAPI-Key", "784b9e117amshe7aa789a6b8ff35p1fe9e9jsn376c57719cb8")
                    .addHeader("X-RapidAPI-Host", "article-extractor-and-summarizer.p.rapidapi.com")
                    .build()

                val response = client.newCall(request).execute()
                val responseBody = response.body?.string()

                // Разбор JSON-ответа
                val jsonObject = JSONObject(responseBody)
                val title = jsonObject.optString("summary")

                title
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null // Обработка ошибки и возврат null в случае ошибки
        }
    }

    fun loadMultipleJokes() {
        viewModelScope.launch {
            try {
                // Устанавливаем состояние загрузки в true
                _isLoading.postValue(true)

                val jokesWithImages = mutableListOf<ChuckNorrisJokeWithImage>()

                for (i in 1..5) { // Загрузка 5 шуток
                    val joke = repository.getRandomChuckNorrisJoke()
                    val jokeTitle = generateTitleFromText(joke.value)?.replace("\"", "\\\"") ?: ""
                    val imageUrl = loadChuckNorrisJokeImage(joke.value)

                    // Создаем объект, который содержит как шутку, так и URL изображения
                    val jokeWithImage = ChuckNorrisJokeWithImage(joke, imageUrl, jokeTitle)
                    jokesWithImages.add(jokeWithImage)

                    // Оповещаем о прогрессе загрузки
                    _jokes.postValue(jokesWithImages)

                    // Устанавливаем состояние загрузки в false, если все шутки загружены
                    if (i == 5) {
                        _isLoading.postValue(false)
                    }
                }
            } catch (e: Exception) {
                // Устанавливаем состояние загрузки в false в случае ошибки
                _isLoading.postValue(false)
                Log.e("JokeListViewModel", "Ошибка при загрузке шуток: ${e.message}")
            }
        }
    }

}

data class ChuckNorrisJokeWithImage(
    val joke: ChuckNorrisJoke,
    val imageUrl: String?,
    val jokeTitle: String?
)