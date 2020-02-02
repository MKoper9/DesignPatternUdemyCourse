package pattern;

import pattern.patternsAdapter.*;

public class Main {
    public static void main(String[] args) {

        ContinentalSocket continentalSocket = new ContinentalSocket();

        UKSocket ukSocket = new UKSocket();

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("Burn London");
            }
        };

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void on() {
                System.out.println("London calling from European Union");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio, continentalRadio);
        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);

    }
}
