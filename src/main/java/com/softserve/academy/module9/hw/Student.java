package com.softserve.academy.module9.hw;

public class Student extends Person implements Cloneable {

    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for Student", e);
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                "fullName = " + getFullName().getFirstName() + " " + getFullName().getLastName() +
                ", age = " + getAge() +
                ", course = " + course +
                '}';
    }
}
