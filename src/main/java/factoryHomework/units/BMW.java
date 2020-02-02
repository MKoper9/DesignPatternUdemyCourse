package factoryHomework.units;

import java.time.Year;

public class BMW extends Car {
    protected BMW(double engineCapity, String fuel, Year yearOfProduction) {
        super(engineCapity, fuel, yearOfProduction);
    }
}
