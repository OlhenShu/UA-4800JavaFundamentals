package com.softserve.academy.module3;

import java.time.Year;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(int birthYear) {
        return Year.now().getValue() - birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
    }

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

    @Override
    public String toString() {
        return "FirstName: " + firstName + '\n' +
                "LastName: " + lastName + '\n' +
                "BirthYear: " + birthYear;
    }
}
