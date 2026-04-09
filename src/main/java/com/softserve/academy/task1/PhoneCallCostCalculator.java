package com.softserve.academy.task1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double c1,c2,c3, t1, t2, t3;

        System.out.println("Enter price per hour for each call:");
        c1 = scanner.nextDouble();
        c2 = scanner.nextDouble();
        c3 = scanner.nextDouble();

        System.out.println("Enter duration of each call:");
        t1 = scanner.nextDouble();
        t2 = scanner.nextDouble();
        t3 = scanner.nextDouble();

        double cost1, cost2, cost3;
        cost1 = c1 * t1;
        cost2 = c2 * t2;
        cost3 = c3 * t3;

        double totalCost;
        totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost1 = " + cost1 + "\nCost2 = " + cost2 + "\nCost3 = " + cost3);
        System.out.print("Total Cost = " + totalCost);

        scanner.close();
    }
}
