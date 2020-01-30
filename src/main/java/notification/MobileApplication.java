package notification;

import order.Order;

public class MobileApplication implements Observer {
    public void update(Order order) {
        System.out.println("Aplikacja mobilna - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
