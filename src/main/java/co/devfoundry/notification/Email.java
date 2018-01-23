package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("E-mail - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
