package co.devfoundry;

import co.devfoundry.operating_system.OperatingSystem;
import co.devfoundry.operating_system.OperatingSystemCaretaker;

public class Main {

    public static void main(String[] args) {

        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();

        operatingSystem.createBackup();
        operatingSystem.createBackup();

        operatingSystemCaretaker.addMemento(operatingSystem.save());

        operatingSystem.createBackup();
        operatingSystem.createBackup();

        operatingSystem.load(operatingSystemCaretaker.getMemento());

    }

}
