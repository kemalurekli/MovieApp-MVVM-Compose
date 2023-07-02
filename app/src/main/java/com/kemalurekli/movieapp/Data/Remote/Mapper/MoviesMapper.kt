package com.kemalurekli.movieapp.Data.Remote.Mapper

import com.kemalurekli.movieapp.Data.Remote.Dto.MovieDetails.MovieDetailDto
import com.kemalurekli.movieapp.Data.Remote.Dto.Movies.MoviesDto
import com.kemalurekli.movieapp.Domain.Model.Movie
import com.kemalurekli.movieapp.Domain.Model.MovieDetail

fun MoviesDto.toMovieList() :List<Movie> {
    return Search.map { search -> Movie(search.Poster,search.Title,search.Year,search.imdbID) }
}