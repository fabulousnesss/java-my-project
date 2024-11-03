package main.java.com.fabulousnesss.myproject;

import java.math.BigDecimal;

public class TicketService {
    public static final double MAX_BACKPACK_WEIGHT_KG = 8.0;
    public static final String EMPTY_STRING = "";
    public static final String EVENT_CODE_PATTERN = "^\\d{3}$";
    public static final String CONCERT_HALL_PATTERN = "^[a-zA-Z]{0,10}$";
    public static final String STADIUM_SECTOR_PATTERN = "^[ABC]$";
    public static final String ID_PATTERN = "^(?=.*\\d{0,4})(?=.*[\\w\\W]{0,4}).{1,8}$";

    public static boolean isTicketValid(int eventCode, String concertHall) {
        return concertHall != null &&
                String.valueOf(eventCode).matches(EVENT_CODE_PATTERN) &&
                concertHall.matches(CONCERT_HALL_PATTERN);
    }

    public static boolean isTicketValid(double backpackWeightKg, int eventCode, char stadiumSector, String concertHall, String id, BigDecimal price) {
        return concertHall != null && id != null && price != null &&
                backpackWeightKg <= MAX_BACKPACK_WEIGHT_KG &&
                String.valueOf(eventCode).matches(EVENT_CODE_PATTERN) &&
                concertHall.matches(CONCERT_HALL_PATTERN) &&
                String.valueOf(stadiumSector).matches(STADIUM_SECTOR_PATTERN) &&
                id.matches(ID_PATTERN) &&
                price.compareTo(BigDecimal.ZERO) >= 0;
    }

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket(455, "Moon");
        Ticket ticket3 = new Ticket(4.0, 539, true, 'A', "ACE", "*3OP1$#", new BigDecimal("200"));
    }
}
