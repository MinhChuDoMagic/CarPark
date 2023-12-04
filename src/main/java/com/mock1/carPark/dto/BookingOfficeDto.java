package com.mock1.carPark.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingOfficeDto {
    private LocalDate endContractDate;
    private String officeName;
    private String officePhone;
    private String officePlace;
    private long price;
    private LocalDate startContractDeadline;
    private String tripId;
}
