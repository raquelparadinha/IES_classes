package com.raquelparadinha.lab3_3.repositories;

import com.raquelparadinha.lab3_3.entities.Movie;
import com.raquelparadinha.lab3_3.entities.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByMovie(Movie movie);
}
