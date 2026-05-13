package com.softserve.academy.module7.pracTask.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println("------------------");
        }
    }

}
