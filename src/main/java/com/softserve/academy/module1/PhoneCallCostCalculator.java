package com.softserve.academy.module1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome! Let's count how much your calls cost. ");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter the cost per minute for the first call : ");
        double c1 = sc.nextDouble();
        System.out.println("Please enter the cost per minute for the second call : ");
        double c2 = sc.nextDouble();
        System.out.println("Please enter the cost per minute for the third call : ");
        double c3 = sc.nextDouble();

        System.out.println("\nThanks for your answers");
        System.out.println("\nHow long does first call take?: ");
        double t1 = sc.nextDouble();

        System.out.println("How long does second call take?: ");
        double t2 = sc.nextDouble();
        System.out.println("How long does third call take?: ");
        double t3 = sc.nextDouble();

        System.out.println("\nThanks for your answers. \n\nWe are counting how much all your calls cost.");

        double cost1 = c1 * t1;
        System.out.println("First call cost: " + "[" + cost1 + "]");
        double cost2 = c2 * t2;
        System.out.println("Second call cost: " + "[" + cost2 + "]");
        double cost3 = c3 * t3;
        System.out.println("Third call cost: " + "[" + cost3 + "]");

        double totalCost = cost1 + cost2 + cost3;
        System.out.println("\n\tTOTAL COST: " + "[" + totalCost + "]");
        sc.close();
    }
}