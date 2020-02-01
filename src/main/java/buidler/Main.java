package buidler;

import buidler.houseWithInsideClass.House;

public class Main {
    public static void main(String[] args) {
//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage", "roof");

        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildFloors("floors")
                .build();

        System.out.println(house);

    }
}
