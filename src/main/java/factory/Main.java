package factory;

import factory.units.*;

public class Main {

    Factory factory =new UnitFactory();
    Unit tank = factory.createUnit(UnitType.TANK);
    Unit infrantyMan =factory.createUnit(UnitType.RIFLEMAN);
}
