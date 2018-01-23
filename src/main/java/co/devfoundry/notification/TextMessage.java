package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println("SMS - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
