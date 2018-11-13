package co.devfoundry;

import co.devfoundry.state.SlotMachine;

public class Main {

    public static void main(String[] args) {

        SlotMachine slotMachine = new SlotMachine();

        slotMachine.insertTheCoin();
        slotMachine.currentState();
        slotMachine.pushTheLever();
        slotMachine.currentState();
        slotMachine.collectTheWinnings();
        slotMachine.currentState();

    }

}
