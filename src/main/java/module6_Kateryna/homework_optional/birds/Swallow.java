package module6_Kateryna.homework_optional.birds;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallows are considered one of the fastest birds in horizontal flight.");
    }

    @Override
    public String toString() {
        return "Swallow: " + super.toString();
    }
}
