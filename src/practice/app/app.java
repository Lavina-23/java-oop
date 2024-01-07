package src.practice.app;

import src.practice.data.Product;
// import src.practice.data.* -> import all class

public class App {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
