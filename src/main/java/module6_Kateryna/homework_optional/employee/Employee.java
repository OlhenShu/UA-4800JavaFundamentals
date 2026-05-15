package module6_Kateryna.homework_optional.employee;

public class Employee {
    private final String name;
    private final int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: ₴ %.2f", name, age, salary);
    }
}
