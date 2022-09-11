package com.example.domain.interactor

import com.example.domain.models.Attributes
import com.example.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository) :
    BaseUseCase<String, Flow<List<Attributes>>> {
    override suspend fun invoke(param: String): Flow<List<Attributes>> =
        movieRepository.getMovies(param)


}