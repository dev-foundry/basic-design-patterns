package co.devfoundry;

import co.devfoundry.patterns.adapter.*;

public class Main {

    public static void main(String[] args) {

        ContinentalSocket socketCont = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        ContinentalPlug radio = new ContinentalPlug() {
            public void passElectricity() {
                System.out.println("Gra muzyka");
            }
        };

        socketCont.plugIn(radio);

        UKPlug radioZUK = new UKPlug() {
            public void powerOn() {
                System.out.println("Gra angielska muzyka");
            }
        };


        UkToContinentalAdapter adapter = new UkToContinentalAdapter(radioZUK);

        socketCont.plugIn(adapter);


        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(radio,radioZUK);

        socketCont.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);

    }

}
