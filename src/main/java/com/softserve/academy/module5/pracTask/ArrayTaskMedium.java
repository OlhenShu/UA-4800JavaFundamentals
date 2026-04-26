package com.softserve.academy.module5.pracTask;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayTaskMedium {

    public static int biggestNumber(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    public static int sumOfPositive(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }

    public static long countNegative(int[] arr) {
        return Arrays.stream(arr).filter(x -> x < 0).count();
    }

    public static String comparePositions(int[] arr) {
        int negCount = (int) Arrays.stream(arr).filter(x -> x < 0).count();
        int posCount = (int) Arrays.stream(arr).filter(x -> x > 0).count();
        if (posCount > negCount){
            return "There are more positive values in the array.";
        } else if (negCount > posCount) {
            return "There are more negative values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }

    public static void main(String[] args) {

        int[] numbers = IntStream.generate(() -> new Random().nextInt(200) - 100).limit(10).toArray();
        System.out.println("Generated array: " + Arrays.toString(numbers));
        System.out.println("Biggest number is: " + biggestNumber(numbers));
        System.out.println("Sum of positive number: " + sumOfPositive(numbers));
        System.out.println("Count of negative number: " + countNegative(numbers));
        System.out.println(comparePositions(numbers));
    }

}
