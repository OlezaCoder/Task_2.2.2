package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "BMW", 324534));
        cars.add(new Car(2, "AUDI", 435345));
        cars.add(new Car(3, "MS", 54634));
        cars.add(new Car(4, "VOLVO", 436453));
        cars.add(new Car(5, "WW", 3254656));
    }


    @Override
    public List<Car> listCars(Integer count) {
        return cars.stream().limit(count != null ? count : Integer.MAX_VALUE).collect(Collectors.toList());
    }
}
