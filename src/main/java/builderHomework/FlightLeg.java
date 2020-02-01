package builderHomework;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder flightLegBulider) {
        this.from=flightLegBulider.from;
        this.to=flightLegBulider.to;
        this.price=flightLegBulider.price;
        this.delayed=flightLegBulider.delayed;

    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public int getPrice() {
        return price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private final boolean delayed;
        private int price;


        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed=false;
        }

        public FlightLegBuilder price(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if(this.price==0)
            {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }

            return new FlightLeg(this);
        }

    }
}
