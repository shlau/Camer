package com.example.camer.friender;

import android.widget.ImageView;

import java.util.*;

/**
 * Created by Isaac on 10/21/2017.
 */

public class User {
    private String username;
    private String password;

    private String firstName;
    private String middleName;
    private String lastName;

    private int DOB_day;
    private int DOB_month;
    private int DOB_year;

    private GregorianCalendar joinDate;

    private GregorianCalendar lastLogin;

    private String email;

    private ArrayList<Game> games;

    private ArrayList<User> friends;

    private int rank;
    private String bnetID;

    private ImageView profilePic;       // directing setting and returning reference to this, might need to change

    public static final int GALLERY_COUNT = 5;
    private ImageView[] gallery = new ImageView[GALLERY_COUNT];

    private String discription;

    public User(String username, String password,
                String firstName, String middleName, String lastName,
                int DOB_day, int DOB_month, int DOB_year) {
        this.username = new String(username);
        this.password = new String(password);

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        this.DOB_day = DOB_day;
        this.DOB_month = DOB_month;
        this.DOB_year = DOB_year;

        joinDate = new GregorianCalendar();
        lastLogin = new GregorianCalendar();
    }

    /* SETTERS */

    public void setFirstName(String s) {
        this.firstName = new String(s);
    }

    public void setMiddleName(String s) {
        this.middleName = new String(s);
    }

    public void setLastName(String s) {
        this.lastName = new String(s);
    }

    public boolean setEmail(String s) {
        String temp = new String(s);
        if(temp.replaceAll("@", "").length() == s.length() - 1) {
            this.email = new String(s);
            return true;
        }
        return false;
    }

    public void setDiscription(String s) {
        this.discription = new String(s);
    }

    public void setProfilePic(ImageView i) {
        profilePic = i;
    }

    public void loggedin() {
        lastLogin = new GregorianCalendar();
    }

    public boolean changePassword(String oldPassword, String newPassword, String newPasswordConfirm) {
        if(!oldPassword.equals(this.password))
            return false;

        if(!newPassword.equals(newPasswordConfirm))
            return false;

        this.password = new String(newPassword);
        return true;
    }

    public void addGame(Game g) {
        if(!this.games.contains(g))
            this.games.add(g);
    }

    public void removeGame(Game g) {
        this.games.remove(g);
    }

    public void addFriend(User u) {
        if(!this.friends.contains(u))
            this.friends.add(u);
    }

    public void removeFriend(User u) {
        this.friends.remove(u);
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setBnetID(String s) {
        this.bnetID = new String(s);
    }

    /* GETTERS */

    public GregorianCalendar getLastLogin() {
        return new GregorianCalendar(lastLogin.YEAR, lastLogin.MONTH, lastLogin.DAY_OF_MONTH, lastLogin.HOUR_OF_DAY, lastLogin.MINUTE);
    }

    public GregorianCalendar getjoinDate() {
        return new GregorianCalendar(joinDate.YEAR, joinDate.MONTH, joinDate.DAY_OF_MONTH, joinDate.HOUR_OF_DAY, joinDate.MINUTE);
    }

    public String getFirstName() {
        return new String(firstName);
    }

    public String getMiddleName() {
        return new String(middleName);
    }

    public String getLastName() {
        return new String(lastName);
    }

    public String getDiscription() {
        return new String(discription);
    }

    public ImageView getProfilePic() {
        return profilePic;
    }

    public ArrayList<Game> getListOfGames() {
        return new ArrayList<Game>(games);
    }

    public ArrayList<User> getListOfFriends() {
        return new ArrayList<User>(friends);
    }

    public int getRank() {
        return rank;
    }

    public String getBnetID() {
        return new String(bnetID);
    }

    public String getUsername() {
        return new String(username);
    }
}
