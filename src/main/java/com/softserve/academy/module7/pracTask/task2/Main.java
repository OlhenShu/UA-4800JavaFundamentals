package com.softserve.academy.module7.pracTask.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<Person> personList = new ArrayList<>();
            personList.add(new Teacher("John"));
            personList.add(new Cleaner("Mike"));
            personList.add(new Student("Alice"));
            personList.add(new Student("Bob"));
            personList.add(new Teacher("Sarah"));
            for (Person person : personList) {
                if (person instanceof Staff) {
                    ((Staff) person).salary();
                }
                person.print();
                System.out.println("------------------");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
