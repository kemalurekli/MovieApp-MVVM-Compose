package com.kemalurekli.movieapp.Data.Remote.Mapper

import com.kemalurekli.movieapp.Data.Remote.Dto.MovieDetails.MovieDetailDto
import com.kemalurekli.movieapp.Domain.Model.MovieDetail

fun MovieDetailDto.toMovieDetail() : MovieDetail {
    return MovieDetail(
        Actors,Awards,Country,Director,Genre,Language,Poster,Rated,Released,Title,Type,Year,imdbRating
    )
}