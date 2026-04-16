package com.softserve.academy.module3;

public class StringExample {
    private static final String TEXT_FOR_STATIC = "Java is a popular programming language.";

    static {
        System.out.println(TEXT_FOR_STATIC);
    }

    public static void main(String[] args) {
        System.out.println("This is the main method.");
    }
}
