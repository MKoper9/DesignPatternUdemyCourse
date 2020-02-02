package factoryHomework.units;

import java.time.Year;

public class Ford extends Car {
    protected Ford(double engineCapity, String fuel, Year yearOfProduction) {
        super(engineCapity, fuel, yearOfProduction);
    }
}
