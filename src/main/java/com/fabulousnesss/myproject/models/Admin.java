package main.java.com.fabulousnesss.myproject.models;

import main.java.com.fabulousnesss.myproject.core.User;

public class Admin extends User {
    Admin() {
        super("Admin");
    }

    public boolean checkTicket(Ticket ticket) {
        return ticket.getEventCode() >= 0;
    }
}
