package com.softserve.academy.module5.homework;

import java.util.Scanner;

public class GuessNumber {

    private final int numberToGuess;

    public GuessNumber(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public void play(Scanner scanner) {
        int userGuess = 0;
        boolean isFalse = true;
        System.out.println("Guess number from 1 to 100");

        while (isFalse) {
            userGuess = scanner.nextInt();
            if (userGuess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number!");
                isFalse = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        new GuessNumber(numberToGuess).play(scanner);
        scanner.close();
    }

}
