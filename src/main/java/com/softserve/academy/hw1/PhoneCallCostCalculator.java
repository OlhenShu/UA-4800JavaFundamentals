package com.softserve.academy.hw1;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double c1 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double c3 = sc.nextDouble();

        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        double t3 = sc.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double total = cost1 + cost2 + cost3;

        System.out.println("cost1 = " + cost1 + " cost2 = " + cost2 + " cost3 = " + cost3);
        System.out.println("total cost = " + total);
    }

}
