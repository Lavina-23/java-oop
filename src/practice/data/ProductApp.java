package src.practice.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 10000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
