package com.softserve.academy.module3;


import java.time.Year;

public class Person {
    // Fields
    private String firstName;
    private String lastName;
    private int birthYear;


    //Getters and Setters.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    //Constructors
    public Person() {
    }

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //Methods

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }


    public void output1() {
        System.out.print("\n" + "First and last name is: " + "[" + firstName + "]");
        System.out.print("[" + lastName + "]");
        System.out.print("\n" + "Birth Year: " + "[" + birthYear + "]");
        System.out.print("\n" + "Age: " + "[" + getAge() + "]" + "\n");
    }

    public String output() {
        return "\n" + "First and last name is: " + "[" + firstName + "]"
                + "[" + lastName + "]" + "\n" + "Birth Year: " + "[" + birthYear + "]"
                + "\n" + "Age: " + "[" + getAge() + "]" + "\n";
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
}


