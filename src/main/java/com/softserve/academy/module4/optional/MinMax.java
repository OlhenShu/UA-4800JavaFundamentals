package com.softserve.academy.module4.optional;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        MinMax minMax = new MinMax();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        minMax.findMinMax(a, b, c);
    }

    public void findMinMax(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
