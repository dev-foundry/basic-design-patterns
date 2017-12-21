package co.devfoundry;

import co.devfoundry.message.Message;
import co.devfoundry.officer.Officer;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Atakować!");

        Officer officer = new Officer();
//        officer.setCaptain(true);
//        officer.setSergeant(true);

        officer.receiveMessage(message);

    }

}
