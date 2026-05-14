package com.softserve.academy.module9.pracTask;

public class Department implements Cloneable {

    private String name;
    private Address address;

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public Address clone() throws CloneNotSupportedException {
            try {
                return (Address) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException("Cloning not supported for Address", e);
            }
        }

    }

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Department department = (Department) super.clone();
            department.address = this.address.clone();
            return department;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for Department", e);
        }
    }

    @Override
    public String toString() {
        return "Department {" +
                "name = '" + name + '\'' +
                ", address = " + address.city + ", " + address.street + ", " + address.building +
                "}";
    }

    public static void main(String[] args) {
        try {
            Department department1 = new Department("HR", "New York", "5th Avenue", 10);
            Department department2 = (Department) department1.clone();

            System.out.println("Department 1: " + department1);
            System.out.println("Department 2: " + department2);

            department2.address.setCity("Chicago");
            System.out.println("\nAfter modifying department2 address:");
            System.out.println("Department 1: " + department1);
            System.out.println("Department 2: " + department2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
