package co.devfoundry.state;

public class SlotMachine {

    State state;

    public SlotMachine() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheLever() {
        state.pushTheLever(this);
    }

    public void collectTheWinnings() {
        state.collectTheWinnings(this);
    }

    public void currentState() {
        state.currentState(this);
    }
}
