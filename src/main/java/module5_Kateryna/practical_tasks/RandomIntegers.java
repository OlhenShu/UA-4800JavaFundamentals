package module5_Kateryna.practical_tasks;

import java.util.Arrays;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers(10);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Max number: " + maxNumber(randomNumbers));
        System.out.println("Sum of numbers: " + sumOfPositiveNumbers(randomNumbers));
        System.out.println("Count of negative numbers: " + countOfNegativeNumbers(randomNumbers));
        compareNumbers(randomNumbers);
    }

    /*
    Creating an array of ten random integers using a random number generator
     */
    public static int[] generateRandomNumbers(int quantity) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(-100, 100);
        }
        return randomNumbers;
    }

    /*
    The biggest number in the array
     */
    public static int maxNumber(int[] randomNumbers) {
        int max = randomNumbers[0];
        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        return max;
    }

    /*
    The sum of positive numbers
     */
    public static long sumOfPositiveNumbers(int[] randomNumbers) {
        int sum = 0;
        for (int number : randomNumbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    /*
    Count the number of negative numbers
     */
    public static int countOfNegativeNumbers(int[] randomNumbers) {
        int count = 0;
        for (int number : randomNumbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }

    /*
    Count the number of positive numbers
     */
    public static int countOfPositiveNumbers(int[] randomNumbers) {
        int count = 0;
        for (int number : randomNumbers) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    /*
    Determine whether there are more negative or positive values in the array
     */
    public static void compareNumbers(int[] randomNumbers) {
        int countNegativeNumbers = countOfNegativeNumbers(randomNumbers);
        int countPositiveNumbers = countOfPositiveNumbers(randomNumbers);
        if (countNegativeNumbers > countPositiveNumbers) {
            System.out.println("There are more negative values in the array");
        } else if (countPositiveNumbers > countNegativeNumbers) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }
}
