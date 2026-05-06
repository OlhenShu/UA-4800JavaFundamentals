package module5_Kateryna.homework_optional;

import java.util.Random;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;

        boolean isNotGuessedNumber = true;
        do {
            System.out.print("Enter a number between 1 and 100: ");
            int usersNumber = scanner.nextInt();
            if (usersNumber > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (usersNumber < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                isNotGuessedNumber = false;
                System.out.println("Congratulations! You've guessed the number!");
            }
        } while (isNotGuessedNumber);

        scanner.close();
    }
}