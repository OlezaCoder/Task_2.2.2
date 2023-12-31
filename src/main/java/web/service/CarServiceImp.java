package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDAO carDAO;
    @Override
    public List<Car> listCars(Integer count) {
        return carDAO.listCars(count);
    }
}
