package com.softserve.academy.module7.hw.task1;

/**
 * Create an interface called Payment with the method calculatePay(), the base abstract class called Employee with a String variable employeeld.
 * Create two classes, SalariedEmployee and ContractEmployee, which implement Payment interface and inherit from the base class Employee.
 * Describe hourly-paid workers in the relevant classes (one of the child classes), and fixed paid workers in the other.
 * Describe the String variable socialSecurityNumber in the SalariedEmployee class .
 * Include a description of federalTaxIdmember variable in the ContractEmployee class.
 * The calculation formula for the hourly workers is as follow:
 *
 *  the average monthly  salary = hourly rate * number of hours worked
 * For employees with a fixed salary the formula is simply:
 *
 * the average monthly salary  = fixed monthly payment
 *
 * In main() method create an array of employees and add the employees with different form of payment.
 *
 * Arrange the entire sequence of workers in descending order of the average monthly wage. Output the employee ID, name, and the average monthly wage for all elements of the list.

 */
public interface Payment {
    double calculateSalary();
}
