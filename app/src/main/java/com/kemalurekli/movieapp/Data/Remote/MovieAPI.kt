package com.kemalurekli.movieapp.Data.Remote

import com.kemalurekli.movieapp.Data.Remote.Dto.MovieDetails.MovieDetailDto
import com.kemalurekli.movieapp.Data.Remote.Dto.Movies.MoviesDto
import com.kemalurekli.movieapp.Util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString :String,
        @Query("apikey") apiKey :String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey: String = API_KEY
    ) : MovieDetailDto

}