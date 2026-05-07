package com.softserve.academy.module7;

public interface Worker {
    int BASE_SALARY = 5000;

    int getSalary();

    default void displayInfo() {
        System.out.println("Worker salary: " + getSalary());
    }

    static void displayBaseSalary() {
        System.out.println("Base salary: " + BASE_SALARY);
    }

    private void displayPrivateInfo() {
        System.out.println("This is a private method in the Worker interface.");
    }
}

class Manager implements Worker {

    @Override
    public int getSalary() {
        return Worker.BASE_SALARY + 1000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager salary: " + getSalary());
    }

}
