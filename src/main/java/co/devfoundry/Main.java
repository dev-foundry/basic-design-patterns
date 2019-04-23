package co.devfoundry;

import co.devfoundry.bank.AtmMachineFacade;

public class Main {

    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

    }

}
