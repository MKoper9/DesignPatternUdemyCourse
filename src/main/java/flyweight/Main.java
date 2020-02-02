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
            activeUnits.add(new TestTank(0,0));
            activeUnits.add(new Rifleman(0,0));
            activeUnits.add(new Destroyer(20,10));

        }
    }
}
