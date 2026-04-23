package com.softserve.academy.module3;

public class StudentDemo {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.setFirstName("Green");
//        student1.setLastName("Bob");
//        student1.setAge(20);
////        student1.group = "CS-22";
////        student1.faculty = "Computer science";
//        System.out.println(student1.getFirstName() + " " + student1.getLastName());
//
////        System.out.println("Student info: \n"
////                + "Student name is: " + student1.firstName + " " + student1.lastName);
//        Student student2 = new Student("Alice", "Brown","CS");
////        student2.age = 18;
////        student2.group = "IT-55";
////        System.out.println(student2);
////
////        student2.print();
//
//        System.out.println(Student.studentCount);
        Student student1 = new Student("Green", "Bob", 20, "CS-22", "Computer science");
        Student student2 = new Student("Green", "Bob", 20, "CS-22", "Computer science");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}