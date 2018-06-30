package co.devfoundry;


import co.devfoundry.activity.Activity;
import co.devfoundry.activity.Squash;
import co.devfoundry.activity.Treadmill;
import co.devfoundry.activity.Weights;
import co.devfoundry.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(400);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("----------------------");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));

    }

}
