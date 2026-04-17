package module3_Kateryna;

import java.util.Scanner;

import static java.lang.System.in;

public class TheSmallestNumber {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        int first = getNumber("Input the first number: ");
        int second = getNumber("Input the second number: ");
        int third = getNumber("Input the third number: ");
        System.out.print("The smallest number is " + getTheSmallestNumber(first, second, third));
    }

    public static int getNumber(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextInt();
    }

    public static int getTheSmallestNumber(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }
}
