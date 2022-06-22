package com.muller.devincars.controller;

import com.muller.devincars.model.Car;
import com.muller.devincars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @GetMapping
    public List<Car> getCars() {
        return carService.findAllCars();
    }

    @GetMapping(value = "/{id}")
    public Car getCarById(@PathVariable("id") long id) {
        return carService.findById(id).orElse(null);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCarById(@PathVariable("id") long id) {
        carService.remove(id);
    }
}
