package com.example.moviemo.ui.screens


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.domain.models.AttributeUiModel
import com.example.domain.models.Attributes
import com.example.presentation.viewModel.MovieListViewModel
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun MovieListScreen(viewModel: MovieListViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        SearchField(viewModel)
        MovieList(viewModel)
    }
}

@Composable
fun SearchField(viewModel: MovieListViewModel) {

    val input = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .padding(vertical = 4.dp)
            .border(2.dp, Color.Black, RoundedCornerShape(15.dp)),
        value = input.value,

        onValueChange = { text ->
            input.value = text
            viewModel.getMovies(text)
        },
        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.End),
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            backgroundColor = Color.Transparent,
            cursorColor = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
        ),
        maxLines = 1,
        singleLine = true,

        )
}

@Composable
fun MovieList(viewModel: MovieListViewModel) {
    val data by viewModel.movieList.observeAsState(null)
    if (data?.isRedelivered == true) return
    data?.let {
        when (it) {
            is AttributeUiModel.Loading -> {
                Loading(true)
            }
            is AttributeUiModel.Success -> {
                Loading(false)
                val movies =
                    it.data
                LazyColumn(contentPadding = PaddingValues(horizontal = 0.dp, vertical = 8.dp)) {
                    items(items = movies , itemContent = { MovieItem(it) })
                }
            }
            is AttributeUiModel.Error -> {
                Loading(false)
            }
        }
    }


}


@Composable
fun Loading(visible: Boolean) {
    if (visible) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator(color = Color.Red)
        }
    }


}

@Composable
fun MovieItem(movie: Attributes) {
    Card(
        modifier = Modifier.padding(2.dp),
        shape = RoundedCornerShape(corner = CornerSize(16.dp)), elevation = 4.dp,
        backgroundColor = Color.Gray
    ) {
        Row(horizontalArrangement = Arrangement.Start) {
            NetWorkImage(movie.pic?.movieImgS)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = movie.movieTitle ?: "", style = typography.body2, maxLines = 1)
                Text(text = movie.movieTitleEn ?: "", style = typography.caption,maxLines = 1)

            }
        }

    }
}


@Composable
fun NetWorkImage(url: String?) {

    Column(
        modifier = Modifier
            .width(IntrinsicSize.Max)
            .fillMaxHeight()

    ) {
        CoilImage(
            imageModel = url,
            imageOptions = ImageOptions(
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
        )
    }

}
