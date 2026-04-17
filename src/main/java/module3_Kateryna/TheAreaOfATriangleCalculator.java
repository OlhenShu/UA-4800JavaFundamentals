package module3_Kateryna;

import java.util.Scanner;

import static java.lang.System.in;

public class TheAreaOfATriangleCalculator {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        double first = getNumber("Input Side 1: ");
        double second = getNumber("Input Side 2: ");
        double third = getNumber("Input Side 3: ");
        System.out.printf("The area of the triangle is %.2f", getAreaOfTheTriangle(first, second, third));
    }

    public static double getNumber(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextDouble();
    }

    public static double getAreaOfTheTriangle(double first, double second, double third) {
        double semiperimeter = (first + second + third) / 2.0;
        return Math.sqrt(semiperimeter * (semiperimeter - first)
                * (semiperimeter - second)
                * (semiperimeter - third));
    }
}
