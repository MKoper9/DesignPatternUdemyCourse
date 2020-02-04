package templateMethod;

public class ClassicCarStartSequence {

    public void startTheCar(){
        fastenSeatsBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    private void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

    private void fastenSeatsBelts() {
        System.out.println("Zapinamy pas");
    }
}
