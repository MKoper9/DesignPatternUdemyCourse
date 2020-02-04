package chainOfResponsibilityHomework.shelfs;

public class MotherRequest {

    private Shelf shelf;
    private String content;

    public MotherRequest(Shelf shelf, String content) {
        this.shelf = shelf;
        this.content = content;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public String getContent() {
        return content;
    }
}
