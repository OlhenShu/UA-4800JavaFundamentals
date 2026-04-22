package com.softserve.academy.module5.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumOfNumbersTest {

    @Test
    public void testFirstFiveArePositive() {
        String input = "2 4 4 5 1 0 2 -1 3 4";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumOfNumbers.main(new String[]{});

        assertTrue(out.toString().contains("Sum of the first five numbers: 16"));

    }

    @Test
    public void testFirstFiveAreNotPositive() {
        String input = "2 -4 4 5 1 5 2 -1 3 4";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumOfNumbers.main(new String[]{});

        assertTrue(out.toString().contains("Product of the last five numbers: -120"));

    }

}
