package com.kemalurekli.movieapp.Domain.Repository

import com.kemalurekli.movieapp.Data.Remote.Dto.MovieDetails.MovieDetailDto
import com.kemalurekli.movieapp.Data.Remote.Dto.Movies.MoviesDto

interface MovieRepository {
    suspend fun getMovies(search : String) : MoviesDto
    suspend fun getMovieDetail(imdbId : String) : MovieDetailDto
}