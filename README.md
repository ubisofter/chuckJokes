<p align="center">
  <a href="https://n1s1.hsmedia.ru/b8/38/f0/b838f0f1c7a310e05dd3f888ffb46cc3/160x160_1_ee6e41234e8ca9f03664600c6c313751@785x785_0xac120004_9781560411681129191.jpeg">
    <img alt="Приложение Chuck Jokes" src="https://n1s1.hsmedia.ru/b8/38/f0/b838f0f1c7a310e05dd3f888ffb46cc3/160x160_1_ee6e41234e8ca9f03664600c6c313751@785x785_0xac120004_9781560411681129191.jpeg" width="60" />
  </a>
</p>
<h1 align="center">
  Приложение Chuck Jokes
</h1>

<p align="center">
<a href="https://github.com/ubisofter/chuckJokes/blob/master/LICENSE" target="blank">
<img src="https://img.shields.io/github/license/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes license" />
</a>
<a href="https://github.com/ubisofter/chuckJokes/fork" target="blank">
<img src="https://img.shields.io/github/forks/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes forks"/>
</a>
<a href="https://github.com/ubisofter/chuckJokes/stargazers" target="blank">
<img src="https://img.shields.io/github/stars/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes stars"/>
</a>
<a href="https://github.com/ubisofter/chuckJokes/issues" target="blank">
<img src="https://img.shields.io/github/issues/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes issues"/>
</a>
<a href="https://github.com/ubisofter/chuckJokes/pulls" target="blank">
<img src="https://img.shields.io/github/issues-pr/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes pull-requests"/>
</a>
</p>

<p align="center"><img src="https://github.com/ubisofter/chuckJokes/assets/78037558/bae51cf2-77d4-4ddb-be68-0a14f6fbfe7f" alt="chuckJokes gif" /></p>

<p align="center">
    <a href="https://github.com/ubisofter/chuckJokes/blob/main/chuck.apk" target="blank">View Demo</a>
    ·
    <a href="https://github.com/ubisofter/chuckJokes/issues/new/choose">Report Bug</a>
    ·
    <a href="https://github.com/ubisofter/chuckJokes/issues/new/choose">Request Feature</a>
</p>

