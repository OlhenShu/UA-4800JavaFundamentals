package com.softserve.academy.module5.pracTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

    private String name;
    private int departmentNumber;
    private double salary;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int departmentNumber;

        Employee employee1 = new Employee("Dmytro Hrushko", 50000);
        System.out.println("Enter department number for " + employee1.getName() + ": ");
        departmentNumber = scanner.nextInt();
        employee1.setDepartmentNumber(departmentNumber);

        Employee employee2 = new Employee("Ivan Ivanov", 60000);
        System.out.println("Enter department number for " + employee2.getName() + ": ");
        departmentNumber = scanner.nextInt();
        employee2.setDepartmentNumber(departmentNumber);

        Employee employee3 = new Employee("Bob Johnson", 55000);
        System.out.println("Enter department number for " + employee3.getName() + ": ");
        departmentNumber = scanner.nextInt();
        employee3.setDepartmentNumber(departmentNumber);

        Employee employee4 = new Employee("John Johnson", 30000);
        System.out.println("Enter department number for " + employee4.getName() + ": ");
        departmentNumber = scanner.nextInt();
        employee4.setDepartmentNumber(departmentNumber);

        Employee employee5 = new Employee("Michael Brown", 95000);
        System.out.println("Enter department number for " + employee5.getName() + ": ");
        departmentNumber = scanner.nextInt();
        employee5.setDepartmentNumber(departmentNumber);

        List<Employee> employees = new ArrayList<>(List.of(employee1, employee2, employee3, employee4, employee5));
        System.out.println("All employees: ");
        employees.forEach(e -> System.out.println(e.getName() + " - Department: " + e.getDepartmentNumber() + ", Salary: " + e.getSalary()));

        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        System.out.println("\nEmployees sorted by salary (descending): ");
        employees.forEach(e -> System.out.println(e.getName() + " - Department: " + e.getDepartmentNumber() + ", Salary: " + e.getSalary()));

        scanner.close();
    }

}
