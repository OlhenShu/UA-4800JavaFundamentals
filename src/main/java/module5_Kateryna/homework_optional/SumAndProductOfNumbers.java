package module5_Kateryna.homework_optional;

import java.util.Scanner;

import static java.lang.System.in;

public class SumAndProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] numbers = new int[10];

        System.out.println("---10 integer numbers---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            System.out.println("The sum of the first 5 numbers: " + sum);
        } else {
            long product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("The product of the last 5 numbers: " + product);
        }

        scanner.close();
    }
}