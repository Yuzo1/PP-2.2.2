package dao;

import model.Car;

import java.util.List;

public interface CarDao {

    void add(Car car);

    List<Car> listCars();

    List<Car> severalCars(int several);
}
