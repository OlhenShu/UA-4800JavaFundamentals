package module6_Kateryna.practical_tasks.cars;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Volvo FH16", 90, 38, 2020),
                new Sedan("Toyota Camry", 190, 36, 2025),
                new Truck("Scania R500", 85, 40, 2018),
                new Sedan("Honda Accord", 200, 35, 2024)
        };

        for (Car car : cars) {
            car.description();
            System.out.println();
        }
    }
}
