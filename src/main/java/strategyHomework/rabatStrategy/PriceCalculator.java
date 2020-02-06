package strategyHomework.rabatStrategy;

public class PriceCalculator {

    private int price;
    private boolean isSignedUpForNewsletter;
    private PricingStrategy pricingStrategy;


    public void calculate(int price, boolean isSignedUpForNewsletter)
    {
        pricingStrategy.calculatePrice(price,isSignedUpForNewsletter);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSignedUpForNewsletter() {
        return isSignedUpForNewsletter;
    }

    public void setSignedUpForNewsletter(boolean signedUpForNewsletter) {
        isSignedUpForNewsletter = signedUpForNewsletter;
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
