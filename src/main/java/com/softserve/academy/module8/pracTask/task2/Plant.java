package com.softserve.academy.module8.pracTask.task2;

import java.util.Arrays;

enum Color {
    GREEN, YELLOW, RED, PURPLE
}

enum Type {
    FLOWER, SHRUB, TREE
}

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;

    }

    public void validateSize() throws SizeException {
        if (size <= 0) {
            throw new SizeException("Size is too small");
        }
        if (size > 100) {
            throw new SizeException("Size is too big");
        }
    }

    public void validateColorAndType() throws ColorException, TypeException {
        if (!Arrays.asList(Color.values()).contains(color)) {
            throw new ColorException("Invalid color");
        }
        if (!Arrays.asList(Type.values()).contains(type)) {
            throw new TypeException("Invalid type");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant { " +
                "size = " + size +
                ", color = " + color +
                ", type = " + type +
                " }";
    }
}
