package com.softserve.academy.module7.hw.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("001", "Bob", "SMTH123", 5000));
        employees.add(new ContractEmployee("002", "Blob", "SMTHF123", 25, 180));
        employees.add(new SalariedEmployee("003", "Maria", "SMTH345", 3000));
        employees.add(new ContractEmployee("004", "Tom", "SMTHF345", 20, 350));
        employees.add(new ContractEmployee("005", "Jerry", "SMTHF567", 20, 370));

        employees.sort((e1, e2) -> Double.compare(((Payment) e2).calculatePay(), ((Payment) e1).calculatePay()));

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Payment: " + ((Payment) employee).calculatePay());
            System.out.println("------------------");
        }
    }

}
