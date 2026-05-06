package module5_Kateryna.homework_optional;

import java.util.Scanner;

import static java.lang.System.in;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] nums = new int[5];

        System.out.println("---5 integer numbers---");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        /*
        Position of second positive number
         */
        int countPositive = 0;
        int indexSecondPosNum = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                countPositive++;
                if (countPositive == 2) {
                    indexSecondPosNum = i;
                    break;
                }
            }
        }

        if (indexSecondPosNum != -1) {
            System.out.println("Index of the second positive number: " + indexSecondPosNum);
        } else {
            System.out.println("The second positive number not found");
        }

        /*
        Minimum value and its position in the array
         */
        int minNumber = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNumber) {
                minNumber = nums[i];
                index = i;
            }
        }

        System.out.println("Minimum value: " + minNumber);
        System.out.println("Position of minimum value: " + index);

        /*
        Calculate the product of all entered even numbers (exclude 0 from even if entered by user)
         */
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2 == 0) && (nums[i] != 0)) {
                product *= nums[i];
            }
        }

        System.out.println("The product of all entered even numbers: " + product);

        scanner.close();
    }
}
