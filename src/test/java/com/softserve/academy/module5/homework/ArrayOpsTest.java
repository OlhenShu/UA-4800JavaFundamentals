package com.softserve.academy.module5.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOpsTest {

    @Test
    public void testSecondPositiveExist() {
        String input = "2 4 -4 3 1";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        ArrayOps.main(new String[]{});

        assertTrue(out.toString().contains("Second positive number: 4"));
        assertTrue(out.toString().contains("Index with smallest number is 2 and the number -4"));
        assertTrue(out.toString().contains("Product of even numbers (excluding zero): -32"));

    }

    @Test
    public void testNoSecondPositiveNumberAndZeroEvent() {
        String input = "-1 0 -2 3 -4";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        ArrayOps.main(new String[]{});

        assertTrue(out.toString().contains("No second positive number found."));
        assertTrue(out.toString().contains("Index with smallest number is 4 and the number -4"));
        assertTrue(out.toString().contains("Product of even numbers (excluding zero): 8"));
    }

}
