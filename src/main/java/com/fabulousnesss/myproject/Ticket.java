package main.java.com.fabulousnesss.myproject;

import java.math.BigDecimal;
import java.time.Instant;

public class Ticket {
    private final long creationTime;
    private double backpackWeightKg;
    private int eventCode;
    private boolean isPromo;
    private char stadiumSector;
    private String concertHall;
    private String id;
    private BigDecimal price;

    public Ticket() {
        this.creationTime = Instant.now().getEpochSecond();
        this.concertHall = TicketService.EMPTY_STRING;
        this.id = TicketService.EMPTY_STRING;
        this.price = BigDecimal.ZERO;
    }

    public Ticket(int eventCode, String concertHall) {
        this();
        if (TicketService.isTicketValid(eventCode, concertHall)) {
            this.eventCode = eventCode;
            this.concertHall = concertHall;
        }
    }

    public Ticket(double backpackWeightKg, int eventCode, boolean isPromo, char stadiumSector, String concertHall, String id, BigDecimal price) {
        this();
        if (TicketService.isTicketValid(backpackWeightKg, eventCode, stadiumSector, concertHall, id, price)) {
            this.backpackWeightKg = backpackWeightKg;
            this.eventCode = eventCode;
            this.isPromo = isPromo;
            this.stadiumSector = stadiumSector;
            this.concertHall = concertHall;
            this.id = id;
            this.price = price;
        }
    }
}
