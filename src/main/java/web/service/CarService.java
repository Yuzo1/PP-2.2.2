package service;

import model.Car;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> listCar();

    List<Car> listCars();

    List<Car> severalCars(int several);
}
