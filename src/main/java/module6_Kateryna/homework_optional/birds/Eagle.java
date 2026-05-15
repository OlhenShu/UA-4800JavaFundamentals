package module6_Kateryna.homework_optional.birds;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("The special design of their wings allows eagles " +
                "to fly and hunt even during hurricane-force winds.");
    }

    @Override
    public String toString() {
        return "Eagle: " + super.toString();
    }
}
