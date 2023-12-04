package com.mock1.carPark.service;

import com.mock1.carPark.domain.Trip;

import java.util.List;

public interface TripService {
    public List<Trip> get();
//    public Trip get(String tripId);
    public Trip add(Trip trip);
}
