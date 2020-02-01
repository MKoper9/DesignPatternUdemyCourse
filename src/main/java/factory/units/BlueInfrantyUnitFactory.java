package factory.units;

public class BlueInfrantyUnitFactory extends InfrantyFactory {
    @Override
    public InfrantyUnit createUnit(UnitType type) {
        switch (type)
        {
            case TANK:
                return new Tank(200,0,200);
            case RIFLEMAN:
                return new Rifleman(20,0,6);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
