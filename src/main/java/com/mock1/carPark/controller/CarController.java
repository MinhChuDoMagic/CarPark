package com.mock1.carPark.controller;

import com.mock1.carPark.domain.Car;
import com.mock1.carPark.dto.CarDto;
import com.mock1.carPark.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> get() {
        return new ResponseEntity<>(carService.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Car> add(@RequestBody CarDto carDto) {
        return new ResponseEntity<>(carService.add(carDto), HttpStatus.CREATED);
    }
}
