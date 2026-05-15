package module6_Kateryna.practical_tasks.cars;

public abstract class Car {
    private final String model;
    private final double maxSpeed;
    private final int averageBrakingDistance;
    private final int yearOfProduction;

    public Car(String model, double maxSpeed, int averageBrakingDistance, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.averageBrakingDistance = averageBrakingDistance;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getAverageBrakingDistance() {
        return averageBrakingDistance;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

    public void description(){
        run();
        stop();
    }
}
