package module4_Kateryna.practical_tasks;

import java.util.Scanner;

import static java.lang.System.in;

public class OddNumberCounter {
    private static final Scanner SCANNER = new Scanner(in);

    public static double getNumber(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextDouble();
    }

    public static void main(String[] args) {
        double first = getNumber("Enter first number: ");
        double second = getNumber("Enter second number: ");
        double third = getNumber("Enter third number: ");

        /*
        To add variety to the task, it has been made possible to round off values
        if the user enters a decimal number
         */
        int count = 0;
        if ((int) Math.round(first) % 2 != 0) count++;
        if ((int) Math.round(second) % 2 != 0) count++;
        if ((int) Math.round(third) % 2 != 0) count++;

        System.out.print("The result of how many of numbers are odd: " + count);
    }
}
