package com.softserve.academy.module5.homework;

import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean doContinue = true;
        do {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            System.out.print("Do you want to continue? (yes/no): ");
            String answer = scanner.next();
            doContinue = answer.equalsIgnoreCase("yes");
        } while (doContinue);

        scanner.close();

    }

}
