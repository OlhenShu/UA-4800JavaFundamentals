package com.softserve.academy.module1;

import java.util.Scanner;

/**
 * The DialogExample class is a simple Java program that demonstrates a user-interactive
 * console application using standard input and output. It prompts the user to enter
 * their name and age and then displays a personalized greeting and acknowledgment.
 *
 * The program makes use of the Scanner class to read input from the console.
 * It performs the following steps:
 * 1. Greets the user and asks for their name.
 * 2. Prompts the user to enter their age.
 * 3. Prints a personalized greeting and a remark about their age.
 *
 * This class serves as an introduction to basic console I/O operations in Java.
 */
public class DialogExample {
    public static void main(String[] args) {
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
