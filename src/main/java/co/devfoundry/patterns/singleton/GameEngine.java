package co.devfoundry.patterns.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine() {

    }

    public void run() {
        while(true) {
            //czekamy na input gracza
            //zmienamy stan gry
            //renderujemy grafike
        }
    }

    public static GameEngine getInstance() {

        if(instance==null) {
            instance = new GameEngine();
        }

        return instance;

    }
}
