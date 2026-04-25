package module4_Kateryna.practical_tasks;

public enum TheDayOfTheWeek {
    MONDAY("Понеділок", "Monday"),
    TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"),
    THURSDAY("Четвер", "Thursday"),
    FRIDAY("П'ятниця", "Friday"),
    SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");

    private final String uaName;
    private final String engName;

    TheDayOfTheWeek(String uaName, String engName) {
        this.uaName = uaName;
        this.engName = engName;
    }

    public String getEngName() {
        return engName;
    }

    public String getUaName() {
        return uaName;
    }

    public static TheDayOfTheWeek getNumber(int number) {
        return switch (number) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalArgumentException("There are only seven days in the week");
        };
    }
}
