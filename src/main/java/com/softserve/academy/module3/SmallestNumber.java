package com.softserve.academy.module3;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        SmallestNumber smallestNumber = new SmallestNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = scanner.nextInt();
        System.out.print("Input the second number: ");
        int b = scanner.nextInt();
        System.out.print("Input the third number: ");
        int c = scanner.nextInt();
        int result = smallestNumber.smallestNumberOutThree(a, b, c);
        System.out.println("The smallest number is " + result);
    }

    public int smallestNumberOutThree(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}
