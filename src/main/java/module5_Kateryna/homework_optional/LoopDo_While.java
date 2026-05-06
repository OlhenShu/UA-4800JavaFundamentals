package module5_Kateryna.homework_optional;

import java.util.Scanner;

import static java.lang.System.in;

public class LoopDo_While {

    public static double calculateSum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        boolean positiveAnswer = true;
        do {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine();
            double sumOfNums = calculateSum(num1, num2);
            System.out.println("Sum of numbers: " + sumOfNums);
            System.out.println("Do you want to perform the operation again? (yes/no)");
            String answer = scanner.nextLine();
            positiveAnswer = answer.equalsIgnoreCase("yes");
        } while (positiveAnswer);

        scanner.close();
    }
}
