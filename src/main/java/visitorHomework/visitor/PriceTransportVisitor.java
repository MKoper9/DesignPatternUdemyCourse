package visitorHomework.visitor;

import visitorHomework.transporting.Animal;
import visitorHomework.transporting.Person;
import visitorHomework.transporting.Shipment;

public class PriceTransportVisitor implements TransportVsitor {

    @Override
    public void visit(Animal animal) {
        double price = animal.getWeight() * 0.2;
        System.out.println(price);
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if (person.isRegularCustomer()) {
            price = price / 2;
        }
        System.out.println("Price per kilometer for a person: "
                + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if (shipment.isLarge() == true) {
            price = 3;
        }
            System.out.println("Price per kilometer for a person: " + price + " PLN");
        }
    }

