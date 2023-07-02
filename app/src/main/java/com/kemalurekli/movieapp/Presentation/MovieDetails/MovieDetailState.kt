package com.kemalurekli.movieapp.Presentation.MovieDetails

import com.kemalurekli.movieapp.Domain.Model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)