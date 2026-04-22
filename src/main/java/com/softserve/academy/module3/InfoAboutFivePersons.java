package com.softserve.academy.module3;

import java.util.Scanner;

import static java.lang.System.in;

public class InfoAboutFivePersons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        Person person1 = new Person ();
        person1.setFirstName("Taras");
        person1.setLastName("Myskevych");
        person1.setBirthYear(1995);
        person1.printInfo1();

        Person person2 = new Person();
        person2.input("Ihor", "Vavryk",1996 );
        System.out.println(person2.printInfo());


        Person person3 = new Person();
        person3.setFirstName("Roman");
        person3.setLastName("Petrenko");
        person3.setBirthYear(1994);
        person3.printInfo1();


        Person person4 = new Person();
        person4.setFirstName("Oleh");
        person4.setLastName("Yalm");
        person4.setBirthYear(1999);
        person4.changeName("Yura", "Ivanov"); // replace name with new first and last name
        person4.printInfo1();

        Person person5 = new Person ();
        System.out.print("\n"+"First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("Birth year: ");
        int birthYear = scan.nextInt();
        person5.input(firstName,lastName,birthYear);
        person5.printInfo1();

    }


}
