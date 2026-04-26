package com.softserve.academy.module5.pracTask;

import java.util.Scanner;

public class PrimeArray {

    public static void main(String[] args) {
        System.out.print("Enter random number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("Is a prime number.");
        } else {
            System.out.println("Is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
