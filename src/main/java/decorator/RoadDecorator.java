package decorator;

public class RoadDecorator extends TerrainDecorator {
    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return super.fuelCost()-10;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "przez ktory przebiega droga";
    }
}
