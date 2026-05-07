package com.softserve.academy.module6;

public class CastingDemo {
    public static void main(String[] args) {
        int intValue = 100;
        double doubleValue = intValue; // Implicit upcasting (int to double)
        System.out.println("Implicit upcasting (int to double): " + doubleValue);

        double anotherDoubleValue = 123.45;
        int anotherIntValue = (int) anotherDoubleValue; // Explicit downcasting
        System.out.println("Explicit downcasting (double to int): " + anotherIntValue);








        Employee employee = new Employee("John Doe", 50000);
        employee.displayInfo();

        // Upcasting: Employee reference to Object
        Object obj = employee; // Implicit upcasting
        System.out.println("Upcasted to Object: " + obj);

        // Downcasting: Object reference back to Employee
        if (obj instanceof Employee) {
            Employee downcastedEmployee = (Employee) obj; // Explicit downcasting
            downcastedEmployee.displayInfo();
        } else {
            System.out.println("The object is not an instance of Employee.");
        }
    }
}
