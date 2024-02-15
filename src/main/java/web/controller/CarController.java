package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    List<Car> cars = Arrays.asList(
            new Car("BMW", 180, "5"),
            new Car("Лада", 300, "3"),
            new Car("Мерседес", 789, "1"),
            new Car("Бугатти", 123, "5"),
            new Car("Порш", 345, "5"),
            new Car("Ауди", 250, "3"),
            new Car("Лада", 200, "2"),
            new Car("Ока", 1000, "5"));


    @GetMapping("/cars")
    public String getCountCars(@RequestParam(value = "count", defaultValue = "0") int count,
                               ModelMap map) {
        List<Car> carsCounting;
        if (count <= 0) {
            carsCounting = cars;
        } else {
            carsCounting = cars.stream().limit(count).toList();
        }
        map.addAttribute("cars", carsCounting);
        return "cars";
    }
}
