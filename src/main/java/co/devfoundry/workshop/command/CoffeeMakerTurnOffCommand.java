package co.devfoundry.workshop.command;

import co.devfoundry.workshop.CoffeeMaker;

public class CoffeeMakerTurnOffCommand implements Command {

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOffCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void execute() {
        coffeeMaker.turnOff();
    }

    public void undo() {
        coffeeMaker.turnOn();
    }
}
