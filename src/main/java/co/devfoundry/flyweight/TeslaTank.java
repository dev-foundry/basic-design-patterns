package co.devfoundry.flyweight;

public class TeslaTank {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;


    public TeslaTank(int x, int y) {
        this.stats = UnitStatsRepository.getTeslaTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();

    }
}
