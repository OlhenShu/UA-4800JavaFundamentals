package com.softserve.academy.module5;

/**
 * This class demonstrates various operations on an array
 * of integers, including calculating the sum and product
 * of elements, counting negative and even numbers, finding
 * the maximum and minimum values, sorting the array using
 * bubble sort, and reversing the array.
 */
public class OperationsInArray {
    public static void main(String[] args) {
        int[] array = {-1, 12, -33, 4, 25, 171, -7, 81, 29, 10};

        System.out.println("Sum of all elements: " + calculateSum(array));
        System.out.println("Product of positive elements: " + calculateProductOfPositive(array));
        System.out.println("Count of negative elements: " + countNegative(array));
        System.out.println("Count of even elements: " + countEven(array));
        System.out.println("Count of elements greater than 10 and less than 100: " + countInRange(array, 10, 100));
        System.out.println("Maximum element: " + findMax(array));
        System.out.println("Minimum element: " + findMin(array));

        bubbleSort(array);
        System.out.print("Sorted array: ");
        printArray(array);

        int[] reversedArray = reverseArray(array);
        System.out.print("Reversed array: ");
        printArray(reversedArray);
    }

    /**
     * Calculates the sum of all elements in the given array.
     *
     * @param array the array of integers to calculate the sum for
     * @return the sum of all elements in the array
     */
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    /**
     * Calculates the product of all positive elements in the given array.
     *
     * @param array
     * @return
     */
    public static int calculateProductOfPositive(int[] array) {
        int product = 1;
        for (int j : array) {
            if (j > 0) {
                product *= j;
            }
        }
        return product;
    }

    /**
     * Counts the number of negative elements in the given array.
     *
     * @param array
     * @return
     */
    public static int countNegative(int[] array) {
        int countNegative = 0;
        for (int j : array) {
            if (j < 0) {
                countNegative++;
            }
        }
        return countNegative;
    }

    /**
     * Counts the number of even elements in the given array.
     *
     * @param array
     * @return
     */
    public static int countEven(int[] array) {
        int countEven = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    /**
     * Counts the number of elements in the given array that are greater than a specified minimum and less than a specified maximum.
     *
     * @param array the array of integers to count elements from
     * @param min   the minimum value (exclusive) for counting elements
     * @param max   the maximum value (exclusive) for counting elements
     * @return the count of elements in the array that are greater than min and less than max
     */
    public static int countInRange(int[] array, int min, int max) {
        int amount = 0;
        for (int j : array) {
            if (j > min && j < max) {
                amount++;
            }
        }
        return amount;
    }

    /**
     * Finds the maximum element in the given array.
     *
     * @param array the array of integers to find the maximum element from
     * @return the maximum element in the array
     */

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Finds the minimum element in the given array.
     *
     * @param array the array of integers to find the minimum element from
     * @return the minimum element in the array
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Sorts the given array of integers in ascending order using the bubble sort algorithm.
     *
     * @param array the array of integers to be sorted
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     *  Reverses the given array of integers and returns a new array containing the reversed elements.
     * @param array the array of integers to be reversed
     * @return a new array containing the elements of the input array in reverse order
     */
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
    /**
     * Prints the elements of the given array of integers to the console, separated by spaces.
     *
     * @param array the array of integers to be printed
     */
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
