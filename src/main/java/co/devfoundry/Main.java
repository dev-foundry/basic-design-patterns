package co.devfoundry;


import co.devfoundry.transport.Animal;
import co.devfoundry.transport.Person;
import co.devfoundry.transport.Shipment;
import co.devfoundry.transport.Transportable;
import co.devfoundry.visitor.NameTransportVisitor;
import co.devfoundry.visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);

        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));

        System.out.println("----------------------");

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();

        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));

    }

}
