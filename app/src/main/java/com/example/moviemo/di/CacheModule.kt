package com.example.moviemo.di

import com.example.cache.MovieCacheImpl
import com.example.data.repository.MovieCache
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CacheModule {

    @Singleton
    @Provides
    fun provideMovieCache(movieCacheImpl: MovieCacheImpl): MovieCache = movieCacheImpl

}