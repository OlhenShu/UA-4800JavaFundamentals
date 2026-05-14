package com.softserve.academy.module8.pracTask.task2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Plant> plants = Arrays.asList(
                new Plant(12, Color.RED, Type.SHRUB),
                new Plant(2, Color.YELLOW, null),
                new Plant(150, Color.GREEN, Type.TREE),
                new Plant(10, null, Type.FLOWER),
                new Plant(-5, Color.PURPLE, Type.FLOWER)
        );
        for (Plant plant : plants) {
            try {
                plant.validateSize();
                plant.validateColorAndType();
                System.out.println(plant + " is valid");
            } catch (SizeException | ColorException | TypeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
