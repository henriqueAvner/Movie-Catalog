package com.exercises.movie_catalog.Controller;

import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;
import com.exercises.movie_catalog.Services.MovieServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController implements MovieControllerInterface {

    private MovieServiceInterface service;

    @Override
    @PostMapping
    public ResponseEntity<MovieDTO> create(@RequestBody Movie movie) {
       MovieDTO newMovie = service.create(movie);

       return ResponseEntity.status(HttpStatus.CREATED).body(newMovie);
    }

    @Override
    public ResponseEntity<List<MovieDTO>> findAllMovies() {

        return ResponseEntity.ok(service.findAllMovies());
    }

    @Override
    public ResponseEntity<MovieDTO> updateMovie(long id, Movie movie) {
        MovieDTO updateMovie = service.updateMovie(id, movie);

        return ResponseEntity.status(HttpStatus.CREATED).body(updateMovie);
    }

    @Override
    public ResponseEntity<String> deleteMovie(long id) {
        service.deleteMovie(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Filme deletado" +
                "com sucesso");
    }
}
