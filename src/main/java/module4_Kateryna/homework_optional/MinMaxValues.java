package module4_Kateryna.homework_optional;

import java.util.Scanner;

public class MinMaxValues {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1 = SCANNER.nextInt();
        System.out.print("Enter second number: ");
        int num2 = SCANNER.nextInt();
        System.out.print("Enter third number: ");
        int num3 = SCANNER.nextInt();

        System.out.println("The minimum value is " + minNumber(num1, num2, num3));
        System.out.println("The maximum value is " + maxNumber(num1, num2, num3));
    }

    public static int minNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static int maxNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
