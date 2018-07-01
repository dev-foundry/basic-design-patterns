package co.devfoundry.visitor;

import co.devfoundry.transport.Animal;
import co.devfoundry.transport.Person;
import co.devfoundry.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment aShipment);

}
