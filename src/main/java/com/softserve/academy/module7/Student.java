package com.softserve.academy.module7;

import java.util.Arrays;

public record Student(String name, int age) implements Comparable {
    @Override
    public int compareTo(Object o) {
        if (o instanceof Student other) {
            int nameComparison = this.name.compareTo(other.name);
            return (nameComparison != 0) ? nameComparison : Integer.compare(this.age, other.age);
        }
        throw new IllegalArgumentException("Cannot compare Student with " + o.getClass().getName());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);
        Student student3 = new Student("Alice", 19);

        Student[] students = {student1, student2, student3};


        System.out.println(student1); // Output: Student[name=Alice, age=20]
        System.out.println(student2); // Output: Student[name=Bob, age=22]

        // Accessing fields
        System.out.println("Name: " + student1.name() + ", Age: " + student1.age());
        System.out.println("Name: " + student2.name() + ", Age: " + student2.age());
        System.out.println(student1.equals(student2)); // Output: false
        System.out.println(student1.hashCode()); // Output: hash code for student1
        System.out.println(student2.hashCode()); // Output: hash code for student2

       // Arrays.sort(students);
        Arrays.sort(students, new NameComparator());
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new AgeComparator());
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new NameAndAgeComparator());
        System.out.println(Arrays.toString(students));
    }
}