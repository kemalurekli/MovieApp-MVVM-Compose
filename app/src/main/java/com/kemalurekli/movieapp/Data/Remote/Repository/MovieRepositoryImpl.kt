package com.kemalurekli.movieapp.Data.Remote.Repository

import com.kemalurekli.movieapp.Data.Remote.Dto.MovieDetails.MovieDetailDto
import com.kemalurekli.movieapp.Data.Remote.Dto.Movies.MoviesDto
import com.kemalurekli.movieapp.Data.Remote.MovieAPI
import com.kemalurekli.movieapp.Domain.Repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }
    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}