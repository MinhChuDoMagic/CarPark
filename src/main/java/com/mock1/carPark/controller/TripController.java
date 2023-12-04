package com.mock1.carPark.controller;

import com.mock1.carPark.domain.Trip;
import com.mock1.carPark.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
@RequiredArgsConstructor
public class TripController {
    private final TripService tripService;

    @GetMapping
    public ResponseEntity<List<Trip>> get() {
        return new ResponseEntity<>(tripService.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Trip> add(@RequestBody Trip trip) {
        return new ResponseEntity<>(tripService.add(trip), HttpStatus.CREATED);
    }
}
