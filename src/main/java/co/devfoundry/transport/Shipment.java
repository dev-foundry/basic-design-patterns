package co.devfoundry.transport;

import co.devfoundry.visitor.TransportVisitor;

public class Shipment implements Transportable {

    private String prefix;
    private String serialNumber;
    private boolean isLarge;

    public Shipment(String prefix, String serialNumber, boolean isLarge) {
        this.prefix = prefix;
        this.serialNumber = serialNumber;
        this.isLarge = isLarge;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isLarge() {
        return isLarge;
    }

}
