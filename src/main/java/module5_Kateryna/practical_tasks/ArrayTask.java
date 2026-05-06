package module5_Kateryna.practical_tasks;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Sorting the array
         */
        String[] fruits = {"Banana", "Pineapple", "Cherry", "Apple", "Blueberry"};
        Arrays.sort(fruits);
        System.out.println("Sorted array 'fruits': " + Arrays.toString(fruits));

        /*
        Calculating the average value
         */
        double[] numbers = {3, 1.2, 4.8, 2, 0.6};
        double sumOfNumbers = 0;
        for (double number : numbers) {
            sumOfNumbers += number;
        }
        double average = sumOfNumbers / numbers.length;
        System.out.println("The average value: " + average);

        /*
        Checking if the array contains the value
         */
        System.out.print("Enter the number (int or double): ");
        double enteredNumber = scanner.nextDouble();
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, enteredNumber);
        if (index >= 0) {
            System.out.println("The number is found in the array at index " + index);
        } else {
            System.out.println("The number is not found in the array");
        }

        scanner.close();
    }
}
