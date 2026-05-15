package module6_Kateryna.homework_optional.birds;

public class Main {
    public static void main(String[] args) {
        Bird[] flyingBirds = {
                new Eagle("dark brown", true),
                new Swallow("blue", true),
        };

        Bird[] nonFlyingBirds = {
                new Penguin("black and white", false),
                new Kiwi("light brown", false),
        };

        System.out.println("-----Flying birds-----");
        for (Bird bird : flyingBirds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }

        System.out.println("-----Non-flying birds-----");
        for (Bird bird : nonFlyingBirds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }
    }
}
