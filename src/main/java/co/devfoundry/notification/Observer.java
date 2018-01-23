package co.devfoundry.notification;

import co.devfoundry.order.Order;

public interface Observer {

    void update(Order order);

}
