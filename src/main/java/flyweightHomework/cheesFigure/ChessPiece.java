package flyweightHomework.cheesFigure;

import flyweightHomework.Colour;
import flyweightHomework.ColourRepository;

public abstract class ChessPiece {

    private String name;
    private String numberPosition;
    private String letterPosition;
    private Colour colour;

    public ChessPiece(String name, String numberPosition, String letterPosition, String colour) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (colour.toLowerCase()){
            case "black":
                this.colour= ColourRepository.getBlack();
                break;
            case "white":
                this.colour=ColourRepository.getWhite();
                break;
            default:
                throw new UnsupportedOperationException("zla nazwa koloru");
        }
    }

    public Colour getColour() {
        return colour;
    }
}
