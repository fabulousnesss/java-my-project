package main.java.com.fabulousnesss.myproject;

public class Admin extends User {
    Admin() {
        super("Admin");
    }

    public boolean checkTicket(Ticket ticket) {
        return ticket.getEventCode() >= 0;
    }
}
