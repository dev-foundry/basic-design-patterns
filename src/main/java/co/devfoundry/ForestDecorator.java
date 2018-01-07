package co.devfoundry;

public class ForestDecorator extends TerrainDecorator {


    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() + 5;
    }
}
