package com.softserve.academy.module5.homework;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Car {

    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        if (type.isEmpty() || yearOfProduction < 1700 || engineCapacity <= 0) {
            throw new IllegalArgumentException("Type cannot be empty, year of production must be after 1700, and engine capacity must be positive.");
        }
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return type + " (" + yearOfProduction + ", " + engineCapacity + "L)";
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Car> carList = List.of(
                    new Car("Sedan", 2010, 2.0),
                    new Car("SUV", 2015, 3.5),
                    new Car("Coupe", 2020, 1.8),
                    new Car("Convertible", 2018, 2.5)
            );

            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            carList.stream().filter(x -> x.getYearOfProduction() == year).forEach(System.out::println);
            System.out.println("\nCars sorted by year of production:");
            carList.stream().sorted(Comparator.comparingInt(Car::getYearOfProduction)).forEach(System.out::println);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer for the year.");
        }
    }
}
