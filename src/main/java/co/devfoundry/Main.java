package co.devfoundry;

public class Main {

    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new ForestHill();
        Terrain terrain2 = new SwampPlain();
        Terrain terrain3 = new SwampForrestPlain();
    }

}
