package com.softserve.academy.module5.pracTask;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayTaskMedium {

    public static void main(String[] args) {

        int[] number = IntStream.generate(() -> new Random().nextInt(200) - 100).limit(10).toArray();
        System.out.println("Generated array: " + Arrays.toString(number));
        System.out.println("Biggest number is: " + Arrays.stream(number).max().orElse(Integer.MIN_VALUE));
        System.out.println("Sum of positive number: " + Arrays.stream(number).filter(x -> x > 0).sum());
        System.out.println("Count of negative number: " + Arrays.stream(number).filter(x -> x < 0).count());
        int negCount = (int) Arrays.stream(number).filter(x -> x < 0).count();
        int posCount = (int) Arrays.stream(number).filter(x -> x > 0).count();
        if (posCount > negCount){
            System.out.println("There are more positive values in the array.");
        } else if (negCount > posCount) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

}
