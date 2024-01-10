package src.practice.utils;

// static mathod
public class MathUtil {
    public static int sum(int... values) { // you can use this method without create the object
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
