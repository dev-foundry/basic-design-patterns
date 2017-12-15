package co.devfoundry.house;

public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    public void buildWalls() {
        this.house.setWalls("big walls");
    }

    public void buildFloors() {
        this.house.setFloors("big floors");
    }

    public void buildRooms() {
        this.house.setRooms("big rooms");
    }

    public void buildRoof() {
        this.house.setRoof("big roof");
    }

    public void buildWindows() {
        this.house.setWindows("big windows");
    }

    public void biuldDoors() {
        this.house.setDoors("big doors");
    }

    public void buildGarage() {
        this.house.setGarage("big garage");
    }

    public House getHouse() {
        return house;
    }

}
