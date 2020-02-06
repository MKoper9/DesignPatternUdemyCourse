package strategy;

import strategy.chef.Chef;

public class Main {
    public static void main(String[] args) {

        //new order
        Chef chef = new Chef("Gordon Gessler");
        chef.cook();
        //new order - scrambled eggs with bacon
        chef.cook();


    }
}
