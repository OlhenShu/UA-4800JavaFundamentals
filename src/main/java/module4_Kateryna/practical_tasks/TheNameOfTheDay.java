package module4_Kateryna.practical_tasks;

import java.util.Scanner;

import static java.lang.System.in;

public class TheNameOfTheDay {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.print("Input the number of the day of the week: ");
        int number = SCANNER.nextInt();
        TheDayOfTheWeek dayOfTheWeek = TheDayOfTheWeek.getNumber(number);
        System.out.println("The day of the week: " + dayOfTheWeek.getUaName() +
                " or " + dayOfTheWeek.getEngName());
    }
}
