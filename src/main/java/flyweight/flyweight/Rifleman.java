package flyweight.flyweight;

public class Rifleman {

    private int x;
    private int y;
    private int hpLeft;
    private RiflemanUnitStats stats;


    public Rifleman(int x, int y) {
        stats = UnitsStatsRepository.getRiflemanStats();
        this.x = x;
        this.y = y;
        this.hpLeft =stats.getHp();
   }
}
