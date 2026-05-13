package com.softserve.academy.module7.hw.task1;

public abstract class Employee {

    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        if (employeeId == null || employeeId.isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
