package factory.units;

public abstract class Factory {
    abstract public InfrantyUnit createUnit(UnitType type);
    abstract public MechanizedUnit createMechanizedUnit(UnitType type);
    abstract public AirUnit createAirUnit(UnitType unitType);
}
