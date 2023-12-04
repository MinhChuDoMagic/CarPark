package com.mock1.carPark.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @UuidGenerator
    private String ticketId;
    private LocalTime bookingTime;
    private String customerName;
    @ManyToOne
    @JoinColumn(name = "licensePlate")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;
}
