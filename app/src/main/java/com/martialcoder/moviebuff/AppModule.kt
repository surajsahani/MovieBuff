package com.martialcoder.moviebuff

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModule {

    private var application: Application? = null


    fun AppModule(application: Application) {
        this.application = application
    }

    @Provides
    @Singleton
    open fun providesApplication(): Application? {
        return application
    }
}