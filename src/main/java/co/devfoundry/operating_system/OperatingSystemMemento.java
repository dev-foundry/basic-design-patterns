package co.devfoundry.operating_system;

class OperatingSystemMemento {

    private int backup;

    OperatingSystemMemento(int backup) {
        this.backup = backup;
    }

    int getBackup() {
        return backup;
    }

}
