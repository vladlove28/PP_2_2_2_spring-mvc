package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("RENO", 2222, 2));
        cars.add(new Car("BMW", 3333, 3));
        cars.add(new Car("AUDI", 4444, 4));
        cars.add(new Car("SKODA", 5555, 5));
        cars.add(new Car("LADA", 6666, 6));
    }

    @Override
    public List<Car> returnList(int number) {
        if (number == 0 || number > 5) {
            return cars;
        } else {
            return cars.stream().limit(number).collect(Collectors.toList());
        }
    }

}
