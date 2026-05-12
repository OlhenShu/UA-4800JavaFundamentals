package com.softserve.academy.module4.homework;

import java.util.Scanner;

import static java.lang.System.in;

public class CoffeeMachine {
    final static Scanner scan = new Scanner(in);
    public static void main(String[] args) {
        System.out.println("Choose a coffee type: ");

        String coffee = scan.nextLine().toUpperCase();

        CoffeeType coffeeType = CoffeeType.valueOf(coffee);

        displayCoffeeChoice(coffeeType);
    }

    public static void displayCoffeeChoice(CoffeeType type) {
        System.out.println(type.message);
    }

    enum CoffeeType {

        ESPRESSO("You have chosen Espresso. Enjoy your strong coffee!"),
        AMERICANO("You have chosen Americano. Enjoy your smooth coffee!"),
        CAPPUCCINO("You have chosen Cappuccino. Enjoy your coffee with milk foam!"),
        LATTE("You have chosen Latte. Enjoy your creamy coffee!");

        public final String message;

        CoffeeType(String message) {
            this.message = message;
        }
    }
}