package co.devfoundry;

public abstract class Terrain {

    private String description;

    public Terrain(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int fuelCost() {
        return 10;
    }
}
