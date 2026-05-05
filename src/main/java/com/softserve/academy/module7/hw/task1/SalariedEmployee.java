package com.softserve.academy.module7.hw.task1;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double fixedPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }
}
