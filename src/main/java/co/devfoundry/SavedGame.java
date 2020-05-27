package co.devfoundry;

import static java.lang.Thread.sleep;

public class SavedGame {

    private String name;
    private String gameData;

    private SavedGame() {

    }

    public static SavedGame initialize() {

        SavedGame instance = new SavedGame();
        instance.name = String.valueOf(System.currentTimeMillis());
        instance.gameData = loadFromStorage();
        return instance;
    }

    public void loadGame() {
        System.out.println("Game loaded");
    }

    private static String loadFromStorage() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Loaded";
    }

    public String getName() {
        return this.name;
    }
}
