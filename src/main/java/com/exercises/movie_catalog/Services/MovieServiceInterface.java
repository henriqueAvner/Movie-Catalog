package com.exercises.movie_catalog.Services;

import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;
import com.exercises.movie_catalog.Exceptions.MovieNotCreatedException;
import com.exercises.movie_catalog.Exceptions.MovieNotFoundException;

import java.util.List;

public interface MovieServiceInterface {
    MovieDTO create(Movie movie) throws MovieNotCreatedException;
    List<MovieDTO> findAllMovies() throws MovieNotFoundException;
    MovieDTO updateMovie(long id, Movie movie);
    void deleteMovie(Long id);
}
