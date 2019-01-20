package com.example.maxdo.dagger2sample

import android.app.Application
import com.example.maxdo.dagger2sample.dagger.ApiCalls
import com.example.maxdo.dagger2sample.dagger.MyPreferences
import com.example.maxdo.dagger2sample.dagger.appComponent.ContextModule
import com.example.maxdo.dagger2sample.dagger.appComponent.DaggerAppComponent
import javax.inject.Inject

class App : Application() {

    @Inject
    lateinit var apiCalls: ApiCalls;

    @Inject
    lateinit var pref: MyPreferences;

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.builder()
            .contextModule(ContextModule(this))
            .build()

        appComponent.inject(this)

    }
}