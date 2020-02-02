package flyweight.flyweight;

public class UnitsStatsRepository {
    private static DestroyerUnitStats destroyerUnitStats=new DestroyerUnitStats("Destroyer",500,80,100,20,1000);
    private static RiflemanUnitStats riflemanUnitStats=new RiflemanUnitStats("Rifleman", 20,5,20,15,100);
    private static TestTankUnitStats testTankUnitStats = new TestTankUnitStats("Tank", 100, 100, 50, 20, 500);

    public UnitsStatsRepository() {
    }

    public static DestroyerUnitStats getDestroyerStats(){
        return destroyerUnitStats;
    };

    public static RiflemanUnitStats getRiflemanStats() {
        return riflemanUnitStats;
    }

    public static TestTankUnitStats getTestTanStats() {
        return testTankUnitStats;
    }
}
