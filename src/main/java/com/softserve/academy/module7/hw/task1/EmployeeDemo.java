package com.softserve.academy.module7.hw.task1;

import java.util.Arrays;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("John Doe", "SSN-45-6789", 5000),
                new ContractEmployee("Jane Smith", "FTID-12345", 20, 160),
                new SalariedEmployee("Alice Johnson", "SSN-12-3456", 6000),
                new ContractEmployee("Bob Brown", "FTID-67890", 25, 120),
                new SalariedEmployee("John Doe", "SSN-15-6789", 3800),
                new ContractEmployee("Jane Smith", "FTID-56345", 40, 210)

        };
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
