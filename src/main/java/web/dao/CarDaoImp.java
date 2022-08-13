package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCars() {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("BMW F20", "Black", 2015));
        listCars.add(new Car("Fiat Bravo", "Black", 2008));
        listCars.add(new Car("GAZel NEXT", "Red wine", 2008));
        listCars.add(new Car("Porsche Cayman", "Green", 2016));
        listCars.add(new Car("Hyundai SantaFe", "Black", 2008));
        return listCars;
    }
}
