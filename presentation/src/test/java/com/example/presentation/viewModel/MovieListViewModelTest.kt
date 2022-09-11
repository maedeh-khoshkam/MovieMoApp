package com.example.presentation.viewModel

import androidx.lifecycle.Observer
import com.example.domain.interactor.GetMovieListUseCase
import com.example.domain.models.AttributeUiModel
import com.example.presentation.fakes.FakePresentationData
import com.example.presentation.utils.PresentationBaseTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import java.io.IOException

@ExperimentalCoroutinesApi
class MovieListViewModelTest : PresentationBaseTest() {

    @Mock
    private lateinit var getMovieListUseCase: GetMovieListUseCase

    @Mock
    private lateinit var movieListViewModel: MovieListViewModel


    @Mock
    private lateinit var observer: Observer<AttributeUiModel>

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        movieListViewModel = MovieListViewModel(dispatcher, getMovieListUseCase)

        movieListViewModel.movieList.observeForever(observer)
    }


    @Test
    fun `get movie should return movie list from use-case`() {
        dispatcher.test.runBlockingTest {
            // Arrange (Given)
            val query = "movieTitle1"
            val movieResponse = FakePresentationData.getMovies(query)

            whenever(getMovieListUseCase(query)).thenReturn(flowOf(movieResponse))
            // Act (When)
            movieListViewModel.getMovies(query)
            // Assert (Then)
            verify(observer).onChanged(AttributeUiModel.Loading)
            verify(observer).onChanged(AttributeUiModel.Success(movieResponse))
        }
    }

    @Test
    fun `get movie should return empty movie list from use-case`() {
        dispatcher.test.runBlockingTest {
            // Arrange (Given)
            val query = "00000000"
            val movieResponse = FakePresentationData.getMovies(query)

            whenever(getMovieListUseCase(query)).thenReturn(flowOf(movieResponse))
            // Act (When)
            movieListViewModel.getMovies(query)
            // Assert (Then)
            verify(observer).onChanged(AttributeUiModel.Loading)
            verify(observer).onChanged(AttributeUiModel.Success(movieResponse))
        }
    }

    @Test
    fun `get movie should return error from use-case`() =
        dispatcher.test.runBlockingTest {
            // Arrange (Given)
            val errorMessage = "Internal server error"
            val query = ""
            whenever(getMovieListUseCase(query)).thenAnswer {
                throw IOException(errorMessage)
            }

            // Act (When)
            movieListViewModel.getMovies(query)

            // Assert (Then)
            verify(observer).onChanged(AttributeUiModel.Loading)
            verify(observer).onChanged(AttributeUiModel.Error(errorMessage))
        }


    @After
    fun tearDown() {
        movieListViewModel.onCleared()
    }

}