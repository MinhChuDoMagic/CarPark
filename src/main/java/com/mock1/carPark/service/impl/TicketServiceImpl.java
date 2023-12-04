package com.mock1.carPark.service.impl;

import com.mock1.carPark.domain.Car;
import com.mock1.carPark.domain.Ticket;
import com.mock1.carPark.domain.Trip;
import com.mock1.carPark.dto.TicketDto;
import com.mock1.carPark.repository.CarRepository;
import com.mock1.carPark.repository.TicketRepository;
import com.mock1.carPark.repository.TripRepository;
import com.mock1.carPark.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final CarRepository carRepository;
    private final TripRepository tripRepository;
    @Override
    public List<Ticket> get() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket add(TicketDto ticketDto) {
        Car car = carRepository.findById(ticketDto.getLicensePlate()).orElse(null);
        Trip trip = tripRepository.findById(ticketDto.getTripId()).orElse(null);
        return ticketRepository.save(new Ticket(null, ticketDto.getBookingTime(), ticketDto.getCustomerName(), car, trip));
    }

    @Override
    public void delete(String ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElse(new Ticket());
        ticketRepository.delete(ticket);
    }
}
