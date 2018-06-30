package co.devfoundry.activity;

import co.devfoundry.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);

}
