package com.raquelparadinha.lab3_3.services;

import com.raquelparadinha.lab3_3.entities.Movie;
import com.raquelparadinha.lab3_3.entities.Quote;
import com.raquelparadinha.lab3_3.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quotes;

    public Quote saveQuote(Quote quote) {
        return quotes.save(quote);
    }

    public List<Quote> getQuoteByMovie(Movie movie) {
        return quotes.findByMovie(movie);
    }

}
