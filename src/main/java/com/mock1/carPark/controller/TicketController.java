package com.mock1.carPark.controller;

import com.mock1.carPark.domain.Ticket;
import com.mock1.carPark.dto.TicketDto;
import com.mock1.carPark.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> get() {
        return new ResponseEntity<>(ticketService.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ticket> add(@RequestBody TicketDto ticketDto) {
        return new ResponseEntity<>(ticketService.add(ticketDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{ticketId}")
    public ResponseEntity<String> delete(@PathVariable String ticketId){
        ticketService.delete(ticketId);
        return ResponseEntity.ok().build();
    }
}
