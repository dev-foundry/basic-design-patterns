package co.devfoundry.patterns.adapter;

public class TwoWayAdapter implements ContinentalPlug, UKPlug {

    ContinentalPlug continentalPlug;
    UKPlug ukPlug;

    public TwoWayAdapter(ContinentalPlug continentalPlug, UKPlug ukPlug) {
        this.continentalPlug = continentalPlug;
        this.ukPlug = ukPlug;
    }

    public void passElectricity() {

        ukPlug.powerOn();

    }

    public void powerOn() {
        continentalPlug.passElectricity();
    }
}
