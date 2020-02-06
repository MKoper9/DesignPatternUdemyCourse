package strategy.chef.eggCoocker;

public class SoftBoildeEggCooker implements EggCooker  {
    @Override
    public void cookEgg() {
        System.out.println("I cook soft boild egg");
    }
}
