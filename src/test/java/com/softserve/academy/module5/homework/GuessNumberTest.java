package com.softserve.academy.module5.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessNumberTest {

    @Test
    public void testGuessedCorrect() {
        String input = "42";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Scanner scanner = new Scanner(System.in);
        new GuessNumber(42).play(scanner);

        assertTrue(out.toString().contains("Congratulations! You've guessed the number!"));

    }

    @Test
    public void testTooLowThenCorrect() {
        String input = "34 42";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Scanner scanner = new Scanner(System.in);
        new GuessNumber(42).play(scanner);

        assertTrue(out.toString().contains("Too low, try again."));
        assertTrue(out.toString().contains("Congratulations! You've guessed the number!"));

    }

    @Test
    public void testTooHighThenCorrect() {
        String input = "94 42";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Scanner scanner = new Scanner(System.in);
        new GuessNumber(42).play(scanner);

        assertTrue(out.toString().contains("Too high, try again."));
        assertTrue(out.toString().contains("Congratulations! You've guessed the number!"));

    }

}
