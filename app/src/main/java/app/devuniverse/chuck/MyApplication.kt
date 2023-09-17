package app.devuniverse.chuck

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}