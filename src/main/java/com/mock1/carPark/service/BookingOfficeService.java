package com.mock1.carPark.service;

import com.mock1.carPark.domain.BookingOffice;
import com.mock1.carPark.dto.BookingOfficeDto;

import java.util.List;

public interface BookingOfficeService {
    public List<BookingOffice> get();
    public BookingOffice add(BookingOfficeDto bookingOfficeDto);
}
