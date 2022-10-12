package com.raquelparadinha.APIquotes.Classes;

import java.util.ArrayList;

public class Show {
    private final long id;
    private String name;
    private ArrayList<String> quotes;

    public Show(long id, String name) {
        this.id = id;
        this.name = name;
        quotes = new ArrayList<>();
    }

    public long getId() {
         return this.id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getQuotes() {
        return quotes;
    }

    public void addQuote(String quote) {
        quotes.add(quote);
    }

    public void setQuotes(ArrayList<String> quotes) {
        this.quotes = quotes;
    }

    public void setName(String name) {
        this.name = name;
    }
}
