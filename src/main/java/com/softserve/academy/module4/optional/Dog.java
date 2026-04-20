package com.softserve.academy.module4.optional;

public class Dog {
    enum Breed{
        LABRADOR, BULLDOG, BEAGLE
    }

    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static void checkSameName(Dog... dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    System.out.println("There is dogs with 2 identical names");
                    break;
                }
            }
        }
    }

    public static Dog findOldest(Dog... dogs) {
        Dog oldest = dogs[0];
        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", 5, Breed.LABRADOR);
        Dog dog2 = new Dog("Charlie", 3, Breed.BULLDOG);
        Dog dog3 = new Dog("Buddy", 7, Breed.BEAGLE);

        Dog.checkSameName(dog1, dog2, dog3);
        Dog oldest = Dog.findOldest(dog1, dog2, dog3);

        System.out.println("The oldest dog is " + oldest.getName() + " with age " + oldest.getAge() + " and breed " + oldest.getBreed());
    }
}
