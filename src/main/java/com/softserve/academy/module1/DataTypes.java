package com.softserve.academy.module1;

/**
 * The DataTypes class demonstrates the use of various primitive and reference data types in Java.
 * It showcases the initialization, assignment, and usage of these types, as well as basic console output.
 *
 * Primitive data types covered include:
 * - Integer types: byte, short, int, and long
 * - Floating-point types: float and double
 * - Character type: char
 * - Boolean type: boolean
 *
 * Reference data types demonstrated include:
 * - String objects for textual data
 * - Array objects for storing collections of data
 * - Wrapper classes (e.g., Integer, Double) for working with primitve data types as objects
 *
 * The main method illustrates:
 * - Initialization and printing of various data types
 * - Using arrays and their properties
 * - Utilizing wrapper classes to encapsulate primitive data types
 */

public class DataTypes {
    public static void main(String[] args) {
        // Primitive data types

        // Integer types
        byte b = 100;           // 8-bit signed integer, from -128 to 127
        short s = 30000;        // 16-bit signed integer, from -32,768 to 32,767
        int i = 100000;         // 32-bit signed integer, from -2^31 to 2^31-1 (standard for integers)
        long l = 10000000000L;  // 64-bit signed integer, requires 'L' or 'l' suffix

        // Floating-point types
        float f = 3.14f;        // 32-bit float, requires 'f' or 'F' suffix
        double d = 3.14159;     // 64-bit float (standard for decimal numbers)

        // Character type
        char c = 'A';           // 16-bit Unicode character

        // Boolean type
        boolean bool = true;    // Can only be true or false

        // Printing primitive types
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        // Reference types

        // String - an object, not a primitive
        String str = "Hello, Java!";

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};

        // Wrapper classes
        Integer wrappedInt = 10;
        Double wrappedDouble = 20.5;

        System.out.println("String: " + str);
        System.out.println("Array length: " + intArray.length);
        System.out.println("Wrapper Integer: " + wrappedInt);
    }
}
