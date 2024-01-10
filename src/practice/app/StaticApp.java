package src.practice.app;

// static import
import static src.practice.data.Constant.APPLICATION;
import static src.practice.data.Constant.VERSION;

import src.practice.data.Application;
import src.practice.data.Country;
import src.practice.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        // without static import
        // System.out.println(Constant.APPLICATION);
        // System.out.println(Constant.VERSION);

        // using static import
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Country.City city = new Country.City();
        city.setName("Malang");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
