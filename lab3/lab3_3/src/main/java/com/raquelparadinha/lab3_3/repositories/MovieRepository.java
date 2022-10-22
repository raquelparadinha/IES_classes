package com.raquelparadinha.lab3_3.repositories;

import com.raquelparadinha.lab3_3.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    public List<Movie> findByTitle(String title);

    public Movie findById(int id);
}
