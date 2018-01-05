package co.devfoundry.units;

public class InfantryUnitFactory extends Factory {

    @Override
    public Unit createUnit(UnitType unitType) {

        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(100, 0, 10);
            case SAPER:
                return new Rifleman(50, 0, 15);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

}
