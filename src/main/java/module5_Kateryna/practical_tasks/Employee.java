package module5_Kateryna.practical_tasks;

import java.util.Scanner;

public class Employee {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    /*
    Output result for all employees of a certain department
    */
    public static void outputDepartmentNumber(Employee[] employees) {
        System.out.print("Enter department number: ");
        int departmentNumber = SCANNER.nextInt();
        boolean foundNumber = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
                foundNumber = true;
            }
        }
        if (!foundNumber) {
            System.out.println("No employees found in department " + departmentNumber);
        }
    }

    /*
    Arrange workers by the field salary in descending order
    */
    public static void arrangeBySalaryDescending(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Kate", 1, 20000),
                new Employee("Bob", 2, 25000),
                new Employee("Nina", 1, 40000),
                new Employee("Den", 3, 10000),
                new Employee("Rita", 2, 35000),
        };

        outputDepartmentNumber(employees);
        arrangeBySalaryDescending(employees);
        System.out.println("-------------------------------------------------");
        System.out.println("Employees arranged by salary in descending order: ");
        for (var employee : employees) {
            System.out.println(employee);
        }
    }
}
