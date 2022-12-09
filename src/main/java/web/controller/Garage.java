package web.controller;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class Garage {
    private static Car[] carArr = {
            new Car("Skoda", "Octavia", 2013),
            new Car("Renault", "Logan", 2015),
            new Car("Lada", "Vesta", 2019),
            new Car("Pegeot", "307", 2010),
            new Car("SAAB", "9000", 1955),
    };

    public static List<Car> getCars(int amount) {
        if (amount > 0 && amount < 5) {
            return Arrays.asList(carArr).subList(0, amount);
        } else {
            return Arrays.asList(carArr);
        }
    }
}
