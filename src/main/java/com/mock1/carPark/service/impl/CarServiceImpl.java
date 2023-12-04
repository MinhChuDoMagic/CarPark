package com.mock1.carPark.service.impl;

import com.mock1.carPark.domain.Car;
import com.mock1.carPark.domain.ParkingLot;
import com.mock1.carPark.dto.CarDto;
import com.mock1.carPark.repository.CarRepository;
import com.mock1.carPark.repository.ParkingLotRepository;
import com.mock1.carPark.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final ParkingLotRepository parkingLotRepository;
    @Override
    public List<Car> get() {
        return carRepository.findAll();
    }

    @Override
    public Car add(CarDto carDto) {
        ParkingLot parkingLot = parkingLotRepository.findById(carDto.getParkId()).orElse(null);
        return carRepository.save(new Car(null, carDto.getCarColor(), carDto.getCarType(),
                carDto.getCompany(), parkingLot));
    }
}
