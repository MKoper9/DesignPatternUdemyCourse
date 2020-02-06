package strategy.chef.eggCoocker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("I cook hard boild egg");
    }
}
