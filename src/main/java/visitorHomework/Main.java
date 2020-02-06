package visitorHomework;

import visitorHomework.transporting.Animal;
import visitorHomework.transporting.Person;
import visitorHomework.transporting.Shipment;
import visitorHomework.transporting.Transportable;
import visitorHomework.visitor.NameTransportVisitor;
import visitorHomework.visitor.PriceTransportVisitor;
import visitorHomework.visitor.TransportVsitor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();
        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);
        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));
        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));
    }
}
