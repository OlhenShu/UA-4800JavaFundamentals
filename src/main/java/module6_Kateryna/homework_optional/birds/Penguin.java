package module6_Kateryna.homework_optional.birds;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguins cannot fly in the air because their wings have evolved into hard flippers.");
    }

    @Override
    public String toString() {
        return "Penguin: " + super.toString();
    }
}
