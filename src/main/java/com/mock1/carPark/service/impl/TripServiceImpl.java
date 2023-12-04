package com.mock1.carPark.service.impl;

import com.mock1.carPark.domain.Trip;
import com.mock1.carPark.repository.TripRepository;
import com.mock1.carPark.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {
    private final TripRepository tripRepository;
    @Override
    public List<Trip> get() {
        return tripRepository.findAll();
    }

    @Override
    public Trip add(Trip trip) {
        return tripRepository.save(trip);
    }
}
