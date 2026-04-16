package com.softserve.academy.module3;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);
        Product product3 = new Product("Headphones", 200);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);


        product1.applyDiscount(10.0); // Apply 10% discount
        System.out.println("After 10% discount: " + product1);
        product2.applyDiscount(50); // Apply $50 discount
        System.out.println("After $50 discount: " + product2);
        product3.applyDiscount(5, 2); // Apply 5% discount per unit for 2 units
        System.out.println("After bulk discount: " + product3);

        System.out.println(OverloadExample.sum(2.5, 3.5));

    }
}
