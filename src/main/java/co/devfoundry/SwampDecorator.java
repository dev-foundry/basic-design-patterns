package co.devfoundry;

public class SwampDecorator extends TerrainDecorator {

    public SwampDecorator(String description, Terrain terrain) {
        super(description, terrain);
    }

    @Override
    public int fuelCost() {
        return wrapper.fuelCost() * 2;
    }
}
