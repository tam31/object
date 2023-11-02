package org.eternity.theater.step01;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long requestExchangeTicket(Ticket ticket) {
        return bag.putExchangeItem();
    }
}
