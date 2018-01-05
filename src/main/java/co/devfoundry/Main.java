package co.devfoundry;

import co.devfoundry.units.*;

public class Main {

    public static void main(String[] args) {

        Factory factory = new InfantryUnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

    }

}
