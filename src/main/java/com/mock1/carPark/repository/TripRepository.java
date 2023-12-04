package com.mock1.carPark.repository;

import com.mock1.carPark.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, String> {
}
