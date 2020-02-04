package templateMethod;

public class AutomaticTransmissionCarStartingSequence {public void startTheCar(){
    fastenSeatsBelts();
    startTheIgnition();
    setTheGear();
    go();
}

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void setTheGear() {
        System.out.println("");
    }

    private void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

    private void fastenSeatsBelts() {
        System.out.println("Zapinamy pas");
    }
}
