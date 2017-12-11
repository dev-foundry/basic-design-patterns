package co.devfoundry.patterns.adapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {

    UKDevice ukDevice;
    ContinentalDevice device;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice device) {
        this.ukDevice = ukDevice;
        this.device = device;
    }

    public void on() {
       ukDevice.powerOn();
    }

    public void powerOn() {
        device.on();
    }
}
