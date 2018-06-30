package co.devfoundry;

import co.devfoundry.activity.Squash;
import co.devfoundry.activity.Treadmill;
import co.devfoundry.activity.Weights;

public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        treadmill.calculateCaloriesBurned();
        squash.calculateCaloriesBurned();
        weights.calculateCaloriesBurned();

    }

}
