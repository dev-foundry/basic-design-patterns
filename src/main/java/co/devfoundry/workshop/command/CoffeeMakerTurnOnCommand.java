package co.devfoundry.workshop.command;

import co.devfoundry.workshop.CoffeeMaker;

public class CoffeeMakerTurnOnCommand implements Command {

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void execute() {
        coffeeMaker.turnOn();
    }

    public void undo() {
        coffeeMaker.turnOff();
    }

}
