package com.softserve.academy.module3;

/**
 * This class represents a product with a name and price.
 * It provides methods to apply discounts to the product's price.
 */
public class Product {
    private String name;
    private double price;

    public Product() {
        this.name = "";
        this.price = 0.0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Applies a percentage discount to the product's price.
     *
     * @param percent
     */
    public void applyDiscount(double percent) {
        price = price * (1 - percent / 100);
    }

    //This method is added to demonstrate method overloading with the same functionality as applyDiscount(double percent)
    public void withPercentDiscount(double percent) {
        price = price * (1 - percent / 100);
    }

    /**
     * Applies a fixed amount discount to the product's price.
     *
     * @param amount
     */
    public void applyDiscount(int amount) {
        price = price - amount;
    }

    //This method is added to demonstrate method overloading with the same functionality as applyDiscount(int amount)
    public void withAmountDiscount(int amount) {
        price = price - amount;
    }

    /**
     * Applies a bulk discount based on the quantity and percentage per unit.
     * @param quantity
     * @param percentPerUnit
     */
    public void applyDiscount(int quantity, double percentPerUnit) {
        double totalPercent = quantity * percentPerUnit;
        price = price * (1 - totalPercent / 100);
    }

    @Override
    public String toString() {
        return "Product: " +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}
