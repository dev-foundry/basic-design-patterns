package co.devfoundry;

public class Main {

    public static void main(String[] args) {

        QuessGame game = QuessGame.getInstance();

        game.play();

        int score = game.getScore();

        QuessGame anotherGameReference = QuessGame.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }

    }

}
