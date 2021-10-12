package com.martialcoder.moviebuff.api;

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    companion object{
        const val BASE_URL = "http://api.themoviedb.org/3/";
        const val CACHE_SIZE = 10 * 1024 * 1024 // 10 MB
        const val CONNECT_TIMEOUT = 15;
        const val WRITE_TIMEOUT = 60;
        const val TIMEOUT = 60;
    }

}
