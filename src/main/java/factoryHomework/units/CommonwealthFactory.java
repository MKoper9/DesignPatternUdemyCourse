package factoryHomework.units;

public class CommonwealthFactory implements Factory {
    @Override
    public Car buildBMW(BMW bmw) {
    return null;}

    @Override
    public Car buildFord(Ford ford) {
        return null;
    }

    @Override
    public String getSteeringWheelPosition() {
        return "LEFT";
    }


}
