package com.softserve.academy.module4.optional;

import java.util.Scanner;

public class Faculty {
    enum Season {

        WINTER("Winter", "Winter Exam Session"),
        SPRING("Spring", "Second Semester"),
        SUMMER("Summer", "Summer Break"),
        AUTUMN("Autumn", "First Semester");

        Season(String season, String examSession) {
            this.season = season;
            this.examSession = examSession;
        }

        private String season;
        private String examSession;

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getExamSession() {
            return examSession;
        }

        public void setExamSession(String examSession) {
            this.examSession = examSession;
        }
    }

    private String name;
    private int numberOfStudents;
    private Season season;

    public Faculty(){}

    public Faculty(String name, int numberOfStudents, Season season) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Name of faculty: " + name + "\n" +
                "Number of students: " + numberOfStudents + "\n" +
                "Season: " + season.getSeason() + "\n" +
                "Academic period: " + season.getExamSession();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter faculty name:");
        String name = scanner.nextLine();
        System.out.println("Enter number of students:");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter season (WINTER, SPRING, SUMMER, AUTUMN):");
        String seasonInput = scanner.next().toUpperCase();
        Faculty faculty = new Faculty(name, numberOfStudents, Season.valueOf(seasonInput));
        System.out.println(faculty);
    }
}
