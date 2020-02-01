package buidler.houseWithInterface;

public class BigHouseBuilder implements HouseBuilder{

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        house.setWalls("Big Walls");
    }

    @Override
    public void buildWFloors() {
        house.setFloors("Big Floors");
    }

    @Override
    public void buildWRooms() {
        house.setRooms("Big Rooms");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Big Roof");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Big Windows");
    }

    @Override
    public void buildDoors() {
        house.setDoors("Big Doors");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Big Garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
