package com.art.tecketservice.service;

import com.art.tecketservice.client.PriceServiceClient;
import com.art.tecketservice.entity.Ticket;
import com.art.tecketservice.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

@Service
@AllArgsConstructor
public class TicketService {

    private final static Ticket DEFAULT_TICKET = new Ticket("bus");
    private final TicketRepository ticketRepository;
    private final PriceServiceClient priceServiceClient;

    public BigDecimal getTotalPrice(Long number) {
        var randomId = generateRandomId();
        var ticket = ticketRepository.findById(randomId).orElse(DEFAULT_TICKET);
        var price = priceServiceClient.getPrice(ticket.getType());

        return new BigDecimal(number * price).setScale(2, RoundingMode.CEILING);
    }

    private Long generateRandomId() {
        Random random = new Random();
        return random.nextLong(3) + 1;
    }
}
