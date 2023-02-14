package model;

public class Ticket_Old extends Ticket {
    int discount;

    public Ticket_Old(int cost, int count, int discount, int travel_duration, int time_departure) {
        super(cost, count, travel_duration, time_departure, discount);
    }

    public int counting_cost() {
        return cost * count * (100 - discount) / 100;
    }
}
