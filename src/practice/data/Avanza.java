package src.practice.data;

public class Avanza implements Car, isMaintenance { // to inherits interface, use implements
    // to implements multiple interfaces use ,

    // must declare all methods from interface
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
