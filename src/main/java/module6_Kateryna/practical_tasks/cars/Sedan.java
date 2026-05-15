package module6_Kateryna.practical_tasks.cars;

public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int averageBrakingDistance, int yearOfProduction) {
        super(model, maxSpeed, averageBrakingDistance, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Max speed of " + getModel() + " (" + getYearOfProduction() +
                " year of production)" + " is " + getMaxSpeed() + "km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Average braking distance of this sedan is " + (int) getAverageBrakingDistance() + " m.");
    }
}
