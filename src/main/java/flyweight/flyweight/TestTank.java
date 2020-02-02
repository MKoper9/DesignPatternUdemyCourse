package flyweight.flyweight;

public class TestTank {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public TestTank(int x, int y) {
;       this.stats = UnitsStatsRepository.getTestTanStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();

    }
}
