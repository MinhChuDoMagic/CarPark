package com.mock1.carPark.service;

import com.mock1.carPark.domain.ParkingLot;

import java.util.List;

public interface ParkingLotService {
    public List<ParkingLot> get();
//    public ParkingLot get(String parkId);
    public ParkingLot add(ParkingLot parkingLot);
}
