package com.softserve.academy.module3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.input("John", "Doe", 1990);
        person.output();
        System.out.println();

        person.setFirstName("Dima");
        person.setBirthYear(2002);
        System.out.println(person);
        System.out.println();

        Person person1 = new Person("Jane", "Smith");
        person1.output();
        System.out.println();

        System.out.println(person.getAge(person.getBirthYear()));
        System.out.println(person1.getAge(person1.getBirthYear()));     //too lazy to make some kind of exception
        System.out.println();

        person.changeName("Dmitry", "Ivanov");
        System.out.println(person);
        System.out.println();

        person1.changeName("", "Jonson");
        System.out.println(person1);
        System.out.println();

        person.changeName("", "");
        System.out.println(person);
        System.out.println();

        person.changeName("Dmitry", "Ivanov");
        System.out.println();

        Person person2 = new Person();
        person2.setFirstName("Ivan");
        person2.setLastName("Ivanov");
        person2.setBirthYear(1985);
        person2.output();
        System.out.println();

        Person person3 = new Person("Boris", "Boris2");
        System.out.println(person3);
        System.out.println();

        Person person4 = new Person();
        System.out.println(person4);

    }
}
