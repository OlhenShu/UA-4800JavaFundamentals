package com.softserve.academy.module6.homework.employees;

public class Developer extends Employee {

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        if (position == null || position.isEmpty()) {
            throw new IllegalArgumentException("Position cannot be null or empty.");
        }
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: ₴%.2f", getName(), getAge(), getPosition(), getSalary());
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
