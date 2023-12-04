package com.mock1.carPark.repository;

import com.mock1.carPark.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, String> {
}
