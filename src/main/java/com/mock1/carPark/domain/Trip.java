package com.mock1.carPark.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@NoArgsConstructor
public class Trip {
    @Id
    @UuidGenerator
    private String tripId;
    private int bookedTicketNumber;
    private String carType;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private String destination;
    private String driver;
    private int maximumOnlineTicketNumber;

    public Trip(int bookedTicketNumber, String carType, LocalDate departureDate, LocalTime departureTime, String destination, String driver, int maximumOnlineTicketNumber) {
        this.bookedTicketNumber = bookedTicketNumber;
        this.carType = carType;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.driver = driver;
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
    }
}
