package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarDAO repository;

    @Autowired
    public CarServiceImpl(CarDAO repository) {
        this.repository = repository;
    }

    @Override
    public List<Car> getCountCars(int count) {
        return repository.getCountCars(count);
    }
}
