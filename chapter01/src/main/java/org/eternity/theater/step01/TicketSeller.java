package org.eternity.theater.step01;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void checkTicket(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        if (audience.getBag().hasInvitation()) {
            audience.getBag().setTicket(ticket);
        } else {
            audience.getBag().minusAmount(ticket.getFee());
            getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
