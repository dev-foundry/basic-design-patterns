package co.devfoundry.units;

abstract public class AirUnit {

    private int hp;
    private int exp;
    private int dmgDone;

    protected AirUnit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDone() {
        return dmgDone;
    }

}
