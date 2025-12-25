package com.exercises.movie_catalog.Controller;

import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MovieControllerInterface {
    ResponseEntity<MovieDTO> create(Movie movie);
    ResponseEntity<List<MovieDTO>> findAllMovies();
    ResponseEntity<MovieDTO> updateMovie(long id, Movie movie);
    ResponseEntity<String> deleteMovie(long id);
}
