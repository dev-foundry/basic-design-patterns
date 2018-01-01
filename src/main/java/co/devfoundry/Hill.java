package co.devfoundry;

public class Hill extends Terrain {

    public Hill() {
        super("Wzgorze");
    }

    @Override
    public int fuelCost() {
        return super.fuelCost() + 20;
    }
}
