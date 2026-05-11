package com.softserve.academy.module7;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name().compareTo(o2.name());
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age(), o2.age());
    }
}
class NameAndAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int nameComparison = o1.name().compareTo(o2.name());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(o1.age(), o2.age());
    }
}
