package co.devfoundry;

import java.util.Random;
import java.util.Scanner;

public class QuessGame {

    private static QuessGame instance = new QuessGame();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private QuessGame() {

    }

    public static QuessGame getInstance() {

        return instance;

    }

    protected Object readResolve() {
        return getInstance();
    }


    public int getScore() {
        return score;
    }

    public void play() {

        for(int i  = 0; i<10; i++) {
            int number = random.nextInt(9);
            System.out.print("Zgadnij cyfre: ");
            int quess = scanner.nextInt();

            if(number==quess) {
                System.out.println("Udalo sie!");
                score++;
            } else {
                System.out.println("Przykro mi, myslalem o " + number);
            }
        }

        System.out.println("Twoj wynik: " + score);


    }
}
