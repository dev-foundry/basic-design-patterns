package co.devfoundry;

import co.devfoundry.deliverybox.DeliveryBox;
import co.devfoundry.deliverybox.DeliveryBoxSystem;

public class Main {

    public static void main(String[] args) {

        pickupPackage();

    }

    private static void pickupPackage() {
        DeliveryBox deliveryBox = new DeliveryBox();
        DeliveryBoxSystem deliveryBoxSystem = new DeliveryBoxSystem();

        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }

}
