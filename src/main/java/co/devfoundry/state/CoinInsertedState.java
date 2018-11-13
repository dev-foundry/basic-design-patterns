package co.devfoundry.state;

import java.util.Random;

public class CoinInsertedState implements State {
    
    static final private Random random  = new Random();
    
    public void insertTheCoin(SlotMachine context) {
        System.out.println("Moneta znajduję się już w automacie.");        
    }

    public void pushTheLever(SlotMachine context) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if(result<20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            context.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            context.state = new NoCoinState();
        }
    }

    public void collectTheWinnings(SlotMachine context) {
        System.out.println("Pociągnij dźwignie by sprawdzić swoje szczęście.");
    }

    public void currentState(SlotMachine context) {
        System.out.println("Aktualny stan - WRZUCONO MONETĘ");
    }
}
