package module5_Kateryna.homework_optional;

import java.util.Scanner;

import static java.lang.System.in;

public class Car {
    private String type;
    private int yearOfProduction;
    double engineCapacity;

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Car car1 = new Car("Liftback", 2024, 2.0);
        Car car2 = new Car("Minivan", 2023, 3.5);
        Car car3 = new Car("Coupe", 2025, 3.0);
        Car car4 = new Car("Hatchback", 2024, 1.5);

        Car[] cars = {car1, car2, car3, car4};

        System.out.print("Enter year of production of car: ");
        int yearOfProduction = scanner.nextInt();

        boolean carInArray = false;
        for (Car car : cars) {
            if (car.getYearOfProduction() == yearOfProduction) {
                System.out.println(car);
                carInArray = true;
            }
        }

        if (!carInArray) {
            System.out.println("Car with this year of production is not found");
        }

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].yearOfProduction > cars[j + 1].yearOfProduction) {
                    var tmp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nCars sorted by year of production:");
        for (var car : cars) {
            System.out.println(car);
        }

        scanner.close();
    }
}
