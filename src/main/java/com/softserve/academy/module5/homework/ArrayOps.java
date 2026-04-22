package com.softserve.academy.module5.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayOps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        int[] arr = IntStream.range(0, 5).map(i -> scanner.nextInt()).toArray();

        int secondPositive = Arrays.stream(arr).filter(x -> x > 0).skip(1).findFirst().orElse(Integer.MIN_VALUE);
        System.out.println("Second positive number: " + (secondPositive != Integer.MIN_VALUE ? secondPositive : "No second positive number found."));

        int minIndex = IntStream.range(0, arr.length).boxed().min(Comparator.comparingInt(i -> arr[i])).orElse(-1);
        System.out.println("Index with smallest number is " + minIndex + " and the number " + arr[minIndex]);

        int sum = Arrays.stream(arr).filter(x -> x % 2 == 0).filter(x -> x != 0).reduce(1, (a, b) -> a * b);
        System.out.println("Product of even numbers (excluding zero): " + sum);

        scanner.close();
    }

}
