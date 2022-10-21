package com.raquelparadinha.lab3_3.entities;

import javax.persistence.*;

@Entity
@Table(name = "movies_table")
public class Movie {

    private long id;
    private String title;
    private int year;

    public Movie() {}
    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "year", nullable = false)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nYear: " + year + "\nId: " + id;
    }
}
