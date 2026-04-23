package com.softserve.academy.module5;

import java.util.Scanner;

public class WhileExample {
    static Scanner scanner = new Scanner(System.in);
    static final int END = 5;

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int i = scanner.nextInt();

        while (i <= END) {
            System.out.println("Value of number is: " + i);
            i++;
        }

        System.out.println("Exited the loop. Final value of number is: " + i);

        int j = scanner.nextInt();
        do {
            System.out.println("Value of number is: " + j);
            j++;
        } while (j <= END);
        System.out.println("Exited the do-while loop. Final value of number is: " + j);

        scanner.close();
    }
}
