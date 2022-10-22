package com.raquelparadinha.lab3_3.entities;

import javax.persistence.*;

@Entity
@Table(name = "quotes_table")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String quote;



    public Quote() {}
    public Quote(String quote, Movie movie) {
        this.quote = quote;
        this.movie = movie;
    }

    @Column(name = "id", nullable = false)
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Column(name = "quote", nullable = false)
    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "'" + quote + "', " + movie.getTitle() + " (" + movie.getYear() + ")";
    }
}
