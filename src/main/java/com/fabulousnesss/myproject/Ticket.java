package main.java.com.fabulousnesss.myproject;

import java.math.BigDecimal;
import java.time.Instant;

public class Ticket extends AbstractPrintable {
    private long creationTime;
    private double backpackWeightKg;
    private int eventCode;
    private boolean isPromo;
    private char stadiumSector;
    private String concertHall;
    private String ticketId;
    private BigDecimal price;

    public Ticket() {
        this.creationTime = Instant.now().getEpochSecond();
        this.concertHall = TicketService.EMPTY_STRING;
        this.ticketId = TicketService.EMPTY_STRING;
        this.price = BigDecimal.ZERO;
    }

    public Ticket(int eventCode, String concertHall) {
        this();
        if (TicketService.isTicketValid(eventCode, concertHall)) {
            this.eventCode = eventCode;
            this.concertHall = concertHall;
        }
    }

    public Ticket(double backpackWeightKg, int eventCode, boolean isPromo, char stadiumSector, String concertHall, String ticketId, BigDecimal price) {
        this();
        if (TicketService.isTicketValid(backpackWeightKg, eventCode, stadiumSector, concertHall, ticketId, price)) {
            this.backpackWeightKg = backpackWeightKg;
            this.eventCode = eventCode;
            this.isPromo = isPromo;
            this.stadiumSector = stadiumSector;
            this.concertHall = concertHall;
            this.ticketId = ticketId;
            this.price = price;
        }
    }

    public boolean shared(String phoneNumber) {
        return true;
    }

    public boolean shared(String phoneNumber, String email) {
        return true;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public double getBackpackWeightKg() {
        return backpackWeightKg;
    }

    public void setBackpackWeightKg(double backpackWeightKg) {
        this.backpackWeightKg = backpackWeightKg;
    }

    public int getEventCode() {
        return eventCode;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public String getTicketId() {
        return ticketId;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
