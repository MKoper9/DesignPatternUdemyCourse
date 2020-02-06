package visitor.visitor;

import visitor.activity.Squash;
import visitor.activity.Treadmil;
import visitor.activity.Weights;

public interface Visitor {

    void visit(Treadmil treadmil);
    void visit(Weights weights);
    void visit(Squash squash);


}
