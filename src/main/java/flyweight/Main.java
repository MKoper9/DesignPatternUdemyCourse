package flyweight;

import flyweight.flyweight.Destroyer;
import flyweight.flyweight.Rifleman;
import flyweight.flyweight.TestTank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> activeUnits = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            activeUnits.add(new TestTank("Tank",100,100,50,25,0,0,100));
            activeUnits.add(new Rifleman("Rifleman",10,10,5,15,10,10,10));
            activeUnits.add(new Destroyer("Destroyer",500,80,100,20,20,10,1000));

        }
    }
}
