package observerHomework.notification;

import observer.order.Order;

public interface Observer {
    void updateForecast(Order order);
}
