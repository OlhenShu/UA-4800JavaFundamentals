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

        String safeFirstName = (firstName == null || firstName.isEmpty()) ? "Unknown" : firstName;
        String safeLastName  = (lastName == null || lastName.isEmpty()) ? "Unknown" : lastName;

        System.out.println("First Name: " + safeFirstName);
        System.out.println("Last Name: " + safeLastName);
        System.out.println("Birth Year: " + birthYear);
    }

    public void changeName(String firstName, String lastName) {
        String oldFirstName = this.firstName;
        String oldLastName = this.lastName;
        if (oldFirstName.equals(firstName) && oldLastName.equals(lastName) || (firstName.isEmpty() && lastName.isEmpty())) {
            System.out.println("No changes made for name.");
            return;
        }
        if (!firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            System.out.println("No changes made for first name.");
        }
        if (!lastName.isEmpty()){
            this.lastName = lastName;
        } else {
            System.out.println("No changes made for last name.");
        }
        System.out.println("Name changed from " + oldFirstName + " " + oldLastName + " to " + this.firstName + " " + this.lastName);
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

        String safeFirstName = (firstName == null || firstName.isEmpty()) ? "Unknown" : firstName;
        String safeLastName  = (lastName == null || lastName.isEmpty()) ? "Unknown" : lastName;

        return "FirstName: " + safeFirstName + '\n' +
                "LastName: " + safeLastName + '\n' +
                "BirthYear: " + birthYear;
    }
}
