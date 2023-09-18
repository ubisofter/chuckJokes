# chuckJokes

Приложение "Chuck Jokes"
Chuck Norris

Приложение "Chuck Jokes" - это мобильное приложение на Kotlin, предоставляющее доступ к шуткам о Чаке Норрисе. Приложение разработано с использованием архитектуры MVVM и поддерживает многомодульную структуру. Оно позволяет просматривать случайные шутки о Чаке Норрисе и получать доступ к полному тексту каждой шутки, нажав на нее.

Скриншот приложения

Основные функции
Просмотр случайных шуток о Чаке Норрисе.
Получение полного текста шутки, нажав на нее.
Поддержка многомодульной структуры.
Внедрение зависимостей с помощью Dagger 2.
Управление параллельными задачами с использованием Coroutines.
Установка
Чтобы установить приложение "Chuck Jokes", выполните следующие шаги:

Клонируйте репозиторий на свой компьютер:

shell
Copy code
git clone https://github.com/ubisofter/chuckJokes.git
Откройте проект в Android Studio.

Соберите и установите приложение на свое устройство или эмулятор.

Используемые технологии
Kotlin
Android Architecture Components
Архитектура MVVM
Dagger 2
Coroutines
Используемые открытые API
Приложение "Chuck Jokes" использует открытые API для получения шуток о Чаке Норрисе. Вот доступные конечные точки API:

Получить случайную шутку о Чаке Норрисе в формате JSON:

lua
Copy code
https://api.chucknorris.io/jokes/random
Получить случайную шутку о Чаке Норрисе из конкретной категории:

lua
Copy code
https://api.chucknorris.io/jokes/random?category={категория}
Получить список доступных категорий шуток:

arduino
Copy code
https://api.chucknorris.io/jokes/categories
Выполнить свободный текстовый поиск шуток:

arduino
Copy code
https://api.chucknorris.io/jokes/search?query={запрос}
Внесение вклада
Если вы хотите внести свой вклад в приложение "Chuck Jokes", не стесняйтесь создавать pull request. Мы приветствуем любые вклады!

Лицензия
[Вставьте текст лицензии здесь]

Создано с ❤️ при поддержке Чака Норриса.

------------------------------------------

Chuck Jokes App
Chuck Norris

The Chuck Jokes App is a Kotlin-based mobile application that provides access to Chuck Norris jokes. The app follows the MVVM architecture and supports a multi-module structure. It allows you to view random Chuck Norris jokes and access the full text of each joke by clicking on it.

App Screenshot

Key Features
Browse random Chuck Norris jokes.
View the full text of a joke by clicking on it.
Support for a multi-module structure.
Dependency injection using Dagger 2.
Concurrency management with Coroutines.
Installation
To install the Chuck Jokes App, follow these steps:

Clone the repository to your computer:

shell
Copy code
git clone https://github.com/ubisofter/chuckJokes.git
Open the project in Android Studio.

Build and install the app on your device or emulator.

Technologies Used
Kotlin
Android Architecture Components
MVVM architecture
Dagger 2
Coroutines
Open APIs Used
The Chuck Jokes App utilizes open APIs to fetch Chuck Norris jokes. Here are the available API endpoints:

Get a random Chuck Norris joke in JSON format:

lua
Copy code
https://api.chucknorris.io/jokes/random
Get a random Chuck Norris joke from a specific category:

lua
Copy code
https://api.chucknorris.io/jokes/random?category={category}
Retrieve a list of available joke categories:

arduino
Copy code
https://api.chucknorris.io/jokes/categories
Perform a free-text search for jokes:

graphql
Copy code
https://api.chucknorris.io/jokes/search?query={query}
Contribution
If you'd like to contribute to the Chuck Jokes App, feel free to create a pull request. We welcome any contributions!

License
[Insert License Text Here]

Created with ❤️ with the support of Chuck Norris.