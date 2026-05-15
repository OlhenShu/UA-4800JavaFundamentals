package module6_Kateryna.homework_optional.birds;

public abstract class Bird {
    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "this bird has " + feathers + " feathers " +
                "and he " + (layEggs ? "lays eggs." : "does not lay eggs.");
    }
}
