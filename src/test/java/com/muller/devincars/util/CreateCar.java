package com.muller.devincars.util;

import com.muller.devincars.model.Car;

public class CreateCar {

    public static Car carValid() {
        Car car = new Car();
        car.setAno(2020);
        car.setFabricante("Ford");
        car.setModelo("Ranger");
        return car;
    }
}
