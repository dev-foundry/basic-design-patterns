package co.devfoundry.operating_system;

public class OperatingSystem {

    private int backup = 0;

    public void createBackup() {
        this.backup++;
        System.out.println("Utworzono backup nr: " + this.backup);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backup);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {
        this.backup = operatingSystemMemento.getBackup();
    }

}
