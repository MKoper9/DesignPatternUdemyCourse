package mementoHomework.app;

import java.util.Date;

public class OperatingSystemMemento {

    private int backupNumber;
    private Date backupDate;

    public OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }
}
