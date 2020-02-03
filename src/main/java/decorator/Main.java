package decorator;

public class Main {
    public static void main(String[] args) {
        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
//        Terrain terrain2 = new SwampPlain();
        Terrain terrain2 = new RoadDecorator(new Plain());
//        Terrain terrain3 = new SwampForrestPlain();
        Terrain terrain3 = new SwampDecorator(new Hill());
        System.out.println("RoadPlain "+terrain2.fuelCost());
    }

}
