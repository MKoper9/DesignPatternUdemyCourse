package strategy;

import strategy.chef.Chef;
import strategy.chef.eggCoocker.HardBoiledEggCooker;
import strategy.chef.eggCoocker.SoftBoildeEggCooker;

public class Main {
    public static void main(String[] args) {

        //new order hard boiled egg
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //new order soft boilde egg
        chef.setEggCooker(new SoftBoildeEggCooker());
        chef.cook();


    }
}
