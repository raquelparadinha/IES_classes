package com.raquelparadinha.lab3_3.controllers;

import com.raquelparadinha.lab3_3.entities.Movie;
import com.raquelparadinha.lab3_3.entities.Quote;
import com.raquelparadinha.lab3_3.services.MovieService;
import com.raquelparadinha.lab3_3.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class Controller {
    @Autowired
    private MovieService movieService;
    @Autowired
    private QuoteService quoteService;

    @GetMapping("/movies")
    public List<Movie> movies() {
        return movieService.getMovies();
    }

    @PutMapping("/new_movie")
    public Movie newMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id) {
        return movieService.delete(id);
    }

    @GetMapping("/quotes")
    public Quote quotes() {
        Random randomMovie = new Random();
        List<Movie> movies = movieService.getMovies();

        if (movies.size() == 0) {
            return null;
        }
        Movie randMovie =  movies.get(randomMovie.nextInt(movies.size()));

        Random randomQuote = new Random();
        List<Quote> quotes = quoteService.getQuoteByMovie(randMovie);

        if (quotes.size() == 0) {
            return null;
        }
        return quotes.get(randomQuote.nextInt(quotes.size()));
    }

    @PutMapping("/new_quote")
    public Quote newQuote(@RequestBody Quote quote) {
        return quoteService.saveQuote(quote);
    }

    @GetMapping("/quote/{id}")
    public Quote quoteByMovie(@PathVariable int id) {
        Movie movie = movieService.getMovie(id);
        Random randomQuote = new Random();
        List<Quote> quotes = quoteService.getQuoteByMovie(movie);

        if (quotes.size() == 0) {
            return null;
        }
        return quotes.get(randomQuote.nextInt(quotes.size()));
    }
}
