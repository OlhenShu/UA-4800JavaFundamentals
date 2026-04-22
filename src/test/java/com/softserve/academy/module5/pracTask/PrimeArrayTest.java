package com.softserve.academy.module5.pracTask;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeArrayTest {

    @Test
    public void testInputPrimeNumber() {
        String input = "13";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        PrimeArray.main(new String[]{});

        assertTrue(out.toString().contains("Is a prime number."));

    }

    @Test
    public void testInputNotPrimePositiveNumber() {
        String input = "12";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        PrimeArray.main(new String[]{});

        assertTrue(out.toString().contains("Is not a prime number."));

    }

    @Test
    public void testInputNotPrimeNegativeNumber() {
        String input = "-12";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        PrimeArray.main(new String[]{});

        assertTrue(out.toString().contains("Is not a prime number."));

    }

}
