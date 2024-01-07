package src.practice.app;

import src.practice.data.Product;

public class app {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
