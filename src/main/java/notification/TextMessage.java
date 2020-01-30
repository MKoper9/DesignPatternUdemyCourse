package notification;

import order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println("SMS - Zamówienie numer: " + order.getOrderNumber() + " zmianiło status na: " + order.getOrderStatus());
    }
}
