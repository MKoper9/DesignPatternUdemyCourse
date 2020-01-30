package notification;

import order.Order;

public class Email {
    public void updateOrderStatus(Order order) {
        System.out.println("Email - Zamówienie numer: " + order.getOrderNumber() + " zmianiło status na: " + order.getOrderStatus());
    }

}
