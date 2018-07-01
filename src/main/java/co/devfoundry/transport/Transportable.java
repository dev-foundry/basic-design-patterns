package co.devfoundry.transport;

import co.devfoundry.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}
