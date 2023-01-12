package service;

import org.springframework.stereotype.Component;

import model.Car;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private List<Car> carList;

    public CarServiceImp() {
        carList = new ArrayList<>();
        carList.add(new Car("Skoda", "Octavia", 2013));
        carList.add(new Car("Renault", "Logan", 2015));
        carList.add(new Car("Lada", "Vesta", 2019));
        carList.add(new Car("Peugeot", "307", 2010));
        carList.add(new Car("SAAB", "9000", 1995));
    }
    @Override
    public List<Car> severalCars(Integer count) {
        if (count == null || count >= 5 || count <= 0) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}
