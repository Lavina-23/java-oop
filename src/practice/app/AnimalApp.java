package src.practice.app;

import src.practice.data.Animal;
import src.practice.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat(); // polymorph
        animal.name = "Anais";
        animal.run();

    }
}
