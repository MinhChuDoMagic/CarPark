package com.mock1.carPark.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BookingOffice {
    @Id
    @UuidGenerator
    private String officeId;
    private LocalDate endContractDate;
    private String officeName;
    private String officePhone;
    private String officePlace;
    private long price;
    private LocalDate startContractDeadline;
    @ManyToOne
    @JoinColumn(name = "tripId")
    private Trip trip;


}
