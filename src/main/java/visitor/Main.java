package visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmil;
import visitor.activity.Weights;

public class Main {


    public static void main(String[] args) {

        Treadmil treadmil = new Treadmil(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        treadmil.calculateCaloriesBurned();
        squash.calculateCaloriesBurned();
        weights.calculateCaloriesBurned();
    }
}
