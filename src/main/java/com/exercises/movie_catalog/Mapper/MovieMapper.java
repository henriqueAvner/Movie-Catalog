package com.exercises.movie_catalog.Mapper;

import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;

public class MovieMapper {

    public MovieMapper() {
    }

    public Movie toMovie(MovieDTO movieDTO) {
        return new Movie(
                movieDTO.id(),
                movieDTO.title(),
                movieDTO.director(),
                movieDTO.releasedYear()
        );
    }

    public MovieDTO toDTO(Movie movie) {
        long idMovie = (long) (Math.random()*1001);
        return new MovieDTO(
                idMovie,
                movie.getTitle(),
                movie.getDirector(),
                movie.getReleasedYear()
        );
    }

}
