package com.softserve.academy.module3;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        SmallestNumber smallestNumber = new SmallestNumber();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input the first number: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Input the second number: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.print("Input the third number: ");
            int c = Integer.parseInt(scanner.nextLine());
            int result = smallestNumber.smallestNumberOutThree(a, b, c);
            System.out.println("The smallest number is " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
    }

    public int smallestNumberOutThree(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}
