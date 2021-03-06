package factoryHomework.units;

public class CommonwealthFactory implements Factory {


    @Override
    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel){
            case X5:
                return new BMW(2.0,"diesel", "2016", "LEFT");
            case E60:
                return new BMW(2.8,"petrol", "2018", "LEFT");
            default:
                throw new UnsupportedOperationException("Nie ma tekiego modelu");
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel){
            case FIESTA:
                return new Ford(1.0,"petrol", "2020", "LEFT");
            case MUSTANG:
                return new BMW(5.7,"petrol", "2015", "LEFT");
            default:
                throw new UnsupportedOperationException("Nie ma tekiego modelu");
        }
    }


}
