package adapter.patternsAdapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice {

    UKDevice ukDevice;
    ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice device, ContinentalDevice continentalDevice) {
        this.ukDevice = device;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void on() {
           ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }
}
