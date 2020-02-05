package mementoHomework.app;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup nr: " + this.backupNumber + " z datą: " + backupDate);
    }

    public OperatingSystemMemento save(){
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(){
        System.out.println("backupNumer: "+this.backupNumber+" date: "+backupDate);
    }

}
