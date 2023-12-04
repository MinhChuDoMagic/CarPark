package com.mock1.carPark.service.impl;

import com.mock1.carPark.domain.ParkingLot;
import com.mock1.carPark.repository.ParkingLotRepository;
import com.mock1.carPark.service.ParkingLotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParkingLotServiceImpl implements ParkingLotService {
    private final ParkingLotRepository parkingLotRepository;


    @Override
    public List<ParkingLot> get() {
        return parkingLotRepository.findAll();
    }

    @Override
    public ParkingLot add(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }
}
