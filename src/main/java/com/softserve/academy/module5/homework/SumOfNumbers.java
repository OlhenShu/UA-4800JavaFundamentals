package com.softserve.academy.module5.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] arr = IntStream.range(0, 10).map(i -> scanner.nextInt()).toArray();

        boolean firstFiveMatch = Arrays.stream(arr, 0, 5).allMatch(x -> x > 0);

        if (firstFiveMatch) {
            int sum = Arrays.stream(arr, 0, 5).sum();
            System.out.println("Sum of the first five numbers: " + sum);
        } else {
            int product = Arrays.stream(arr, 5, 10).reduce(1, (a, b) -> a * b);
            System.out.println("Product of the last five numbers: " + product);
        }

        scanner.close();
    }

}
