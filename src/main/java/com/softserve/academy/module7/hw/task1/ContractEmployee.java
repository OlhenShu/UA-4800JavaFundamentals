package com.softserve.academy.module7.hw.task1;

public class ContractEmployee extends Employee implements Payment {

    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        if (federalTaxIdMember == null || federalTaxIdMember.isEmpty()) {
            throw new IllegalArgumentException("Federal Tax ID Member cannot be null or empty");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly Rate cannot be negative");
        }
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours Worked cannot be negative");
        }
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
