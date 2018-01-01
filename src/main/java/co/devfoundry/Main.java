package co.devfoundry;

public class Main {

    public static void main(String[] args) {
        generateMap();

    }

    private static void generateMap() {
        Terrain location = new ForestDecorator("Zalesione wzgorze", new Hill());
        Terrain swampForestHill = new SwampDecorator("Bagniste, zalesione wzgorze", location);

        System.out.println(location.getDescription() + " " + location.fuelCost());
        System.out.println(swampForestHill.getDescription() + " " + swampForestHill.fuelCost());

        Terrain location2 = new RoadDecorator("Droga przez zalesiona rownine", new ForestDecorator("Lesista rownina", new Plain()));

        System.out.println(location2.getDescription() + " " + location2.fuelCost());
    }

}
