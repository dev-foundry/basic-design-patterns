package co.devfoundry.patterns.adapter;

public class UkToContinentalAdapter implements ContinentalPlug {

    UKPlug ukPlug;

    public UkToContinentalAdapter(UKPlug plug) {
        this.ukPlug = plug;
    }

    public void passElectricity() {
        ukPlug.powerOn();
    }
}
