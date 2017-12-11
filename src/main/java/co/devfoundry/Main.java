package co.devfoundry;

import co.devfoundry.patterns.adapter.ContinentalDevice;
import co.devfoundry.patterns.adapter.ContinentalSocket;
import co.devfoundry.patterns.adapter.UKDevice;
import co.devfoundry.patterns.adapter.UKSocket;

public class Main {

    public static void main(String[] args) {


        ContinentalDevice radio = new ContinentalDevice() {
            public void on() {
                System.out.println("Gra muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("Londyn plonie");
            }
        };

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukRadio);

//        continentalSocket.plugIn(ukRadio);

    }

}
