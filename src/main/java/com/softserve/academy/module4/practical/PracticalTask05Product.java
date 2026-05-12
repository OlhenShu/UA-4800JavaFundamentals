package com.softserve.academy.module4.practical;

public class PracticalTask05Product {

    public static void main(String[] args) {
        Product product1 = new Product("Chips", 10, 45);
        Product product2 = new Product("Milk", 5, 74);
        Product product3 = new Product("Potato", 3, 33);
        Product product4 = new Product("Carrot", 2, 57);

        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }
        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }
        System.out.println("The most Expensive item is: \n" +
                "Name : " + mostExpensive.getName() + "\n" +
                "Quantity: " + mostExpensive.getQuantity()
        );

        int maxQuantity = product1.getQuantity();

        if (product2.getQuantity() > maxQuantity) {
            maxQuantity = product2.getQuantity();
        }
        if (product3.getQuantity() > maxQuantity) {
            maxQuantity = product3.getQuantity();
        }
        if (product4.getQuantity() > maxQuantity) {
            maxQuantity = product4.getQuantity();
        }
        System.out.println("The maximum quantity is: " + maxQuantity +
                           " are the following:");

        if (product1.getQuantity() == maxQuantity) {
            System.out.println("" + product1.getName ());
        }
        if (product2.getQuantity() == maxQuantity) {
            System.out.println("" + product2.getName ());
        }
        if (product3.getQuantity() == maxQuantity) {
            System.out.println("" + product3.getName ());
        }
        if (product4.getQuantity() == maxQuantity) {
            System.out.println("" + product4.getName ());
        }
    }
}
