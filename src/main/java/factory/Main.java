package factory;

import factory.units.*;

public class Main {

    Factory blueFactory = new BlueFactory();
    Factory redFactory = new RedFactory();

    MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
    InfrantyUnit redRifleman = redFactory.createUnit(UnitType.RIFLEMAN);

    MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
    InfrantyUnit blueRifleman = blueFactory.createUnit(UnitType.RIFLEMAN);

    AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
    AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);
}
