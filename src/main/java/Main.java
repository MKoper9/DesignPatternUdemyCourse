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

        order.registerObserver(textMessage);
        order.registerObserver(mobileApplication);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("______________________________");
        order.changeOrderStatus(OrderStatus.ODEBRANE);
        order.unregisterObserver(email);
        System.out.println("______________________________");
        order.changeOrderStatus(OrderStatus.WYSLANE);
    }
}
