package com.kemalurekli.movieapp.Data.Remote.Dto.Movies


data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

