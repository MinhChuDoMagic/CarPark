package com.mock1.carPark.controller;

import com.mock1.carPark.domain.BookingOffice;
import com.mock1.carPark.dto.BookingOfficeDto;
import com.mock1.carPark.service.BookingOfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bo")
@RequiredArgsConstructor
public class BookingOfficeController {
    private final BookingOfficeService bookingOfficeService;

    @GetMapping
    public ResponseEntity<List<BookingOffice>> get() {
        return new ResponseEntity<>(bookingOfficeService.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BookingOffice> add(@RequestBody BookingOfficeDto bookingOfficeDto) {
        return new ResponseEntity<>(bookingOfficeService.add(bookingOfficeDto), HttpStatus.CREATED);
    }
}
