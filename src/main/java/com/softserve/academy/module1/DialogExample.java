package com.softserve.academy.module1;

import java.util.Scanner;

public class DialogExample {
    public static void main(String[] args) {

        double pi = Math.PI;
        double perimeter = pi * 10;
        System.out.println(perimeter);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! \nWhat is your name?");
        String userName = scanner.nextLine();
        System.out.println("Wow!\nHow old are you?");
        int ageUser = scanner.nextInt();

        System.out.println("Nice to meet you " + userName);
        System.out.println("Your age " + ageUser + " is cool!");

        scanner.close();
    }
}
