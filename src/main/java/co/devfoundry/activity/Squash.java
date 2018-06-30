package co.devfoundry.activity;

public class Squash {

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public void calculateCaloriesBurned() {
        System.out.println("Calories burned playing squash: " + minutesPlayed * 20);
    }

}
