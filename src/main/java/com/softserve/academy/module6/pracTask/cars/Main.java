package com.softserve.academy.module6.pracTask.cars;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Sedan("Toyota Camry", 210, 2020),
                new Truck("Ford F-150", 180, 2019),
                new Sedan("Honda Accord", 200, 2021),
                new Truck("Chevrolet Silverado", 190, 2018)
        );

        cars.get(2).stop();
        System.out.println();
        cars.get(0).run();
        System.out.println();

        Arrays.stream(cars.toArray()).forEach(car -> {
            ((Car) car).info();
            System.out.println();
        });

    }

}
