package observer.notification;

import observer.order.Order;

public class MobileApplication implements Observer {
    public void update(Order order) {
        System.out.println("Aplikacja mobilna - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
