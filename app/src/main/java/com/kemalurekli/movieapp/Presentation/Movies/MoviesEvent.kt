package com.kemalurekli.movieapp.Presentation.Movies

sealed class MoviesEvent {
    data class Search(val searchString :String) : MoviesEvent()

}