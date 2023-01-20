package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.io.IOException;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
    private final CarDao carDao;
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getAllCars(String count1) {
        int count = Integer.parseInt(count1);
        return carDao.getAllCars(count);
    }

}
