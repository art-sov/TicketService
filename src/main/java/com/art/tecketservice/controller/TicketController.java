package com.art.tecketservice.controller;

import com.art.tecketservice.entity.Ticket;
import com.art.tecketservice.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/ticketapi")
@AllArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @RequestMapping(value = "/tickets/{number}", method = RequestMethod.GET)
    public BigDecimal getTotalPrice(@PathVariable("number") Long number) {
        return ticketService.getTotalPrice(number);
    }
}
