package co.devfoundry;

public abstract class TerrainDecorator extends Terrain {

    protected Terrain wrapper;

    public TerrainDecorator(String description, Terrain terrain) {
        super(description);
        wrapper = terrain;
    }
}
