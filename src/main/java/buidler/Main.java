package buidler;

import buidler.houseWithInsideClass.House;
import buidler.houseWithInterface.BigHouseBuilder;
import buidler.houseWithInterface.HouseDirector;
import buidler.houseWithInterface.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {
//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage", "roof");

        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildFloors("floors")
                .build();

        System.out.println(house);


        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        

    }
}
