package com.softserve.academy.module5;

public class Person {

    private String firstName;
    private int age;

    public Person(String name, int age) {
        this.firstName = name;
        this.age = age;
    }
    public String getName() {
        return firstName;
    }

    public int getAge() {
        return 2026- age;
    }
}

class PersonSortExample {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30),
                new Person("David", 20),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        System.out.println("People sorted by age:");
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
