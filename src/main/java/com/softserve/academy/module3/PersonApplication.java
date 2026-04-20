package com.softserve.academy.module3;

import java.util.Scanner;

public class PersonApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person(scanner);
        person1.input();
        person1.output();

        Person person2 = new Person(scanner, "TestName", "TestSurname");
        person2.setBirthYear(2002);
        person2.output();

        Person person3 = new Person(scanner);
        person3.input();
        System.out.println("Age of the person: " + person3.getAge());

        Person person4 = new Person(scanner);
        person4.input();
        person4.changeName("ChangeName", "ChangeSurname");
        person4.output();

        Person person5 = new Person(scanner);
        person5.setFirstName("SetterName");
        person5.setLastName("SetterSurname");
        person5.setBirthYear(1998);
        System.out.println(person5.getFirstName() + " " +
                person5.getLastName() + " " +
                person5.getBirthYear());

        scanner.close();
    }
}
