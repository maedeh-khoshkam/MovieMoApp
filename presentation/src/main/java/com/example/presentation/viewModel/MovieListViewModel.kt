package com.example.presentation.viewModel

import androidx.lifecycle.LiveData
import com.example.domain.interactor.GetMovieListUseCase
import com.example.domain.models.AttributeUiModel
import com.example.presentation.utils.CoroutineContextProvider
import com.example.presentation.utils.UiAwareLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val coroutineContextProvider: CoroutineContextProvider,
    private val getMovieListUseCase: GetMovieListUseCase
) : BaseViewModel(coroutineContextProvider) {

    private val _movieList = UiAwareLiveData<AttributeUiModel>()
    val movieList: LiveData<AttributeUiModel> = _movieList
    override val coroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            _movieList.postValue(AttributeUiModel.Error(throwable.message ?: "Error"))
        }


    fun getMovies(query: String) {
        _movieList.postValue(AttributeUiModel.Loading)
        launchCoroutineIO {
            loadMovies(query)
        }
    }

    private suspend fun loadMovies(query: String) {
        getMovieListUseCase(query).collect {
            _movieList.postValue(AttributeUiModel.Success(it))
        }
    }
}