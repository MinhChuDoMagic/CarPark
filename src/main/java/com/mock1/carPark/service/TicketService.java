package com.mock1.carPark.service;

import com.mock1.carPark.domain.Ticket;
import com.mock1.carPark.dto.TicketDto;

import java.util.List;

public interface TicketService {
    public List<Ticket> get();
    public Ticket add(TicketDto ticketDto);
    public void delete(String ticketId);
}
