package com.softserve.academy.module5;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {2, -5, -4, 7, 8};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        System.out.print("Sorted array: " + arr);
    }
}
