package com.softserve.academy.module4.pracTask;

import java.util.Scanner;

class UnknownCountryException extends Exception {
    public UnknownCountryException(String message) {
        super(message);
    }
}

public class CountryToContinent {

    enum Continent {
        ASIA, EUROPE, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a country name:");
            String country = scanner.nextLine().trim().toLowerCase();

            Continent continent;

            switch (country) {
                case "china", "japan", "india" -> continent = Continent.ASIA;
                case "ukraine", "france", "germany", "uk" -> continent = Continent.EUROPE;
                case "egypt", "monaco", "uar" -> continent = Continent.AFRICA;
                case "usa", "canada", "mexico" -> continent = Continent.NORTH_AMERICA;
                case "brazil", "argentina", "chile" -> continent = Continent.SOUTH_AMERICA;
                case "australia", "new zealand" -> continent = Continent.AUSTRALIA;
                case "antarctica" -> continent = Continent.ANTARCTICA;
                default -> throw new UnknownCountryException("Unknown country: " + country);
            }
            System.out.println("Continent: " + continent);
        } catch (UnknownCountryException e) {
            System.out.println(e.getMessage());
        }
    }

}
