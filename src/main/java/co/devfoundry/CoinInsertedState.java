package co.devfoundry;

public class CoinInsertedState implements State {

    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta zostala juz wrzucona");
    }

    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Nalewam kawe");
        coffeeMachine.state = new CupFullState();
    }

    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wcisnij guzik");
    }

    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Zwracam monete");
        coffeeMachine.state = new NoCoinState();
    }
}
