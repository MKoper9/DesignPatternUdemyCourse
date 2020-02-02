package factoryHomework;

import factoryHomework.units.*;

public class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.FIESTA);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
