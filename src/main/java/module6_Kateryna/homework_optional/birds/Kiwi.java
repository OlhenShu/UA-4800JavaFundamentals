package module6_Kateryna.homework_optional.birds;

public class Kiwi extends NonFlyingBird {

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Due to the lack of predators on the islands of New Zealand, " +
                "kiwis have lost the ability to fly.");
    }

    @Override
    public String toString() {
        return "Kiwi: " + super.toString();
    }
}
