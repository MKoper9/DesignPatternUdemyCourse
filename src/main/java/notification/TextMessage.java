package notification;

import order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS - Zamówienie numer: " + order.getOrderNumber() + " zmianiło status na: " + order.getOrderStatus());
    }
}
