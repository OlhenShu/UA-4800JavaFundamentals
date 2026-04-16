package com.softserve.academy.module3;

import static com.softserve.academy.module3.TheBiggerNumber.getBiggerNumber;
import static com.softserve.academy.module3.TheBiggerNumber.getNumber;

public class NumberDemo {
    public static void main(String[] args) {
        int firstNumber = getNumber("Enter the first number:");
        int secondNumber = getNumber("Enter the second number:");
        int thirdNumber = getNumber("Enter the third number:");

        System.out.println("The bigger number is: " + getBiggerNumber(firstNumber, secondNumber, thirdNumber));
    }
}
