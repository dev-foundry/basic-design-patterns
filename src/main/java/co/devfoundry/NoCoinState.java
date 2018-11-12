package co.devfoundry;

public class NoCoinState implements State {

    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta zostala wrzucona");
        coffeeMachine.state = new CoinInsertedState();
    }

    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuc monete");
    }

    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuc monete");
    }

    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuc monete");

    }
}
