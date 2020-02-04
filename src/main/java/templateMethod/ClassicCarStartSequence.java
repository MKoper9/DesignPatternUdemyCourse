package templateMethod;

public class ClassicCarStartSequence extends CarStartingSequence {

    public void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    public void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

}
