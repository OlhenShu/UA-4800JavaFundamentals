package com.softserve.academy.module6.homework.birds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();
        birds.add(new FlyingBird("colorful", false));
        birds.add(new Swallow("small", true));
        birds.add(new Eagle("large", true));
        birds.add(new Penguin("black and white", true));
        birds.add(new Kiwi("brown", true));
        Arrays.stream(birds.toArray()).forEach(bird -> {
            ((Bird) bird).info();
            ((Bird) bird).fly();
            System.out.println();
        });

    }

}
