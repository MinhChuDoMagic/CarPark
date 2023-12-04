package com.mock1.carPark.dto;

import lombok.Getter;

import java.time.LocalTime;

@Getter
public class TicketDto {
    private LocalTime bookingTime;
    private String customerName;
    private String licensePlate;
    private String tripId;
}
