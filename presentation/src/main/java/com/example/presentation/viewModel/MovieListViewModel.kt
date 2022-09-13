package com.example.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.interactor.GetMovieListUseCase
import com.example.domain.models.AttributeUiModel
import com.example.presentation.utils.CoroutineContextProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val coroutineContextProvider: CoroutineContextProvider,
    private val getMovieListUseCase: GetMovieListUseCase
) : BaseViewModel(coroutineContextProvider) {

    private val _movieList = MutableLiveData<AttributeUiModel>()
    val movieList: LiveData<AttributeUiModel> = _movieList

    override val coroutineExceptionHandler: CoroutineExceptionHandler =
        CoroutineExceptionHandler { _, throwable ->
            _movieList.postValue(AttributeUiModel.Error(throwable.message ?: ""))
        }


    fun getMovies(query: String) {
        _movieList.postValue(AttributeUiModel.Loading)
        launchCoroutineIO {
            loadMovies(query)
        }
    }

    private suspend fun loadMovies(query: String) {
        getMovieListUseCase(query).collectLatest {
            _movieList.postValue(AttributeUiModel.Success(it))
        }
    }
}