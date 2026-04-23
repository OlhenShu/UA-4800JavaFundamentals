package com.softserve.academy.module4;

public class ConditionsExample {
    public static void main(String[] args) {
        int a = 57;
        int b = 24;

        if (a > 50 | (b = 72) < 50) {
            System.out.println("Do something...");
        }
        System.out.println("Variable 'a' = " + a);
        System.out.println("Variable 'b' = " + b);


//        int a = 0;
//        if (a < 0) {
//            System.out.println("a is negative from first block");
//        }
//        if (a > 0 || a == 0) {
//            System.out.println("a is positive from second block");
//        }
//        if (a == 0) {
//            System.out.println("a is negative from third block");
//        }
//        System.out.println("This line will always be printed");
    }
}
