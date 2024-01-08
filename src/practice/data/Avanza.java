package src.practice.data;

public class Avanza implements Car { // to inherits interface, use implements

    // must declare all methods from interface
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }
}
