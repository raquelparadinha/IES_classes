package com.raquelparadinha.APIquotes.Classes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class APIController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/api/quotes")
    public Quote randomQuote(@RequestParam(value = "show", defaultValue = "1") String name) {
        try {
            int a = Integer.parseInt(name);


            ArrayList<Show> shows = this.addShows();
            for (Show f: shows){
                if (a == f.getId()){
                    ArrayList<String> array = f.getQuotes();

                    Random r = new Random();
                    int result = r.nextInt(array.size());
                    String ret = array.get(result);
                    return new Quote(ret);
                }
            }
        }
        catch(Exception e){
            return new Quote("Página não encontrada");
        }
        return null;
    }


    @GetMapping("/api/shows")
    public ArrayList<Show> allShows() {
        return this.addShows();
    }

    @GetMapping("/api/quote")
    public Quote randomQuote() {
        ArrayList<String> array = this.allQuotes();

        Random r = new Random();
        int result = r.nextInt(array.size());
        String ret = array.get(result);
        return new Quote(ret);
    }

    private ArrayList<Show> addShows() {
        ArrayList<Show> shows = new ArrayList<>();
        Show lucifer = new Show(1, "Lucifer");
        lucifer.addQuote("People don’t have power over us. We give it to them.");
        lucifer.addQuote("We can’t control what happens to us only how it affects us and the choices we make.");
        lucifer.addQuote("Sometimes we need to lose something to understand its value.");
        shows.add(lucifer);
        Show the_office = new Show(2, "The Office");
        the_office.addQuote("Have you lost your mind cause i'll help you find it");
        the_office.addQuote("Would I rather be feared or loved? Easy. Both. I want people to be afraid of how much they love me.");
        shows.add(the_office);
        Show ozark = new Show(3, "Ozark");
        ozark.addQuote("Too much talk and words lose their meaning.");
        ozark.addQuote("The bite of the apple was not the original sin. Lucifer’s fall was.");
        ozark.addQuote("When you think you’re gonna die yesterday, today is sweet.");
        shows.add(ozark);
        return shows;
    }

    private ArrayList<String> allQuotes() {
        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("People don’t have power over us. We give it to them.");
        quotes.add("We can’t control what happens to us only how it affects us and the choices we make.");
        quotes.add("Sometimes we need to lose something to understand its value.");
        quotes.add("Have you lost your mind cause i'll help you find it");
        quotes.add("Would I rather be feared or loved? Easy. Both. I want people to be afraid of how much they love me.");
        quotes.add("Too much talk and words lose their meaning.");
        quotes.add("The bite of the apple was not the original sin. Lucifer’s fall was.");
        quotes.add("When you think you’re gonna die yesterday, today is sweet.");
        return quotes;
    }
}
