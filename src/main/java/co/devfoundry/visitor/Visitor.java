package co.devfoundry.visitor;

import co.devfoundry.activity.Squash;
import co.devfoundry.activity.Treadmill;
import co.devfoundry.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);

}
