package factory.units;

public class BlueFactory extends Factory {
    @Override
    public InfrantyUnit createUnit(UnitType type) {
        switch (type){
            case RIFLEMAN:
                return new Rifleman(20,0,5);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }

    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(100,0,30);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(75,0,25);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
