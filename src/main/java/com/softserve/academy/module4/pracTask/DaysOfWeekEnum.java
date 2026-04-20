package com.softserve.academy.module4.pracTask;

import java.util.Scanner;

public class DaysOfWeekEnum {

    enum Day {
        MONDAY("Monday", "Понеділок"),
        TUESDAY("Tuesday", "Вівторок"),
        WEDNESDAY("Wednesday", "Середа"),
        THURSDAY("Thursday", "Четвер"),
        FRIDAY("Friday", "П’ятниця"),
        SATURDAY("Saturday", "Субота"),
        SUNDAY("Sunday", "Неділя");

        private String englishName;
        private String ukrainianName;

        Day(String englishName, String ukrainianName) {
            this.englishName = englishName;
            this.ukrainianName = ukrainianName;
        }

        public String getEnglishName() {
            return englishName;
        }

        public String getUkrainianName() {
            return ukrainianName;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week in English:");
        int input = scanner.nextInt();
        if (input < 1 || input > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            return;
        } else {
            Day day = Day.values()[input - 1];
            System.out.println("Day in English: " + day.getEnglishName());
            System.out.println("Day in Ukrainian: " + day.getUkrainianName());
        }

    }
}
