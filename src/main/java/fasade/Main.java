package fasade;

import fasade.deliverybox.DeliveryBoxFasade;

public class Main {

    public static void main(String[] args) {

        DeliveryBoxFasade deliveryBoxFasade = new DeliveryBoxFasade();
        deliveryBoxFasade.pickupPackage();

    }

}
