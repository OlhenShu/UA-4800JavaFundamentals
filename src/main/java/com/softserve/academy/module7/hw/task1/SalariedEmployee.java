package com.softserve.academy.module7.hw.task1;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double fixedPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedPayment) {
        super(employeeId, name);
        if (socialSecurityNumber == null || socialSecurityNumber.isEmpty()) {
            throw new IllegalArgumentException("Social Security Number cannot be null or empty");
        }
        if (fixedPayment < 0) {
            throw new IllegalArgumentException("Fixed Payment cannot be negative");
        }
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }
}
