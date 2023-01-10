package service;

import org.springframework.stereotype.Service;

import model.Car;
import dao.CarDao;
import dao.CarDaoImp;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    CarDao carDao = new CarDaoImp();
    {
            carDao.add(new Car("Skoda", "Octavia", 2013));
            carDao.add(new Car("Renault", "Logan", 2015));
            carDao.add(new Car("Lada", "Vesta", 2019));
            carDao.add(new Car("Peugeot", "307", 2010));
            carDao.add(new Car("SAAB", "9000", 1995));
    }
    @Override
    public void add(Car car) {
        carDao.add(car);
    }

    @Override
    public List<Car> listCar() {
        return carDao.listCars();
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> severalCars(int several) {
        return carDao.severalCars(several);
    }
}
