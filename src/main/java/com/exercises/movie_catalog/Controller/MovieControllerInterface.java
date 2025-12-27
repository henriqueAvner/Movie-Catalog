package com.exercises.movie_catalog.Controller;

import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;
import com.exercises.movie_catalog.Exceptions.MovieNotCreatedException;
import com.exercises.movie_catalog.Exceptions.MovieNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieControllerInterface {
    ResponseEntity<MovieDTO> create(Movie movie) throws MovieNotCreatedException;
    ResponseEntity<List<MovieDTO>> findAllMovies() throws MovieNotFoundException;
    ResponseEntity<MovieDTO> updateMovie(long id, Movie movie);
    ResponseEntity<String> deleteMovie(long id);
}
