package com.softserve.academy.module4.pracTask;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        try {
            Product product1 = new Product("Laptop", 999.99, 10);
            Product product2 = new Product("Smartphone", 499.99, 20);
            Product product3 = new Product("Headphones", -199.99, 15);
            Product product4 = new Product("Monitor", 299.99, 5);

            Product[] products = {product1, product2, product3, product4};

            Product mostExpensive = products[0];
            Product largestQuantity = products[0];

            for (Product p : products) {
                if (p.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = p;
                }
                if (p.getQuantity() > largestQuantity.getQuantity()) {
                    largestQuantity = p;
                }
            }
            System.out.println("Most expensive product: " + mostExpensive.getName() + " with price " + mostExpensive.getPrice());
            System.out.println("Product with largest quantity: " + largestQuantity.getName() + " with quantity " + largestQuantity.getQuantity());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
