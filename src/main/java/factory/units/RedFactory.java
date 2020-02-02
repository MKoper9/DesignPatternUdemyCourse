package factory.units;

public class RedFactory extends Factory {
    @Override
    public InfrantyUnit createUnit(UnitType type) {
        switch (type){
            case RIFLEMAN:
                return new Rifleman(25,0,5);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }

    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(100,0,25);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(50,0,50);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
