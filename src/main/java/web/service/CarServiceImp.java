package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCars(int count) {
        if (count == -1) {
            return carDao.getCars();
        }
        return carDao.getCars().subList(0, count);
    }
}
