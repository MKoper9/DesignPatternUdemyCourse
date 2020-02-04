package chainOfResponsibilityHomework.shelfs;

public class Antek extends Child {

    private static final Shelf SHELF= Shelf.HIGH;
    public static final String NAME = "Antek";

    public Antek() {
    }

    @Override
    public void processRequest(MotherRequest message) {
        if (SHELF == message.getShelf()) {
            System.out.println(NAME+" make: " + message.getContent());
        } else {
            System.out.println("Bad CODE or bad reciepient");
        }
    }

}
