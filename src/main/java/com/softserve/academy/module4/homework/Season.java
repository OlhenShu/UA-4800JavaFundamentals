package com.softserve.academy.module4.homework;

public enum Season {
    WINTER("Winter", "Winter Exam Session"),
    SPRING("Spring", "Second Semester" ),
    SUMMER("Summer", "Summer Break" ),
    AUTUMN("Autumn", "First Semester" ),
    ;

    private final String englishName;
    private final String  academicPeriod;

    Season(String englishName, String academicPeriod) {
        this.englishName = englishName;
        this.academicPeriod = academicPeriod;
    }

    public String getAcademicPeriod() {
        return academicPeriod;
    }

    public String getEnglishName() {
        return englishName;
    }
}
