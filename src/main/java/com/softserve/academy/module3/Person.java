package com.softserve.academy.module3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    Scanner scanner;

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(Scanner scanner) {
        this.scanner = scanner;
    }

    public Person(Scanner scanner, String name, String surname) {
        this.scanner = scanner;
        firstName = name;
        lastName = surname;
    }

    public int getAge() {
        return Year.now().getValue() - birthYear;
    }

    public void input() {
        System.out.println("Input first name: ");
        firstName = scanner.nextLine();

        System.out.println("Input last name: ");
        lastName = scanner.nextLine();

        System.out.println("Input birth year: ");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Fist name = " + firstName + '\n' +
                "Last name = " + lastName + '\n' +
                "Birth year = " + birthYear);
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
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
}
