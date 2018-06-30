package co.devfoundry.activity;

import co.devfoundry.visitor.Visitor;

public class Weights implements Activity {

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

}
