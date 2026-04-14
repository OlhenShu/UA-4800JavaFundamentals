package module3_Kateryna;

import java.util.Scanner;

import static java.lang.System.in;

public class TheSmallestNumber {
    public static void main(String[] args) {
        int first = getNumber("Input the first number: ");
        int second = getNumber("Input the second number: ");
        int third = getNumber("Input the third number: ");
        int theSmallestNumber = getTheSmallestNumber(first, second, third);
        System.out.print("The smallest number is " + theSmallestNumber);
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }

    private static int getTheSmallestNumber(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }
}
