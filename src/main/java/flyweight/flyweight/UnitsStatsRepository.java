package flyweight.flyweight;

public class UnitsStatsRepository {
    private static UnitStats destroyerUnitStats=new UnitStats("Destroyer",500,80,100,20,1000);
    private static UnitStats riflemanUnitStats=new UnitStats("Rifleman", 20,5,20,15,100);
    private static UnitStats testTankUnitStats = new UnitStats("Tank", 100, 100, 50, 20, 500);

    public UnitsStatsRepository() {
    }

    public static UnitStats getDestroyerStats(){
        return destroyerUnitStats;
    };

    public static UnitStats getRiflemanStats() {
        return riflemanUnitStats;
    }

    public static UnitStats getTestTanStats() {
        return testTankUnitStats;
    }
}
