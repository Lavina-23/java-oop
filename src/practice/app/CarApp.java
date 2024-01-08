package src.practice.app;

import src.practice.data.Avanza;
import src.practice.data.Car;

public class CarApp {
    public static void main(String[] args) {
        // Car car = new Car() -> error because Car() is an abstract class
        Car car = new Avanza(); // polymorphism
        System.out.println(car.getTier());
        car.drive();
    }
}

// ideally to use an interface rather than an abstract class