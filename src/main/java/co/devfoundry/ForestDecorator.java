package co.devfoundry;

public class ForestDecorator extends TerrainDecorator {

    public ForestDecorator(String description, Terrain terrain) {
        super(description, terrain);
    }

    @Override
    public int fuelCost() {
        return wrapper.fuelCost() + 10;
    }
}