APK: [Chuck Jokes](https://github.com/ubisofter/chuckJokes/blob/main/chuck.apk)

## 🧐 Основные функции

Приложение "Chuck Jokes" - это мобильное приложение на `Kotlin`, предоставляющее доступ к шуткам о Чаке Норрисе. Приложение разработано с использованием архитектуры `MVVM` и поддерживает `многомодульную структуру`. Оно позволяет просматривать случайные шутки о Чаке Норрисе и получать доступ к полному тексту каждой шутки, нажав на нее.

- **Просмотр случайных шуток о Чаке Норрисе.**

- **Получение полного текста шутки, нажав на нее.**

- **Поддержка многомодульной структуры.**

- **Внедрение зависимостей с помощью Dagger 2.**

- **Управление параллельными задачами с использованием Coroutines.**

- **Использование нескольких API**

## 🛠️ Установка

1. Клонируйте репозиторий на свой компьютер:

```bash
git clone https://github.com/ubisofter/chuckJokes.git
```

2. Откройте проект в Android Studio.

3. Установите используемые зависимости:

```bash
implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2'
implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.6.2'
implementation "com.google.dagger:hilt-android:2.39.1"
kapt 'androidx.hilt:hilt-compiler:1.0.0'
implementation 'com.google.dagger:dagger:2.12'
implementation 'com.google.dagger:dagger-android:2.12'
implementation 'com.google.dagger:dagger-android-support:2.12'
kapt 'com.google.dagger:dagger-compiler:2.12'
kapt 'com.google.dagger:dagger-android-processor:2.12'
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.squareup.retrofit2:converter-scalars:2.9.0'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1'
implementation 'androidx.core:core-ktx:1.8.0'
implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'
implementation 'androidx.activity:activity-compose:1.7.2'
implementation 'androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0-alpha02'
implementation 'androidx.compose.ui:ui:1.5.1'
implementation 'androidx.compose.ui:ui-tooling:1.5.1'
implementation 'androidx.compose.runtime:runtime-livedata:1.5.1'
implementation 'com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2'
implementation 'com.squareup.picasso:picasso:2.71828'
implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
implementation 'androidx.core:core-ktx:1.9.0'
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.9.0'
```

4. Запустите приложение 🌟

## 💻 Задействованный стек:

- [Kotlin](https://kotlinlang.org/)
- [Android Architecture Components]([https://tailwindcss.com/](https://developer.android.com/jetpack/androidx/explorer))
- [Архитектура MVVM](https://ru.wikipedia.org/wiki/Model-View-ViewModel)
- [Dagger 2](https://dagger.dev/): DI
- [Coroutines](https://developer.android.com/kotlin/coroutines): Асинхронные задачи
- [Picasso](https://github.com/square/picasso): Для картинок
- [Retrofit 2](https://square.github.io/retrofit)
- [OkHttp 3](https://square.github.io/okhttp/): Для запросов
- API Обобщения текста в Title (Необходима регистрация) [Article Extractor and Summarizer](https://rapidapi.com/restyler/api/article-extractor-and-summarizer)
- API отдающее фото соответствующее тексту (Необходима регистрация) [Article Extractor and Summarizer](https://unsplash.com/documentation#search-photos)
- API отдающее рандомную шутку Чака (Открытое) [Сhucknorris.io](https://api.chucknorris.io/)

## 🍰 Внесение вклада

Если вы хотите внести свой вклад в приложение "Chuck Jokes", не стесняйтесь создавать pull request. Мы приветствуем любые вклады!

## 📃 Лицензия открытая

## Создано с ❤️ при поддержке Чака Норриса.

------------------------------------------

<p align="center">
  <a href="https://n1s1.hsmedia.ru/b8/38/f0/b838f0f1c7a310e05dd3f888ffb46cc3/160x160_1_ee6e41234e8ca9f03664600c6c313751@785x785_0xac120004_9781560411681129191.jpeg">
    <img alt="Chuck Jokes App" src="https://n1s1.hsmedia.ru/b8/38/f0/b838f0f1c7a310e05dd3f888ffb46cc3/160x160_1_ee6e41234e8ca9f03664600c6c313751@785x785_0xac120004_9781560411681129191.jpeg" width="60" />
  </a>
</p>
<h1 align="center">
  Chuck Jokes App
</h1>

<p align="center">
<a href="https://github.com/ubisofter/chuckJokes/blob/master/LICENSE" target="blank">
<img src="https://img.shields.io/github/license/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes license" />
</a>
<a href="https://github.com/ubisofter/chuckJokes/fork" target="blank">
<img src="https://img.shields.io/github/forks/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes forks"/>
</a>
<a href="https://github.com/ubisofter/chuckJokes/stargazers" target="blank">
<img src="https://img.shields.io/github/stars/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes stars"/>
</a>
<a href="https://github.com/ubisofter/chuckJokes/issues" target="blank">
<img src="https://img.shields.io/github/issues/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes issues"/>
</a>
<a href="https://github.com/ubisofter/chuckJokes/pulls" target="blank">
<img src="https://img.shields.io/github/issues-pr/ubisofter/chuckJokes?style=flat-square" alt="chuckJokes pull-requests"/>
</a>
</p>

<p align="center"><img src="https://github.com/ubisofter/chuckJokes/assets/78037558/bae51cf2-77d4-4ddb-be68-0a14f6fbfe7f" alt="chuckJokes gif" /></p>

<p align="center">
    <a href="https://github.com/ubisofter/chuckJokes/blob/main/chuck.apk" target="blank">View Demo</a>
    ·
    <a href="https://github.com/ubisofter/chuckJokes/issues/new/choose">Report Bug</a>
    ·
    <a href="https://github.com/ubisofter/chuckJokes/issues/new/choose">Request Feature</a>
</p>

APK: [Chuck Jokes](https://github.com/ubisofter/chuckJokes/blob/main/chuck.apk)

## 🧐 Key Features

The Chuck Jokes App is a Kotlin-based mobile application that provides access to Chuck Norris jokes. The app follows the MVVM architecture and supports a multi-module structure. It allows you to view random Chuck Norris jokes and access the full text of each joke by clicking on it.

- **Browse random Chuck Norris jokes.**
- **View the full text of a joke by clicking on it.**
- **Support for a multi-module structure.**
- **Dependency injection using Dagger 2.**
- **Concurrency management with Coroutines.**
- **Multiple APIs used.**

## 🛠️ Installation

1. Clone the repository to your computer:

```bash
git clone https://github.com/ubisofter/chuckJokes.git
```

2. Open the project in Android Studio.

3. Install the required dependencies:

```bash
implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2'
implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.6.2'
implementation "com.google.dagger:hilt-android:2.39.1"
kapt 'androidx.hilt:hilt-compiler:1.0.0'
implementation 'com.google.dagger:dagger:2.12'
implementation 'com.google.dagger:dagger-android:2.12'
implementation 'com.google.dagger:dagger-android-support:2.12'
kapt 'com.google.dagger:dagger-compiler:2.12'
kapt 'com.google.dagger:dagger-android-processor:2.12'
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.squareup.retrofit2:converter-scalars:2.9.0'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1'
implementation 'androidx.core:core-ktx:1.8.0'
implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'
implementation 'androidx.activity:activity-compose:1.7.2'
implementation 'androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0-alpha02'
implementation 'androidx.compose.ui:ui:1.5.1'
implementation 'androidx.compose.ui:ui-tooling:1.5.1'
implementation 'androidx.compose.runtime:runtime-livedata:1.5.1'
implementation 'com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2'
implementation 'com.squareup.picasso:picasso:2.71828'
implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
implementation 'androidx.core:core-ktx:1.9.0'
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.9.0'
```

4. Run the app 🌟
   
## 💻 Tech Stack

- [Kotlin](https://kotlinlang.org/)
- [Android Architecture Components]([https://tailwindcss.com/](https://developer.android.com/jetpack/androidx/explorer))
- [MVVM Architecture](https://ru.wikipedia.org/wiki/Model-View-ViewModel)
- [Dagger 2](https://dagger.dev/): Dependency Injection
- [Coroutines](https://developer.android.com/kotlin/coroutines): Asynchronous Tasks
- [Picasso](https://github.com/square/picasso): Image Loading
- [Retrofit 2](https://square.github.io/retrofit): HTTP Requests
- [OkHttp 3](https://square.github.io/okhttp/): HTTP Client
- Text Summarization API (Registration required) [Article Extractor and Summarizer](https://rapidapi.com/restyler/api/article-extractor-and-summarizer)
- Image Search API (Registration required) [Article Extractor and Summarizer](https://unsplash.com/documentation#search-photos)
- Random Chuck Norris Jokes API (Open) [Сhucknorris.io](https://api.chucknorris.io/)

## 🍰 Contribution
If you'd like to contribute to the Chuck Jokes App, feel free to create a pull request. We welcome any contributions!

## 📃 License open

## Created with ❤️ with the support of Chuck Norris.
