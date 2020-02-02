package flyweightHomework;

public class ColourRepository {
    private static Colour white = new Colour(0,0,0);
    private static Colour black = new Colour(255,255,255);

    public static Colour getWhite() {
        return white;
    }

    public static Colour getBlack() {
        return black;
    }
}
