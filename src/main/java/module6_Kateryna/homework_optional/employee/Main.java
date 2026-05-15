package module6_Kateryna.homework_optional.employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Eva", 35, 25000),
                new Employee("John", 25, 12000),
                new Employee("Alice", 22, 10000),
                new Employee("Bob", 28, 35000),
                new Employee("Jane", 30, 20000),
        };

        Developer[] developers = {
                new Developer("Eva", 35, 25000, "Python"),
                new Developer("Bob", 28, 35000, "Java"),
        };

        System.out.println("-----Employees-----");
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }

        System.out.println("\n-----Developers-----");
        for (Developer developer : developers) {
            System.out.println(developer.report());
        }
    }
}
