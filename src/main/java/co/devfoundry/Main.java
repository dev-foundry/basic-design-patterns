package co.devfoundry;

import co.devfoundry.patterns.adapter.*;

public class Main {

    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKSocket ukSocket = new UKSocket();

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("London calling to the faraway towns");
            }
        };

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            public void on() {
                System.out.println("London calling to the underworld");
            }
        };


        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio,continentalRadio);

        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);
    }

}
