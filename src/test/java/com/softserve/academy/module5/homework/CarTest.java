package com.softserve.academy.module5.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarTest {

    @Test
    public void testByEnterYear() {
        String input = "2015";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Car.main(new String[]{});

        assertTrue(out.toString().contains("SUV (2015, 3.5L)"));
        assertTrue(out.toString().contains("Cars sorted by year of production:"));
        assertTrue(out.toString().contains("Sedan (2010, 2.0L)"));
        assertTrue(out.toString().contains("SUV (2015, 3.5L)"));
        assertTrue(out.toString().contains("Convertible (2018, 2.5L)"));
        assertTrue(out.toString().contains("Coupe (2020, 1.8L)"));

    }

    @Test
    public void testThisNoMatch() {
        String input = "2016";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Car.main(new String[]{});

        assertTrue(out.toString().contains("Cars sorted by year of production:"));
        assertTrue(out.toString().contains("Sedan (2010, 2.0L)"));
        assertTrue(out.toString().contains("SUV (2015, 3.5L)"));
        assertTrue(out.toString().contains("Convertible (2018, 2.5L)"));
        assertTrue(out.toString().contains("Coupe (2020, 1.8L)"));

    }

}
