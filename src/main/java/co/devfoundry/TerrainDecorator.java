package co.devfoundry;

abstract public class TerrainDecorator extends Terrain {

    protected Terrain terrain;

    public TerrainDecorator(Terrain terrain) {
        super("", 0);
        this.terrain = terrain;
    }
}
