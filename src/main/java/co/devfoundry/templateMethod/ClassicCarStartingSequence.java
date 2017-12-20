package co.devfoundry.templateMethod;

public class ClassicCarStartingSequence {


    public void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedal gazu");
    }

    private void setTheGear() {
        System.out.println("Ustawiamy bieg");
    }

    private void startTheIgnition() {
        System.out.println("Przekrecamy kluczyk");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }
}
