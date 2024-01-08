package src.practice.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    // it's up to you whether to override or not because it's default method
    public boolean isBig() {
        return true;
    }
}
