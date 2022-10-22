package com.raquelparadinha.lab3_3.services;

import com.raquelparadinha.lab3_3.entities.Movie;
import com.raquelparadinha.lab3_3.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movies;
    public List<Movie> getMovies() {
        return movies.findAll();
    }

    public Movie saveMovie(Movie movie) {
        return movies.save(movie);
    }

    public String delete(int id) {
        movies.deleteById(id);
        return "Movie deleted with success!";
    }

    public Movie getMovie(int id) {
        return movies.findById(id);
    }
}
