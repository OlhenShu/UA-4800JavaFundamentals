package com.softserve.academy.module4.homework;

public class ThreeNumbers {

    public static String checkNumberInRangeAndParity(int number, int lowerBound, int upperBound) {
        if (number < lowerBound || number > upperBound) {
            return ("The number: " + number +
                    " is out of the range" + "[" + lowerBound + "]" +
                    "[" + upperBound + "]" + "\"");
        }
        if (number % 2 == 0) {
            return ("The number: " + number + " is even");
        } else {
            return ("The number: " + number + " is odd");
        }
    }

    public static void main(String[] args) {
        String num1 = (checkNumberInRangeAndParity(10, 5, 20));
        String num2 = (checkNumberInRangeAndParity(15, 5, 20));
        String num3 = (checkNumberInRangeAndParity(25, 5, 20));
        String num4 = (checkNumberInRangeAndParity(50, 5, 20));

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }


}

