package com.softserve.academy.module4.practical;

import java.util.Scanner;


import static java.lang.System.in;

public class PracticalTask02DaysOfWeek {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.println("Enter the number of a day of a week: ");
        int dayNumber = SCANNER.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.getNumber(dayNumber);
        System.out.println("Your number corresponds to :  " + dayOfWeek.englishName);
        System.out.println("Ваш номер відповідає такому дню тижня : " + dayOfWeek.ukrainianName);
    }


    enum DayOfWeek {
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "П'ятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");

        public final String englishName;
        public final String ukrainianName;

        DayOfWeek(String englishName, String ukrainianName) {
            this.englishName = englishName;
            this.ukrainianName = ukrainianName;
        }

        public static DayOfWeek getNumber(int number) {
            return switch (number) {
                case 1 -> MONDAY;
                case 2 -> TUESDAY;
                case 3 -> WEDNESDAY;
                case 4 -> THURSDAY;
                case 5 -> FRIDAY;
                case 6 -> SATURDAY;
                case 7 -> SUNDAY;
                default -> throw new IllegalArgumentException(
                        "Invalid number:К " + number + " Just 1-7");
            };
        }
    }
}

