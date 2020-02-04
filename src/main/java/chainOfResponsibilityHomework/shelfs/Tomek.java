package chainOfResponsibilityHomework.shelfs;

public class Tomek extends Child {

    private static final Shelf SHELF= Shelf.MEDIUM;
    public static final String NAME = "Tomek";

    public Tomek() {
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
