package co.devfoundry.transport;

import co.devfoundry.visitor.TransportVisitor;

public class Person implements Transportable {

    private String fristName;
    private String lastName;
    private boolean isRegularCustomer;

    public Person(String fristName, String lastName, boolean isRegularCustomer) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

}
