package model;

public class Ticket {
    int cost;
    int count;
    int discount;
    int travel_duration;
    int time_departure;


    public Ticket(int cost, int count, int discount, int travel_duration, int time_departure) {
        this.cost = cost;
        this.count = count;
        this.time_departure = time_departure;
        this.travel_duration = travel_duration;
        this.discount = discount;
    }


    public int counting_cost() {
        return cost * count * (100 - discount) / 100;
    }
}
