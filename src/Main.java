import model.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(70, 9, 0, 270, 7);
        Ticket ticket_kid = new Ticket(70, 11, 50, 270, 7);
        Ticket ticket_old = new Ticket(70, 5, 30, 270, 7);

        System.out.println("Стоимость взрослых билетов: " + ticket.counting_cost());
        System.out.println("Стоимость детских билетов: " + ticket_kid.counting_cost());
        System.out.println("Стоимость билетов для пожилых людей: " + ticket_old.counting_cost());
        System.out.println("Итого: " + (ticket.counting_cost() +
                ticket_kid.counting_cost() + ticket_old.counting_cost()));
    }
}