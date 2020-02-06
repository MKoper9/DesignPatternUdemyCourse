package visitor.visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmil;
import visitor.activity.Weights;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(Treadmil treadmil) {
        System.out.println("Calories burned running of treadmil: " +treadmil.getDistance()*3);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: " + weights.getReps()*weights.getWeight()*2);
    }

    @Override
    public void visit(Squash squash) {
            System.out.println("Calories burned playing squash: " +squash.getMinutesPlayed()*20);

    }
}
