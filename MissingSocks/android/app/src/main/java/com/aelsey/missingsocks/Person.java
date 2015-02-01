package com.aelsey.missingsocks;

/**
 * Created by Andrew on 02.01.2015.
 */
public class Person {
    private CharSequence firstName;
    private CharSequence lastName;
    private CharSequence email;
    private CharSequence phone;
    private boolean preferEmail;
    private int matches;
    private CharSequence picURL;

    public Person (CharSequence firstName, CharSequence lastName, CharSequence email,
                   CharSequence phone, boolean preferEmail, int matches, CharSequence picURL)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phone=phone;
        this.preferEmail=preferEmail;
        this.matches=matches;
        this.picURL=picURL;
    }
    CharSequence getFirstName()
    {
        return this.firstName;
    }
    CharSequence getLastName()
    {
        return this.lastName;
    }
    CharSequence getEmail()
    {
        return this.email;
    }
    CharSequence getPhone()
    {
        return this.phone;
    }
    boolean getPreferEmail()
    {
        return this.preferEmail;
    }
    int getMatches()
    {
        return this.matches;
    }
    CharSequence getPicURL()
    {
        return this.picURL;
    }
}
