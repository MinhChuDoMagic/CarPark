package com.mock1.carPark.service;

import com.mock1.carPark.domain.Car;
import com.mock1.carPark.dto.CarDto;

import java.util.List;

public interface CarService {
    public List<Car> get();
//    public Car get(String carId);
    public Car add(CarDto carDto);
}
