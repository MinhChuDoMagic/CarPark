package com.mock1.carPark.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @UuidGenerator
    private String licensePlate;
    private String carColor;
    private String carType;
    private String company;
    @ManyToOne
    @JoinColumn(name = "parkId")
    private ParkingLot parkingLot;
}
