package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }


    @GetMapping("/cars")
    public String getCountCars(@RequestParam(value = "count", defaultValue = "0") int count,
                               ModelMap map) {
        map.addAttribute("cars", service.getCountCars(count));
        return "cars";
    }
}
