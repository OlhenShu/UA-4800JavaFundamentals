package module5_Kateryna.homework_optional;

import java.util.Scanner;

import static java.lang.System.in;

public class DaysInMonth {
    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.print("Enter a month number (from 1 to 12): ");
        int numberOfMonth = scanner.nextInt();
        if ((numberOfMonth >= 1) && (numberOfMonth <= 12)) {
            System.out.println("In this month " + DAYS[numberOfMonth - 1] + " days");
        } else {
            System.out.println("There is no month with that number");
        }
        scanner.close();
    }
}
