package com.softserve.academy.module5.homework;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DaysInMonthTest {

    @Test
    public void testValidInputOfMonth() {
        String input = "1";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        DaysInMonth.main(new String[]{});

        assertTrue(out.toString().contains("Days: 31"));

    }

    @Test
    public void testNotValidInputOfMonth() {
        String input = "13";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        DaysInMonth.main(new String[]{});

        assertTrue(out.toString().contains("Invalid month number"));

    }

}
