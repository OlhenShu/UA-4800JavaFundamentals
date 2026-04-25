package module4_Kateryna.homework_optional;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int counterOfPairsOfDogs(Dog dog1, Dog dog2, Dog dog3) {
        int pairOfDogs = 0;
        if (dog1.getName().equals(dog2.getName())) {
            pairOfDogs++;
        }
        if (dog2.getName().equals(dog3.getName())) {
            pairOfDogs++;
            return pairOfDogs;
        }
        if (dog1.getName().equals(dog3.getName())) {
            pairOfDogs++;
        }
        return pairOfDogs;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", Breed.ROTTWEILER.getBreed(), 4);
        Dog dog2 = new Dog("Max", Breed.BEAGLE.getBreed(), 10);
        Dog dog3 = new Dog("Rex", Breed.FRENCH_BULLDOG.getBreed(), 7);

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        int dogsCounter = Dog.counterOfPairsOfDogs(dog1, dog2, dog3);
        if (dogsCounter == 1) {
            System.out.println("There are 1 pair of dogs with the same name");
        } else if (dogsCounter == 0) {
            System.out.println("There are no pairs of dogs with the same name");
        } else {
            System.out.println("All dogs with the same name");
        }

        System.out.println("The oldest dog is: " + oldestDog.getBreed() +
                " " + oldestDog.getName());
    }
}

