package com.softserve.academy.module7.hw.task2;

import com.softserve.academy.module7.hw.task2.impl.Liner;
import com.softserve.academy.module7.hw.task2.impl.ground.Bus;
import com.softserve.academy.module7.hw.task2.impl.ground.Car;

import java.util.Arrays;
import java.util.List;

/**Basically, the main method creates a list of different types of vehicles (Car, Bus, Liner) and then uses java streams
 * BUT to avoid using stream for all instances it would be better just to override toString method
 * and print all just print all info one by one
 */
public class Main {

    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Car(4, "Toyota"),
                new Bus(40, "Route 1"),
                new Liner(2000, 3)
        );
        Arrays.stream(vehicles.toArray())
                .filter(vehicle -> vehicle instanceof Car)
                .map(vehicle -> (Car) vehicle)
                .forEach(car -> {
                    System.out.println("Car brand: " + car.getModel());
                    car.drive();
                    System.out.println("------------------");
                });
        Arrays.stream(vehicles.toArray())
                .filter(vehicle -> vehicle instanceof Bus)
                .map(vehicle -> (Bus) vehicle)
                .forEach(bus -> {
                    System.out.println("Bus route: " + bus.getRoute());
                    bus.drive();
                    System.out.println("------------------");
                });
        Arrays.stream(vehicles.toArray())
                .filter(vehicle -> vehicle instanceof Liner)
                .map(vehicle -> (Liner) vehicle)
                .forEach(liner -> {
                    System.out.println("Liner floors: " + liner.getFloors());
                    liner.isSailing();
                    System.out.println("------------------");
                });
    }

}
