package co.devfoundry;

public class RoadDecorator extends TerrainDecorator{

    public RoadDecorator(String description, Terrain terrain) {
        super(description, terrain);
    }

    @Override
    public int fuelCost() {
        return wrapper.fuelCost() / 2;
    }
}
