package com.softserve.academy.module6.homework.employees;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 50000);
        Employee developer = new Developer("Jane", 28, 70000, "Senior Developer");

        System.out.println(employee.report());
        System.out.println(developer.report());

    }

}
