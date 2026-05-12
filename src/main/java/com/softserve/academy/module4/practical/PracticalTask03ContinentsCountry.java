package com.softserve.academy.module4.practical;

import java.util.Scanner;

import static java.lang.System.in;

public class PracticalTask03ContinentsCountry {
    private static final Scanner SCANNER = new Scanner(in);

    public static void main(String[] args) {
        System.out.print("Enter country name: ");
        String countryName = SCANNER.nextLine();
        Continents continents = Continents.getCountry(countryName);
        System.out.println(
                "Country: " + countryName + " belongs to " + continents);
    }

    enum Continents {
        EUROPE, NORTH_AMERICA, SOUTH_AMERICA;

        @Override
        public String toString() {
            String name = name();
            return name.charAt(0) + name.substring(1).toLowerCase();
        }

        public static Continents getCountry(String country) {
            return switch (country.toUpperCase()) {
                case "UKRAINE", "FRANCE", "PORTUGAL" -> Continents.EUROPE;
                case "USA", "CANADA", "MEXICO" -> Continents.NORTH_AMERICA;
                case "BRAZIL", "ARGENTINA", "VENEZUELA" -> Continents.SOUTH_AMERICA;
                default -> throw new IllegalArgumentException("Invalid country: " + country);
            };


        }


    }
}
