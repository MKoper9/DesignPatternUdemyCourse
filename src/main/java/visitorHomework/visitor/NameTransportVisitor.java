package visitorHomework.visitor;

import visitorHomework.transporting.Animal;
import visitorHomework.transporting.Person;
import visitorHomework.transporting.Shipment;

public class NameTransportVisitor implements TransportVsitor {

    @Override
    public void visit(Animal animal) {
        System.out.println(animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println(person.getFirstName()+" "+person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Prefix: "+shipment.getPrefix()+" SerialNumber"+shipment.getSerialNumber());
    }
}
