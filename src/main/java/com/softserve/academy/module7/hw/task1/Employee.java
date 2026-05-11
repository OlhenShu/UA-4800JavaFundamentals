package com.softserve.academy.module7.hw.task1;

import java.util.Objects;

public abstract class Employee implements Payment, Comparable<Employee> {
    private String fullName;

     Employee(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public abstract double calculateSalary();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fullName);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.calculateSalary(), other.calculateSalary());
    }
}
