package factory.units;

public class RedInfrantyUnitFactory extends InfrantyFactory {
    @Override
    public InfrantyUnit createUnit(UnitType type) {
        switch (type)
        {
            case TANK:
                return new Tank(200,0,200);
            case RIFLEMAN:
                return new Rifleman(10,0,10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
