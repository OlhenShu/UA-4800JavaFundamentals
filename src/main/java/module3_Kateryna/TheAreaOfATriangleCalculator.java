package module3_Kateryna;

import java.util.Scanner;

import static java.lang.System.in;

public class TheAreaOfATriangleCalculator {
    public static void main(String[] args) {
        int first = getNumber("Input Side 1: ");
        int second = getNumber("Input Side 2: ");
        int third = getNumber("Input Side 3: ");
        double areaOfTheTriangle = getAreaOfTheTriangle(first, second, third);
        System.out.printf("The area of the triangle is %.2f", areaOfTheTriangle);
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scan = new Scanner(in);
        return scan.nextInt();
    }

    private static double getAreaOfTheTriangle(int first, int second, int third) {
        double semiperimeter = (first + second + third) / 2.0;
        return Math.sqrt(semiperimeter * (semiperimeter - first)
                * (semiperimeter - second)
                * (semiperimeter - third));
    }



}
