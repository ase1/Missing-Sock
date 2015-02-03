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
    private CharSequence description;
    //private Person submitter;
    private int id;

    public Sock(int id, CharSequence date, boolean lostFound, String university, String laundryroom,
                String color, String style, String gender, CharSequence description) {
        this.id=id;
        this.date = date;
        this.lostFound = lostFound;
        this.university = university;
        this.laundryroom = laundryroom;
        this.color = color;
        this.style = style;
        this.gender = gender;
        this.description = description;
        //this.submitter = submitter;
    }

    CharSequence getDate()
    {
        return this.date;
    }
    boolean getLostFound()
    {
        return this.lostFound;
    }
    String getUniversity()
    {
        return this.university;
    }
    String getLaundryRoom()
    {
        return this.laundryroom;
    }

    String getColor()
    {
        return this.color;
    }
    String getStyle()
    {
        return this.style;
    }
    String getGender()
    {
        return this.gender;
    }
    CharSequence getDescription()
    {
        return this.description;
    }
    /*Person getSubmitter()
    {
        return this.submitter;
    }*/

    CharSequence sockName()
    {
        return this.color + " " + this.style;
    }

    /*CharSequence subDetails()
    {
        return "Submitted " + this.date + " by " + this.submitter.getFirstName();
    }*/

}
