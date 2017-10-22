package com.example.camer.friender;

/**
 * Created by Isaac on 10/21/2017.
 */

public class Game {
    public String name;

    public String type;

    public String developer;

    public int year;


    public Game(String name, String type, String developer, int year) {
        this.name = new String(name);
        this.type = new String(type);
        this.developer = new String(developer);
        this.year = year;
    }
}
