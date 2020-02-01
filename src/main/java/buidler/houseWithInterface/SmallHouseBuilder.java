package buidler.houseWithInterface;

public class SmallHouseBuilder implements HouseBuilder{

private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("small Walls");
    }

    @Override
    public void buildWFloors() {
        this.house.setFloors("small Floors");
    }

    @Override
    public void buildWRooms() {
        this.house.setRooms("small Rooms");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("small Roof");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("small Windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("small doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("small Garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
