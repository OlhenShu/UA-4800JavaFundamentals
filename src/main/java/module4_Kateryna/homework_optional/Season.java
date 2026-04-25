package module4_Kateryna.homework_optional;

public enum Season {
    WINTER("Winter", "Winter Exam Session"),
    SPRING("Spring", "Second Semester"),
    SUMMER("Summer", "Summer Break"),
    AUTUMN("Autumn", "First Semester");

    private final String nameOfSeason;
    private final String theAcademicPeriod;

    Season(String nameOfSeason, String theAcademicPeriod) {
        this.nameOfSeason = nameOfSeason;
        this.theAcademicPeriod = theAcademicPeriod;
    }

    public String getNameOfSeason() {
        return nameOfSeason;
    }

    public String getTheAcademicPeriod() {
        return theAcademicPeriod;
    }
}
