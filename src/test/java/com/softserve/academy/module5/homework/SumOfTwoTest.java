package com.softserve.academy.module5.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumOfTwoTest {

    @Test
    public void testSingleInteractionThenStop() {
        String input = "2 -3 no";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumOfTwo.main(new String[]{});

        assertTrue(out.toString().contains("Sum: -1"));

    }

    @Test
    public void testFewInteractionThenStop() {
        String input = "2 -3 yes 5 10 yes -3 4 no";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        SumOfTwo.main(new String[]{});

        assertTrue(out.toString().contains("Sum: -1"));
        assertTrue(out.toString().contains("Sum: 15"));
        assertTrue(out.toString().contains("Sum: 1"));

    }

}
