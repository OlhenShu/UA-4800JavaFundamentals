package module4_Kateryna.practical_tasks;

import java.util.Scanner;

import static java.lang.System.in;

public class TheNameOfContinent {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        Continent continent;
        System.out.print("Input the name of the country: ");
        String country = SCANNER.nextLine();
        continent = switch (country) {
            case "Armenia", "China", "India" -> Continent.ASIA;
            case "Nigeria", "Kenya", "Sudan" -> Continent.AFRICA;
            case "Cuba", "Belize", "Haiti" -> Continent.NORTH_AMERICA;
            case "Argentina", "Brazil", "Ecuador" -> Continent.SOUTH_AMERICA;
            case "Ukraine", "France", "Spain" -> Continent.EUROPE;
            case "Australia" -> {
                System.out.println("The entire mainland is a single country");
                yield Continent.AUSTRALIA;
            }
            case "Antarctica" -> {
                System.out.println("Antarctica does not belong to any country");
                yield Continent.ANTARCTICA;
            }
            default -> throw new IllegalArgumentException("Country " + country + " not found");
        };

        System.out.println("Continent " + continent);
    }
}
