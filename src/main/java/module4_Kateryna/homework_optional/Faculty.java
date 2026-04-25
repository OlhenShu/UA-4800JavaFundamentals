package module4_Kateryna.homework_optional;

import java.util.Scanner;

public class Faculty {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String nameOfFaculty;
    private int numberOfStudents;
    private Season season;

    public Faculty(String nameOfFaculty, int numberOfStudents, Season season) {
        this.nameOfFaculty = nameOfFaculty;
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    @Override
    public String toString() {
        return "--- Faculty ---\n" +
                "The faculty name: " + nameOfFaculty + "\n" +
                "Number of students: " + numberOfStudents + "\n" +
                "Name of season: " + season.getNameOfSeason() + "\n" +
                "The academic period: " + season.getTheAcademicPeriod() + "\n";
    }

    public static void main(String[] args) {
        System.out.print("Enter the faculty name: ");
        String nameOfFaculty = SCANNER.nextLine();
        System.out.print("Enter the number of students: ");
        int numberOfStudents = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.print("Enter the current season (winter, spring, summer, autumn): ");
        String season = SCANNER.nextLine();

        Faculty faculty = new Faculty(nameOfFaculty, numberOfStudents, Season.valueOf(season.toUpperCase()));
        System.out.println(faculty);
    }
}

