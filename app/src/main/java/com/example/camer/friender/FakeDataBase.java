package com.example.camer.friender;

import java.util.ArrayList;

/**
 * Created by Isaac on 10/21/2017.
 */

public class FakeDataBase {
    public static FakeDataBase db;

    private ArrayList<User> listOfUsers = new ArrayList<User>();

    private ArrayList<Game> listOfGames = new ArrayList<Game>();

    public FakeDataBase() {
    }

    public boolean createUser(User u) {
        if (db == null) {
            FakeDataBase.setup();
        }

        if(userExist(u.getUsername())) {
            return false;
        }

        listOfUsers.add(u);
        return true;
    }

    public boolean userExist(String username) {
        if (db == null) {
            FakeDataBase.setup();
        }

        for(int i = 0; i < listOfUsers.size(); i++) {
            if(listOfUsers.get(i).getUsername().equals(username))
                return true;
        }

        return false;
    }

    public boolean addGame(Game g) {
        if (db == null) {
            FakeDataBase.setup();
        }

        if(gameExist(g.name)) {
            return false;
        }

        listOfGames.add(g);
        return true;
    }

    public boolean gameExist(String name) {
        if (db == null) {
            FakeDataBase.setup();
        }

        for(int i = 0; i < listOfGames.size(); i++) {
            if(listOfGames.get(i).name.equals(name))
                return true;
        }

        return false;
    }

    public static void setup() {
        if (db != null) {
            return;
        }

        db = new FakeDataBase();
        User u1 = new User("thelegend27", "password",
                "The ", "Legend ", "27",
                1, 1, 1997);

        u1.setEmail("thelegen27@notemail.com");

        db.createUser(u1);

        User u2 = new User("progamer69", "123456789",
                "I'm ", "Number ", "One",
                1, 1, 2005);

        u2.setEmail("progamer69@notemail.com");

        db.createUser(u2);

        Game g1 = new Game ("Overwatch", "FPS", "Blizzard", 2016);
    }
}
