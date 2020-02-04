package chainOfResponsibilityHomework.shelfs;

public class Ania extends Child {

    private static final Shelf SHELF= Shelf.LOW;
    public static final String NAME = "Ania";

    public Ania() {
    }

    @Override
    public void processRequest(MotherRequest message) {
        if (SHELF == message.getShelf()) {
            System.out.println(NAME+" make: " + message.getContent());
        } else {
            getTallerChild().processRequest(message);
        }
    }

}
