package com.softserve.academy.module7.hw.task1;

import java.util.Objects;

public class SalariedEmployee extends Employee {
    private final String socialSecurityNumber;
    private final double monthlySalary;

    public SalariedEmployee(String fullName,  String socialSecurityNumber, double monthlySalary) {
        super(fullName);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(monthlySalary, that.monthlySalary) == 0 && Objects.equals(socialSecurityNumber, that.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), socialSecurityNumber, monthlySalary);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "FullName ='" + getFullName() + '\'' +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
