package notification;

import order.Order;

public class MobileApplication {
    public void updateOrderStatus(Order order) {
        System.out.println("Aplikacja mobilna - Zamówienie numer: " + order.getOrderNumber() + " zmianiło status na: " + order.getOrderStatus());
    }
}
