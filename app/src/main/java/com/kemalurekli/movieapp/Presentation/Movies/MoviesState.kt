package com.kemalurekli.movieapp.Presentation.Movies

import com.kemalurekli.movieapp.Domain.Model.Movie

data class MoviesState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "ironman"
)