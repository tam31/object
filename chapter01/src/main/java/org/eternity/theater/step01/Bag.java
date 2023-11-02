package org.eternity.theater.step01;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Long putExchangeItem() {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0l;
        } else {
            minusAmount(ticket.getFee());
            setTicket(ticket);
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
