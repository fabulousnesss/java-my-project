package main.java.com.fabulousnesss.myproject;

public class Client extends User {
    private Ticket ticket;

    public Client(Ticket ticket) {
        super("Client");
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
