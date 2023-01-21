package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao{
    private final List <Car> allCars;

    {
        allCars = new ArrayList<>();
        allCars.add(new Car ("Mercedec", 123, "white"));
        allCars.add(new Car ("BMW", 456, "black"));
        allCars.add(new Car("Bentley", 789, "red"));
        allCars.add(new Car("Audi", 321, "grey"));
        allCars.add(new Car("Lamborghini", 746, "blue"));
    }

    @Override
    public List<Car> getAllCars(int count) {
        if (count<=0) {
            return allCars.stream().limit(0).toList();
        } else {
            return allCars.stream().limit(count).toList();
        }
    }

}
