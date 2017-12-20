package co.devfoundry.templateMethod;

public class ClassicCarStartingSequence extends CarStartingSequence {

    public void setTheGear() {
        System.out.println("Ustawiamy bieg");
    }

    public void startTheIgnition() {
        System.out.println("Przekrecamy kluczyk");
    }
}
