package pattern;

import pattern.patternsAdapter.ContinentalDevice;
import pattern.patternsAdapter.ContinentalSocket;
import pattern.patternsAdapter.UKDevice;
import pattern.patternsAdapter.UKSocket;

public class Main {
    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice(){
            public void on(){
                System.out.println("Play music");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("Burn London");
            }
        };

        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        continentalSocket.plugIn(ukRadio);
    }
}