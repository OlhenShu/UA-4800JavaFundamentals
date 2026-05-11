package com.softserve.academy.module7.hw.task1;

import java.util.Objects;

public class ContractEmployee  extends Employee {
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String fullName, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(fullName);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContractEmployee that = (ContractEmployee) o;
        return Double.compare(hourlyRate, that.hourlyRate) == 0 && hoursWorked == that.hoursWorked && Objects.equals(federalTaxIdMember, that.federalTaxIdMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), federalTaxIdMember, hourlyRate, hoursWorked);
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "FullName ='" + getFullName() + '\'' +
                "federalTaxIdMember ='" + federalTaxIdMember + '\'' +
                ", monthlySalary =" + calculateSalary() +
                '}';
    }
}
