package com.exercises.movie_catalog.Services;
import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;
import com.exercises.movie_catalog.Mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class MovieService implements MovieServiceInterface {

    Movie movie = new Movie();
    List<Movie> movies = new ArrayList<>();

    @Override
    public MovieDTO create(Movie movie) {
        MovieMapper createMovie = new MovieMapper();
        return createMovie.toDTO(movie);
    }

    @Override
    public List<MovieDTO> findAllMovies() {
        List<MovieDTO> listMovies = new ArrayList<>();

        for (Movie movie : movies) {
            MovieMapper currMovie = new MovieMapper();
            MovieDTO resultMovie = currMovie.toDTO(movie);
            listMovies.add(resultMovie);
        }

        return listMovies;
    }

    @Override
    public void updateMovie(long id, Movie movie) {
       movies.stream()
              .filter(m -> m.getId() == id)
               .findFirst()
              .ifPresent(m -> {
                  m.setTitle(movie.getTitle());
                  m.setDirector(movie.getDirector());
                  m.setReleasedYear(movie.getReleasedYear());
              });


    }

    @Override
    public void deleteMovie(Long id) {
        movies.removeIf(movie -> movie.getId() == id);


        movies.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .ifPresent(movie -> movies.remove(movie));
    }
}
