package com.example.data

import com.example.data.mapper.mapFromEntity
import com.example.data.source.MovieDataSourceFactory
import com.example.domain.models.Attributes
import com.example.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val dataSourceFactory: MovieDataSourceFactory) :
    MovieRepository {
    override suspend fun getMovies(query: String): Flow<List<Attributes>> = flow {
        val movieList:List<Attributes> = dataSourceFactory.getDataStore(false).getMovies(query).mapFromEntity()
        emit(movieList)
    }

    override suspend fun saveMovie(movie: Attributes) {
        //TODO
    }
}

