package co.devfoundry.units;

public class UnitFactory extends Factory {

    @Override
    public Unit createUnit(UnitType unitType) {

        switch (unitType) {
            case TANK:
                return new Tank(100, 0, 20);
            case RIFLEMAN:
                return new Rifleman(25, 0, 10);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

}
