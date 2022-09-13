package com.example.moviemo.di

import com.example.data.repository.MovieRemote
import com.example.moviemo.BuildConfig
import com.example.remote.MovieRemoteImpl
import com.example.remote.api.MovieService
import com.example.remote.api.ServiceFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {


    @Singleton
    @Provides
    fun provideMovieService(): MovieService =
        ServiceFactory.create(BuildConfig.DEBUG, BuildConfig.BASE_URL)

    @Singleton
    @Provides
    fun provideMovieRemote(movieRemoteImpl: MovieRemoteImpl): MovieRemote = movieRemoteImpl
}