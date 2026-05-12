package com.softserve.academy.module4.homework;

import java.util.Objects;


public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    public static int counterDogsPairs(Dog dog1, Dog dog2, Dog dog3) {
        int dogCounter = 0;
        if (dog1.getName().equals(dog2.getName())) {
            dogCounter++;
        }
        if (dog2.getName().equals(dog3.getName())) {
            dogCounter++;
        }
        if (dog1.getName().equals(dog3.getName())) {
            dogCounter++;
        }
        return dogCounter;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Maltese ", 4, Breeds.MALTESE.getBreeds());
        Dog dog2 = new Dog("Bulldog ", 5, Breeds.BULLDOG.getBreeds());
        Dog dog3 = new Dog("Poodle ", 6, Breeds.POODLE.getBreeds());


        Dog oldestDog = dog1;

        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() < oldestDog.getAge()) {
            oldestDog = dog3;
        }

        int dogPairs = Dog.counterDogsPairs(dog1, dog2, dog3);
        if (dogPairs == 1) {
            System.out.println("There is 1 pair dogs");
        } else if (dogPairs == 0) {
            System.out.println("There is no 0 pair dog");
        } else {
            System.out.println("There are all dogs with the same name");
        }
        System.out.println("The oldest dog is " + oldestDog.getName()
                + "Breed The oldest dog is: " + oldestDog.getAge());
    }

}

