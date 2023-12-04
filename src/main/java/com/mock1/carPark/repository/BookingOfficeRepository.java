package com.mock1.carPark.repository;

import com.mock1.carPark.domain.BookingOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingOfficeRepository extends JpaRepository<BookingOffice, String> {
}
