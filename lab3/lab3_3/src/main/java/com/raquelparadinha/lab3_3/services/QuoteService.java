package com.raquelparadinha.lab3_3.services;

import com.raquelparadinha.lab3_3.entities.Movie;
import com.raquelparadinha.lab3_3.entities.Quote;
import com.raquelparadinha.lab3_3.repositories.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quotes;

    public List<Quote> getQuotes() {
        return quotes.findAll();
    }

    public Quote saveQuote(Quote quote) {
        return quotes.save(quote);
    }

    public List<Quote> getQuoteByMovie(Movie randomMovie) {
        return quotes.findByMovie(randomMovie);
    }

}
