package com.mock1.carPark.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@AllArgsConstructor
public class ParkingLot {
    @Id
    @UuidGenerator
    private String parkId;
    private long parkArea;
    private String parkName;
    private String parkPlace;
    private long parkPrice;
    private String parkStatus;
}
