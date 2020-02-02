package factoryHomework.units;

import java.time.Year;

public abstract class Car {

    private double engineCapity;
    private String fuel;
    private String yearOfProduction;
    private String steeringWheelPosition;

    protected Car(double engineCapity, String fuel, String yearOfProduction, String steeringWheelPosition) {
        this.engineCapity = engineCapity;
        this.fuel = fuel;
        this.yearOfProduction = yearOfProduction;
        this.steeringWheelPosition=steeringWheelPosition;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
