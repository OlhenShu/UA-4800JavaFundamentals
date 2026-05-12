package com.softserve.academy.module4.homework;


import java.util.Scanner;


public class Faculty {
    final static Scanner SCANNER = new Scanner(System.in);
    private final String nameOfFaculty;
    private final int numbersOfStudents;
    private final Season season;

    public Faculty(String nameOfFaculty, int numbersOfStudents, Season season) {
        this.nameOfFaculty = nameOfFaculty;
        this.numbersOfStudents = numbersOfStudents;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty:" + nameOfFaculty + '\n'
                + "numbersOfStudents: " + numbersOfStudents + '\n'
                + "name of the season: " + season.getEnglishName() + '\n'
                + "corresponding academic period: " + season.getAcademicPeriod();
    }

    public static void main(String[] args) {
        System.out.println("ENTER THE FACULTY NAME: ");
        String nameOfFaculty =  SCANNER.nextLine();
        System.out.println("ENTER THE NUMBERS OF STUDENTS THIS FACULTY: ");
        int numbersOfStudents = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("ENTER THE SEASON FOR THE FACULTY (winter, spring, summer, autumn: ");
        String season = SCANNER.nextLine();


        Faculty faculty1 = new Faculty(nameOfFaculty, numbersOfStudents, Season.valueOf(season.toUpperCase()));
        System.out.println(faculty1);
    }

}
