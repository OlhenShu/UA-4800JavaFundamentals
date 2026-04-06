package com.softserve.academy.module1;

public class DataTypes {
    public static void main(String[] args) {
        int i, b, t;

        //primitive data types
        byte byteExample = 10;//-128 to 127
        System.out.println("byte with value: " + byteExample);
        short shortExample = 150;//-32768 to 32767
        System.out.println("short with value: " + shortExample);
        int intExample = 1500;//-2 147 483 648 to 2 147 483 647
        System.out.println("short with value: " + intExample);
        long longExample = 150L;//-9 223 372 036 854 775 808 to 9 223 372 036 854 775 807
        System.out.println("short with value: " + longExample);

        boolean bool = false; // or true
        System.out.println("boolean with value: " + bool);
        char symbol = 'c';
        System.out.println(symbol);

        float floatExample = 15.5f;
        System.out.println(floatExample);

        double d = 15.55555555;
        System.out.println(d);

        //constants

        System.out.println(Byte.MIN_VALUE);    // -128
        System.out.println(Byte.MAX_VALUE);    // 127
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Long.MIN_VALUE);    // -9223372036854775808
        System.out.println(Long.MAX_VALUE);    // 9223372036854775807
        System.out.println(Float.MIN_VALUE);   // 1.4E-45
        System.out.println(Float.MAX_VALUE);   // 3.4028235E38
        System.out.println(Double.MIN_VALUE);  // 4.9E-324
        System.out.println(Double.MAX_VALUE);

        //Non-primitive
        String name = "Olha";
        System.out.println("Name: " + name);

        Int city = new Int();
        System.out.println(city);

        Person person = new Person();
        System.out.println(person);
        i = 10;
        System.out.println(i);


    }
}
class Int {
    String city;
}

class Person {
    int age;
    String name;
    String lastName;
    String address;
}
