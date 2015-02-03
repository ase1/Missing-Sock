package com.aelsey.missingsocks;

/**
 * Created by Andrew on 02.01.2015.
 */
public class Person {
    public CharSequence firstName;
    public CharSequence lastName;
    public CharSequence email;
    public CharSequence phone;
    public boolean preferEmail;
    public int matches;
    public CharSequence picURL;
    public String id;

    public Person (String id, CharSequence firstName, CharSequence lastName, CharSequence email,
                   CharSequence phone, boolean preferEmail, int matches, CharSequence picURL)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phone=phone;
        this.preferEmail=preferEmail;
        this.matches=matches;
        this.picURL=picURL;
    }
    String getId()
    {
        return this.id;
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
