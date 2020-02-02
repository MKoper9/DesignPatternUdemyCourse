package flyweight.flyweight;

public class UnitStats {
    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int resouceCost;

    public UnitStats(String name, int hp, int armour, int damageDealt, int speed, int resouceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.resouceCost = resouceCost;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResouceCost() {
        return resouceCost;
    }
}
