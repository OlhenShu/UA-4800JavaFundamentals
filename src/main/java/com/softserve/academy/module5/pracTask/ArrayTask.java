package com.softserve.academy.module5.pracTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayTask {

    public static String[] sortStrings(String[] strings) {
        Arrays.sort(strings);
        return strings;
    }

    public static double average(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    public static String checkValue(String input, int[] numbers, String[] strings) {
        boolean existsInNumberArray = false;
        if (isInteger(input)) {
            int intValue = Integer.parseInt(input);
            existsInNumberArray = Arrays.stream(numbers).anyMatch(x -> x == intValue);
        }
        if (existsInNumberArray && Arrays.asList(strings).contains(input)) {
            return "Value exists in both arrays.";
        } else if (existsInNumberArray || Arrays.asList(strings).contains(input)) {
            return "Value exists in one of the arrays.";
        } else {
            return "Value does not exist in any of the arrays.";
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Array", "Task", "Sort", "String", "First", "12"};
        Arrays.sort(strings);
        System.out.println("Sorted array: " + Arrays.toString(sortStrings(strings)));

        int[] numbers = IntStream.generate(() -> (int) (Math.random() * 100)).limit(5).toArray();
        System.out.println("Generated array: " + Arrays.toString(numbers));
        System.out.println("Average value: " + average(numbers));

        System.out.println("Enter value to check if it exist in previous arrays: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(checkValue(input, numbers, strings));
        scanner.close();

    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
