package co.devfoundry;

public class CupFullState implements State {

    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Zabierz kubek");
    }

    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Zabierz najpierw kubek");
    }

    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Zabrano kubek");
        coffeeMachine.state = new NoCoinState();
    }

    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Za pozno");
    }
}
