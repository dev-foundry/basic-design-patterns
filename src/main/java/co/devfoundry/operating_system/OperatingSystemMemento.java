package co.devfoundry.operating_system;

import java.util.Date;

class OperatingSystemMemento {

    private int backupNumber;
    private Date backupDate;

    OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    int getBackupNumber() {
        return backupNumber;
    }

    Date getBackupDate() {
        return backupDate;
    }

}
