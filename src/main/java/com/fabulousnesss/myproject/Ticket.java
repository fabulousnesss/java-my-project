package main.java.com.fabulousnesss.myproject;

import static main.java.com.fabulousnesss.myproject.utils.AnnotationUtils.NullableWarning;

import main.java.com.fabulousnesss.myproject.utils.AnnotationUtils;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class Ticket extends Identity {
    private long creationTime;
    private double backpackWeightKg;
    @NullableWarning
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
        AnnotationUtils.printNullableWarnings(this);
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Ticket other = (Ticket) obj;
        double epsilon = 0.000001d;
        return this.creationTime == other.creationTime &&
                Math.abs(this.backpackWeightKg - other.backpackWeightKg) < epsilon &&
                this.eventCode == other.eventCode &&
                this.isPromo == other.isPromo &&
                this.stadiumSector == other.stadiumSector &&
                Objects.equals(this.concertHall, other.concertHall) &&
                Objects.equals(this.ticketId, other.ticketId) &&
                this.price.compareTo(other.price) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + Long.hashCode(creationTime);
        result = 37 * result + Double.hashCode(backpackWeightKg);
        result = 37 * result + eventCode;
        result = 37 * result + (isPromo ? 1 : 0);
        result = 37 * result + Character.hashCode(stadiumSector);
        result = 37 * result + (concertHall != null ? concertHall.hashCode() : 0);
        result = 37 * result + (ticketId != null ? ticketId.hashCode() : 0);
        result = 37 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "creationTime=" + creationTime +
                ", backpackWeightKg=" + backpackWeightKg +
                ", eventCode=" + eventCode +
                ", isPromo=" + isPromo +
                ", stadiumSector=" + stadiumSector +
                ", concertHall=" + concertHall +
                ", ticketId=" + ticketId +
                ", price=" + price +
                '}';
    }

    public boolean shared(String phoneNumber) {
        return phoneNumber != null;
    }

    public boolean shared(String phoneNumber, String email) {
        return phoneNumber != null && email != null;
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
