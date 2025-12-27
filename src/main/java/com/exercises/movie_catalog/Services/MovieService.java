package com.exercises.movie_catalog.Services;
import com.exercises.movie_catalog.DTOs.MovieDTO;
import com.exercises.movie_catalog.Entities.Movie;
import com.exercises.movie_catalog.Exceptions.MovieNotCreatedException;
import com.exercises.movie_catalog.Exceptions.MovieNotFoundException;
import com.exercises.movie_catalog.Mapper.MovieMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService implements MovieServiceInterface {

    Movie movie = new Movie();
    List<Movie> movies = new ArrayList<>();

    @Override
    public MovieDTO create(Movie movie) throws MovieNotCreatedException {
        MovieMapper createMovie = new MovieMapper();
        try {
            return createMovie.toDTO(movie);
        } catch (MovieNotCreatedException ex) {
            throw new MovieNotCreatedException();
        }
    }

    @Override
    public List<MovieDTO> findAllMovies() throws MovieNotFoundException {
        List<MovieDTO> listMovies = new ArrayList<>();

            for (Movie movie : movies) {
                MovieMapper currMovie = new MovieMapper();
                MovieDTO resultMovie = currMovie.toDTO(movie);
                listMovies.add(resultMovie);
            }
        if (listMovies.isEmpty()) {
            throw new MovieNotFoundException();
        }
        return listMovies;
    }

    @Override
    public MovieDTO updateMovie(long id, Movie movie) {
       movies.stream()
              .filter(m -> m.getId() == id)
               .findFirst()
              .ifPresent(m -> {
                  m.setTitle(movie.getTitle());
                  m.setDirector(movie.getDirector());
                  m.setReleasedYear(movie.getReleasedYear());
              });


        return null;
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
