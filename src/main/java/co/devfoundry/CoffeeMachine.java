package co.devfoundry;

public class CoffeeMachine {

    State state;

    public CoffeeMachine() {
        state = State.NO_COIN;
    }

    public void insertTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("Wrzucono monete.");
                state = State.COIN_INSERTED;
                break;
            case COIN_INSERTED:
                System.out.println("Moneta zostala juz wrzucona.");
                break;
            case CUP_FULL:
                System.out.println("Najpierw zabierz kubek.");
        }
    }

    public void pressTheButton() {
        switch (state) {
            case NO_COIN:
                System.out.println("Wrzuc monete.");
                break;
            case COIN_INSERTED:
                System.out.println("Nalewam kawe.");
                state = State.CUP_FULL;
                break;
            case CUP_FULL:
                System.out.println("Najpierw zabierz kubek.");
        }
    }

    public void takeTheCup() {
        switch (state) {
            case NO_COIN:
                System.out.println("Wrzuc monete.");
                break;
            case COIN_INSERTED:
                System.out.println("Wcisnij guzik.");
                break;
            case CUP_FULL:
                System.out.println("Zabrano kubek.");
                state = State.NO_COIN;
        }
    }

    public void returnTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("Brak monety do zwrotu.");
                break;
            case COIN_INSERTED:
                System.out.println("Zwracam monete.");
                state = State.NO_COIN;
                break;
            case CUP_FULL:
                System.out.println("Kawa zostala juz nalana.");
        }
    }

    public enum State {
        NO_COIN,COIN_INSERTED,CUP_FULL
    }
}
