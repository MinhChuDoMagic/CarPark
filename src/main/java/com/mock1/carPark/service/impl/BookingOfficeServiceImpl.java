package com.mock1.carPark.service.impl;

import com.mock1.carPark.domain.BookingOffice;
import com.mock1.carPark.domain.Trip;
import com.mock1.carPark.dto.BookingOfficeDto;
import com.mock1.carPark.repository.BookingOfficeRepository;
import com.mock1.carPark.repository.TripRepository;
import com.mock1.carPark.service.BookingOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingOfficeServiceImpl implements BookingOfficeService {
    private final BookingOfficeRepository bookingOfficeRepository;
    private final TripRepository tripRepository;

    @Override
    public List<BookingOffice> get() {
        return bookingOfficeRepository.findAll();
    }

    @Override
    public BookingOffice add(BookingOfficeDto bookingOfficeDto) {
        Trip trip = tripRepository.findById(bookingOfficeDto.getTripId()).orElse(null);
        return bookingOfficeRepository.save(new BookingOffice(null, bookingOfficeDto.getEndContractDate(),
                bookingOfficeDto.getOfficeName(), bookingOfficeDto.getOfficePhone(),
                bookingOfficeDto.getOfficePlace(), bookingOfficeDto.getPrice(),
                bookingOfficeDto.getStartContractDeadline(), trip));
    }
}
