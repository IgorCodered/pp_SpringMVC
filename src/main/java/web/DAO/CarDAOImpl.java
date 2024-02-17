package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    List<Car> cars = Arrays.asList(
            new Car("BMW", 180, "5"),
            new Car("Лада", 300, "3"),
            new Car("Мерседес", 789, "1"),
            new Car("Бугатти", 123, "5"),
            new Car("Порш", 345, "5"),
            new Car("Ауди", 250, "3"),
            new Car("Лада", 200, "2"),
            new Car("Ока", 1000, "5"));

    @Override
    public List<Car> getCountCars(int count) {
        List<Car> carsCounting;
        if (count <= 0) {
            carsCounting = cars;
        } else {
            carsCounting = cars.stream().limit(count).toList();
        }
        return carsCounting;
    }
}
