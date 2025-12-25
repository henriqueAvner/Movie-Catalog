package com.exercises.movie_catalog.Services;

import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;

import java.util.List;

public interface MovieServiceInterface {
    MovieDTO create(Movie movie);
    List<MovieDTO> findAllMovies();
    void updateMovie(long id, Movie movie);
    void deleteMovie(Long id);
}
