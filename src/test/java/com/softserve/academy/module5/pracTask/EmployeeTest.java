package com.softserve.academy.module5.pracTask;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    @Test
    void testWithDepartments() {
        String input = "1 2 3 4 5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        Employee.main(new String[]{});

        String output = out.toString();

        assertTrue(output.contains("Dmytro Hrushko - Department: 1, Salary: 50000.0"));
        assertTrue(output.contains("Ivan Ivanov - Department: 2, Salary: 60000.0"));
        assertTrue(output.contains("Bob Johnson - Department: 3, Salary: 55000.0"));
        assertTrue(output.contains("John Johnson - Department: 4, Salary: 30000.0"));
        assertTrue(output.contains("Michael Brown - Department: 5, Salary: 95000.0"));

        assertTrue(output.contains("Employees sorted by salary (descending):"));

        assertTrue(output.contains("Michael Brown - Department: 5, Salary: 95000.0"));
        assertTrue(output.contains("Ivan Ivanov - Department: 2, Salary: 60000.0"));
        assertTrue(output.contains("Bob Johnson - Department: 3, Salary: 55000.0"));
        assertTrue(output.contains("Dmytro Hrushko - Department: 1, Salary: 50000.0"));
        assertTrue(output.contains("John Johnson - Department: 4, Salary: 30000.0"));

    }

}
