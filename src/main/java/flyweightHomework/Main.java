package flyweightHomework;

import flyweightHomework.cheesFigure.*;

public class Main {
    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek","7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek","2","a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
        //exactly same color object is used
        System.out.println(blackPawn.getColour()==blackQueen.getColour());
        System.out.println(whitePawn.getColour()==whiteQueen.getColour());
    }
}
