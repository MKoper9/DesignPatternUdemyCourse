package factory;

import factory.units.*;

public class Main {

    InfrantyFactory factory =new RedInfrantyUnitFactory();
    InfrantyUnit tank = factory.createUnit(UnitType.TANK);
    InfrantyUnit infrantyMan =factory.createUnit(UnitType.RIFLEMAN);
}
