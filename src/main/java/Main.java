import notification.Email;
import notification.MobileApplication;
import notification.TextMessage;
import order.Order;
import order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(100L, OrderStatus.ZARAJESTROWANE);

        Email email = new Email();
        MobileApplication mobileApplication = new MobileApplication();
        TextMessage textMessage = new TextMessage();

        email.updateOrderStatus(order);
        mobileApplication.updateOrderStatus(order);
        textMessage.updateOrderStatus(order);
    }
}
