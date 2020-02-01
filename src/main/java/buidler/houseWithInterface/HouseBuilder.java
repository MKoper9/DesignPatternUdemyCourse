package buidler.houseWithInterface;

public interface HouseBuilder {

    void buildWalls();
    void buildWFloors();
    void buildWRooms();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildGarage();

    House getHouse();
}
