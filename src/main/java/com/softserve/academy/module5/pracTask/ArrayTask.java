package com.softserve.academy.module5.pracTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayTask {

    public static void main(String[] args) {
        String[] strings = {"Array", "Task", "Sort", "String", "First", "12"};
        Arrays.sort(strings);
        System.out.println("Sorted array: " + Arrays.toString(strings));

        int[] number = IntStream.generate(() -> (int) (Math.random() * 100)).limit(5).toArray();
        System.out.println("Generated array: " + Arrays.toString(number));
        System.out.println("Average value: " + Arrays.stream(number).average().orElse(0));

        System.out.println("Enter value to check if it exist in previous arrays: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean existsInNumberArray = false;
        if (isInteger(input)) {
            int intValue = Integer.parseInt(input);
            existsInNumberArray = Arrays.stream(number).anyMatch(x -> x == intValue);
            System.out.println("Exists in number array: " + existsInNumberArray);
        } else {
            boolean existsInStringArray = Arrays.asList(strings).contains(input);
            System.out.println("Exists in string array: " + existsInStringArray);
        }
        if (existsInNumberArray && Arrays.asList(strings).contains(input)) {
            System.out.println("Value exists in both arrays.");
        } else if (existsInNumberArray || Arrays.asList(strings).contains(input)) {
            System.out.println("Value exists in one of the arrays.");
        } else {
            System.out.println("Value does not exist in any of the arrays.");
        }

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
