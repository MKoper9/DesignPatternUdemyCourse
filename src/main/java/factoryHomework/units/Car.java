package factoryHomework.units;

import java.time.Year;

public abstract class Car {

    private double engineCapity;
    private String fuel;
    private Year yearOfProduction;

    protected Car(double engineCapity, String fuel, Year yearOfProduction) {
        this.engineCapity = engineCapity;
        this.fuel = fuel;
        this.yearOfProduction = yearOfProduction;
    }
}
