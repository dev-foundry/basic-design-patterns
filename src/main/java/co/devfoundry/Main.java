package co.devfoundry;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SavedGame> savedGames = loadSavedGames();
        listSavedGames(savedGames);
    }

    public static List<SavedGame> loadSavedGames() {

        int savedGamesCount = 20;
        List<SavedGame> savedGames = new ArrayList<>(savedGamesCount);
        for(int i=0;i<20;i++) {
            savedGames.add(SavedGame.initialize());
        }

        return savedGames;
    }

    private static void listSavedGames(List<SavedGame> savedGames) {
        for(SavedGame savedGame : savedGames) {
            System.out.println(savedGame.getName());
        }
    }

}
