package module4_Kateryna.practical_tasks;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("pen", 2.50, 100);
        Product product2 = new Product("copybook", 1.50, 50);
        Product product3 = new Product("pencil", 3, 150);
        Product product4 = new Product("book", 5.60, 10);

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

        System.out.println("The most expensive product is " +
                mostExpensive.getName() + ", " +
                mostExpensive.getPrice() + " USD");

        Product theBiggestQuantity = product1;
        if (product2.getQuantity() > theBiggestQuantity.getQuantity()) {
            theBiggestQuantity = product2;
        }
        if (product3.getQuantity() > theBiggestQuantity.getQuantity()) {
            theBiggestQuantity = product3;
        }
        if (product4.getQuantity() > theBiggestQuantity.getQuantity()) {
            theBiggestQuantity = product4;
        }

        System.out.println("The product with the biggest quantity is " + theBiggestQuantity.getName());
    }
}
