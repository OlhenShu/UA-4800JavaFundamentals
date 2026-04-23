package com.softserve.academy.module5;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        double[] numbers = new double[6];
        numbers[0] = 10;
        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
        numbers[5] = 15;
        System.out.println("Element at index 5: " + numbers[5]);

        Object[] objects = new Object[3];
        objects[0] = "Hello";
        objects[1] = 123;
        objects[2] = 45.67;
        System.out.println("Element at index 0: " + objects[0]);
        System.out.println("Element at index 1: " + objects[1]);
        System.out.println("Element at index 2: " + objects[2]);

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Element at index 1: " + names[1]);
        System.out.println("Length of names array: " + names.length);
        System.out.println("Names array: " + Arrays.toString(names));

        for (int i = 1; i < names.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        for (double number : numbers) {
            System.out.println("Number: " + number);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Element at row 1, column 2: " + matrix[0][1]);
        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        int[][][] cube = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };
        System.out.println("Element at layer 1, row 2, column 1: " + cube[0][1][0]);
        System.out.println("Cube: " + Arrays.deepToString(cube));

        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Element at row 2, column 1: " + jaggedArray[1][0]);
        System.out.println("Jagged Array: " + Arrays.deepToString(jaggedArray));

        int[][] table = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };//new int[2][];
        for (int i = 0; i < table.length; i++) {
            System.out.println("Length of row " + i + ": " + table[i].length);
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = i + j;
                System.out.println("Element at row " + i + ", column " + j + ": " + table[i][j]);
            }
        }

    }
}
