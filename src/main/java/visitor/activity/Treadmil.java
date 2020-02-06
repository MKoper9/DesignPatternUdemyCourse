package visitor.activity;

import visitor.visitor.Visitor;

public class Treadmil implements Activity{

    private int distance;

    public Treadmil(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
