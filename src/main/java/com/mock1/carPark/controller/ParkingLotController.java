package com.mock1.carPark.controller;

import com.mock1.carPark.domain.ParkingLot;
import com.mock1.carPark.service.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/park")
@RequiredArgsConstructor
@EnableMethodSecurity(jsr250Enabled = true)
public class ParkingLotController {
    private final ParkingLotService parkingLotService;

    @GetMapping
    public ResponseEntity<List<ParkingLot>> get() {
        return new ResponseEntity<>(parkingLotService.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ParkingLot> add(@RequestBody ParkingLot parkingLot) {
        return new ResponseEntity<>(parkingLotService.add(parkingLot), HttpStatus.CREATED);
    }
}
