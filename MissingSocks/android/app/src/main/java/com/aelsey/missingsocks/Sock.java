package com.aelsey.missingsocks;

/**
 * Created by Roshni on 2/1/2015.
 */
public class Sock {

    private CharSequence date;
    private boolean lostFound;
    private String university;
    private String laundryroom;
    private String color;
    private String style;
    private String gender;
    private String description;

    public Sock(CharSequence date, boolean lostFound, String university, String laundryroom,
                String color, String style, String gender, String description) {
        this.date = date;
        this.lostFound = lostFound;
        this.university = university;
        this.laundryroom = laundryroom;
        this.color = color;
        this.style = style;
        this.gender = gender;
        this.description = description;
    }

}
