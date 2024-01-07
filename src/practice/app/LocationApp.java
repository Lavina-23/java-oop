package src.practice.app;

import src.practice.data.City;

public class LocationApp {
    public static void main(String[] args) {
        // Location location = new Location(); -> error occurs because objects can't be
        // created directly from an abstract class

        City city = new City();
        city.name = "Malang"; // access this abstract field from subclass

        System.out.println(city.name);
    }

}